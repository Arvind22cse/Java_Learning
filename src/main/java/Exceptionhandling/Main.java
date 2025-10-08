package Exceptionhandling;

public class Main {
    public static void main(String[] args) {
        int a=10,b=0;
        try{
//            divide(a,b);
            String str="Arvind";
            if(str.equals("Arvind")) {
                throw new MyExceptions("Arvi");
            }
        }
        catch (MyExceptions e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This will always run");
        }
    }
    static void divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException ("Cannot divide by zero");
        }
        System.out.println(a/b);

    }
}
