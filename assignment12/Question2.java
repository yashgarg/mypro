import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
class Question2 {

    public static void main(String args[]) throws IOException{      

        String fileInput = "C://Users//intel//Desktop//temp.txt";
        
            FileWriter fw=new FileWriter(fileInput);
            String c=("yash,Yogesh,Raj");
             fw.write(c);
         
	      fw.close();
             FileReader fz=new FileReader(fileInput);
            int character;
             while ((character = fz.read()) != -1) {
                System.out.print((char)character);}

            fz.close();
           
     }
}