
import java.io.FileWriter;


public class WriterDemo {
    public static void main(String[] args) throws Exception {

        FileWriter fw=new FileWriter("e:/data/info.txt");
        fw.write("Something New From Java Program",5,15);
        fw.close();
        System.out.println("Data Stored");
        
    }
}
