package Interface.nestedinterface;

public class B implements A.nested {

    @Override
    public boolean isOdd(int n) {
        return (n&1)==1;
    }
}
