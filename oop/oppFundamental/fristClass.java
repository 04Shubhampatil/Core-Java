class pen{

    String color;
    String Type;

    public void Write(){
   System.out.println(this.color);
    }

}

public class fristClass{
    public static void main(String[] args) {

        pen pen1 = new pen(); // object
        pen1.color = "Black";
        pen1.Type = "Ballpoint";

        pen pen2 = new pen();
        pen2.color = "Blue";
        pen2.Type = "Marker";
        
        pen1.Write();
        pen2.Write();
        
    }
}