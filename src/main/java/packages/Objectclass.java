package packages;

public class Objectclass {
    //this is lang package
    int n;
    public Objectclass(int n) {
     this.n=n;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.n==((Objectclass)obj).n;
    }

    public static void main(String[] args) {
        Objectclass obj=new Objectclass(23);
        Objectclass obj2=new Objectclass(23);
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
        if(obj==obj2){
            System.out.println("==Equals");
        }
        if(obj.equals(obj2)){
            System.out.println(".equals,Equals");
        }
        System.out.println(obj instanceof Objectclass);
        System.out.println(obj.getClass().getName());

    }
}
