enum Apple1 {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class EnumDemo2 {
    public static void main(String args[]){
        Apple1 ap;
        System.out.println("Here all enum constant");
        //use values()
        Apple1 allapples[]=Apple1.values();
        for(Apple1 a: allapples)
            System.out.println(a);
        System.out.println();
        //use valuOf()
        ap=Apple1.valueOf("Winesap");
        System.out.println("ap contains "+ap);
    }
}
