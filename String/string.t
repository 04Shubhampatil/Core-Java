public class StrDemo {
    public static void main(String[] args) {
        // String str = "welcome to TPS";        
        String str = new String("Welcome to TPS");
        System.out.println(str);



        System.out.println("Length of string = " + str.length());
        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
        String name = "Sunny";
        String surname = " Jain";
        System.out.println(name.concat(surname));
        char ch = 'c';
        System.out.println("index of " + ch + " is " + str.lastIndexOf(ch));




        String str2 = "sunny";
        String s = str2.toUpperCase();
        System.out.println(str2);
        System.out.println(s);




        String a = new String("indore"); 
        String b = new String("bhopal"); 
        
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

    }
}


---------------------------------------------------------------------------------------



//concatenation

String fristName = "shubham";
        String lastName = "patil";

        String fullName = fristName + " @ " + lastName;

        System.out.print(fullName);
        System.out.print(fullName.length());



---------------------------------------------------------------------------------------

//CharAt Method