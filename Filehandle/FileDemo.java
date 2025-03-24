import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class FileDemo {

    public static void main(String[] args) throws IOException {
        File f = new File("test.txt");
        FileWriter fw = new FileWriter(f, true);
        
        BufferedWriter bw = new BufferedWriter(fw);
        
        Random r = new Random();
        int data;
        for(int i = 1; i <= 100; i++){
            data = r.nextInt(10000, 100000);                       
            bw.write(String.valueOf(data));
            bw.newLine();
        }
        bw.flush();
        

        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        int arr[] = new int[100];
        int index = 0;
        // to read entire data from text file
        while (true) {
            String line = br.readLine();
            if(line == null){
                break;
            }
            else{
                arr[index] = Integer.parseInt(line);
                index++;
            }
        }

        

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Maximum salary paid = " + arr[arr.length-1]);
        System.out.println("Minimum salary paid = " + arr[0]);
    }
}