
import java.io.FileInputStream;


public class ReadTwo {

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("e:/data/Trial.java");
        //reading multiple bytes
        
        //create a byte array
        
        int n=fis.available();
        
        byte b[]=new byte[n];
        
        //read the data from stream and store that to b[]
        fis.read(b);
        
        //converting the byte array to string
        String s=new String(b);
        
        System.out.println(s);
        
        
        fis.close();
        
        
        

    }
}
