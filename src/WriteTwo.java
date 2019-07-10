
import java.io.FileOutputStream;


public class WriteTwo {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos=new FileOutputStream("e:/data/myfile.txt");
            String s="this text we are writing to a file using java code";
        byte b[]=s.getBytes();
        //fos.write(b);
        fos.write(b, 5, 20);
        
        fos.flush();
        fos.close();
        System.out.println("DATA STORED");
        
    }
}
