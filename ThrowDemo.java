 class ThrowDemo {
    static void demoproc(){
        try{
            throw new NullPointerException("demo");
        }catch (NullPointerException e){
            System.out.println("Caughht inside demoproc");
            throw e;
        }
    }
    public static void main(String args[]){
        try {
            demoproc();
        }catch (NullPointerException e){
            System.out.println("Reacught"+e);
        }
    }
}
