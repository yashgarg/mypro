import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
class Question1 {

    public static void main(String args[]) throws IOException{      

        String fileInput = "C://Users//intel//Desktop//temp.txt";
        String fileoutput = "C://Users//intel//Desktop//temp1.txt";
  
            FileReader fr=new FileReader(fileInput);
            FileWriter fw=new FileWriter(fileoutput);
            //FileReader fz=new FileReader(fileoutput);
            int c;
            while((c=fr.read())!=-1) {
                fw.write(c);
            }
	      fw.close();
             FileReader fz=new FileReader(fileoutput);
            int character;
             while ((character = fz.read()) != -1) {
                System.out.print((char)character);}

            fr.close();
            fz.close();
           
     }
}