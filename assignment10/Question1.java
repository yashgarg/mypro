import java.io.*;
import java.io.FileReader;
class Question1 {
  public static void main(String[] args) throws IOException {
    File mydir=new File("My Folder/text/Filehandling");
    mydir.mkdirs();
    File f1=new File(mydir,"Hello File.txt");
    boolean result=f1.createNewFile();
    System.out.println("Is Created?:"+((result)?"Yes":"No"));
      FileReader reader = new FileReader("MY Folder/text/Filehandling/Hello File.txt");
      int character;
      while ((character = reader.read()) != -1) {
                System.out.print((char) character);}
                System.out.print("\n");
            reader.close();
     System.out.println("FileAbsolutepath:"+f1.getAbsolutePath());
}
}