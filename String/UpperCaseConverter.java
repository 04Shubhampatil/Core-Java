

// wap to print only uppercase letters
// public class String{
//     public static void main(String[] args) {
//         String str = "Hello World";
//         for (int i = 0; i < str.length(); i++) {
//             char c = str.charAt(i);
//             if (c >= 65 && c <= 90) {
//                 System.out.print(c);
//             }
//         }
//     }
// }

// Ascii code
// A -> 65
// Z -> 90
// a -> 97
// z -> 122

//wap  strin in uppercase withou inbuilt method

public class UpperCaseConverter {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder upperCaseStr = new StringBuilder(); // Use StringBuilder for efficient string manipulation

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c)) { // Use built-in method to check if the character is lowercase
                upperCaseStr.append(Character.toUpperCase(c)); // Convert to uppercase and append
            } else {
                upperCaseStr.append(c); // Append the character as is
            }
        }

        System.out.println(upperCaseStr.toString()); // Print the result
    }

    //  wap reverce given string
    

}