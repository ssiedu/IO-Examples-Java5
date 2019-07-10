
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ReadOne {
    public static void main(String[] args) throws Exception {
        //we are reading a file (info.txt)
        //step-1 (open a stream file<->javaprogram)
        FileInputStream fis=new FileInputStream("E:\\javaprog\\StringExamples\\src\\StringConstructorsDemo.java");
        //FileInputStream fis=new FileInputStream("e:/data/info.txt");
        
        //step-2 (read the data from stream)
        
        while(true){
            int n=fis.read(); 
            if(n==-1)break;
            System.out.print((char)n);
        }
        
        System.out.println("");
        
        
    }
}
