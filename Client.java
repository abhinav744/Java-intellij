public class Client implements Callback{

    @Override
    public void callback(int param) {
        System.out.println("Callback called with "+param);
    }

    void nonInfaceMeth(){
        System.out.println("Classes that implement interfaces " +
                "may also define other members, too.");
    }
}
