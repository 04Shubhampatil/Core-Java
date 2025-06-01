public class Blocks {
    static int a;
    static{
        a=100;
        System.out.println("static block is executed..");
    }
    {
        System.out.println("non static block executed");
    }
    Blocks(){

    }
    public static void main(String[] args) {
        Blocks b = new Blocks();
        
        
    }
    
}
