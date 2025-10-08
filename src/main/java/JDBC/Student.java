package JDBC;
import java.sql.*;
import  java.util.*;
public class Student {
    public static void main(String[] args) throws Exception{
        String url="jdbc:mysql://localhost:3306/studDB";
        String USER = "root";
        String PASSWORD = "7010";
        Scanner t=new Scanner(System.in);
        try(Connection con= DriverManager.getConnection(url,USER,PASSWORD)){
            //create
            String table="Create table if not exists students (id int primary key AUTO_INCREMENT,name varchar(20) not null,marks int not null);";
            Statement st=con.createStatement();
            st.execute(table);
            System.out.println("Table created successfully");
            // Insert
            while(true){
                System.out.println("1-insert");
                System.out.println("2-update");
                System.out.println("3-delete");
                System.out.println("4-select");
                System.out.println("5-exit");
                System.out.println("----------------");
                int c=t.nextInt();
                switch (c){
                    case 1:
                        System.out.println("Enter your name");
                        String name=t.next();
                        System.out.println("Enter your total mark out of 500");
                        int mark=t.nextInt();

                        String insert="insert into students(name,marks) values(?,?);";
                        try(PreparedStatement p=con.prepareStatement(insert)){
                            p.setString(1,name);
                            p.setInt(2,mark);
                            int rows=p.executeUpdate();
                            if(rows>0){
                                System.out.println("Record inserted successfully");
                            }

                        }
                        catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                        break;
                        //update
                    case 2:
                        System.out.println("Enter the id that needed to be changed");
                        int id=t.nextInt();
                        System.out.println("Enter the new name");
                        String uname=t.next();
                        System.out.println("Enter the new mark");
                        int umark=t.nextInt();
                        String update="update students set name=?, marks=? where id=?";
                        try(PreparedStatement p=con.prepareStatement(update)){
                            p.setString(1,uname);
                            p.setInt(2,umark);
                            p.setInt(3,id);
                            int rows=p.executeUpdate();
                            if(rows>0){
                                System.out.println("Record updated successfully");
                            }
                            else {
                                System.out.println("❌ No record found with ID " + id);
                            }

                        }
                        catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                        break;
                        //delete
                    case 3:
                        System.out.println("Enter the id that needed to be deleted");
                        int d_id=t.nextInt();
                        String delete="delete from students where id=?;";
                        try(PreparedStatement p=con.prepareStatement(delete)){
                            p.setInt(1,d_id);
                            int rows=p.executeUpdate();
                            if(rows>0){
                                System.out.println("Record Deleted successfully");
                            }
                            else {
                                System.out.println("❌ No record found with ID " + d_id);
                            }

                        }
                        catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                        break;
                        //select
                    case 4:
                        System.out.println("Student table");
                        String sql="select * from students;";
                        try(PreparedStatement r=con.prepareStatement(sql);
                            ResultSet rs=r.executeQuery();
                        ) {
                            System.out.println("id\tname\tmarks");
                            while(rs.next()){
                                System.out.print(rs.getString("id")+"\t");
                                System.out.print(rs.getString("name")+"\t");
                                System.out.print(rs.getString("marks")+"\t");
                                System.out.println();

                            }
                        }
                        catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 5:
                        System.out.println("Exiting program...");
                        st.close();
                        return;

                    default:
                        System.out.println("❌ Invalid choice, try again!");


                }

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
