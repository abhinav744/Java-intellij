interface MyIf{
    int getNumber();

    default String getString(){
        return "Default string";
    }
}

class MyIfImp implements MyIf{
    @Override
    public int getNumber() {
        return 100;
    }
}
public class DefaultMethodDemo {
    public static void main(String args[]){
        MyIfImp obj=new MyIfImp();
        System.out.println(obj.getNumber());
        System.out.println(obj.getString());
    }
}
