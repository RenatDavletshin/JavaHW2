import java.io.*;
 
public class task_2 {
  
    public static void main(String[] args) {
          
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt")))
        {
            for (int i = 0; i < 100; i++) {
            String text = "TEST\n";
            bw.write(text);
            }
        }
        catch(IOException ex){
              
            System.out.println(ex.getMessage());
        } 
    } 
}