package JDBC;
import java.sql.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws SQLException {

        String url="jdbc:mysql://localhost:3306/jdbc";
        String USER = "root";
        String PASSWORD = "7010";
        Scanner t=new Scanner(System.in);
        try{
        Connection con=DriverManager.getConnection(url,USER,PASSWORD);

            String insert="insert into student (roll_no,name,phone_num) values(?,?,?);";
            PreparedStatement ps=con.prepareStatement(insert);

            while(true){
                System.out.println("Enter the roll_no or give (exit) to stop: ");
                String roll=t.next();
                if(roll.equalsIgnoreCase("exit")){
                    System.out.println("Existing.....");
                    break;
                }
                System.out.println("Enter the name: ");
                String name=t.next();
                System.out.println("Enter the phone number");
                String phone=t.next();

                ps.setString(1,roll);
                ps.setString(2,name);
                ps.setString(3,phone);

                int row_inserted=ps.executeUpdate();
                if(row_inserted>0){
                    System.out.println("Result inserted successfully for "+name);
                }
                else{
                    System.out.println("Insertion failed for "+name);
                }
            }
            System.out.println("🎓 Student Table Records:");
            String sql="select * from student";
            Statement st=con.createStatement();
            ResultSet rs = st.executeQuery(sql);
//        rs.next();
//        String name=rs.getString(1);
//        System.out.println(name);
        // Step 4: Iterate through all rows
        System.out.println("Student Names:");
            System.out.println("ID\tName\t\tDepartment");
            System.out.println("----------------------------------");
        while (rs.next()) {
            String roll_nos = rs.getString("roll_no");
            String names = rs.getString("name"); // You can also use rs.getString(1)
            String phones = rs.getString("phone_num");
            System.out.print(roll_nos + "\t");
            System.out.print(names + "\t");
            System.out.print(phones + "\t");
            System.out.println();
        }
            // Step 5: Close resources
            rs.close();
            st.close();
            con.close();
        }
        catch(Exception e){
                System.out.println(e.getMessage());
            }



    }
}
