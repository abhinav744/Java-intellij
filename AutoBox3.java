public class AutoBox3 {
    public static void main(String args[]){
        Integer iOb,iOb2;
        int i;

        iOb=100;
        System.out.println("Original value of iOb: "+iOb);
        ++iOb;
        System.out.println("After ++iob: "+iOb);
        iOb2=iOb+(iOb/3);
        System.out.println("iOb2 afer expression: "+iOb2);
        i=iOb+(iOb/3);
        System.out.println("i after expression: "+i);
    }
}
