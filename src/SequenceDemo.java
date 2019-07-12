
import java.io.FileInputStream;
import java.io.SequenceInputStream;


public class SequenceDemo {
    public static void main(String[] args) throws Exception {

        FileInputStream fis1=new FileInputStream("e:/data/info.txt");
        FileInputStream fis2=new FileInputStream("e:/data/trial.txt");
        
        SequenceInputStream sis=new SequenceInputStream(fis2,fis1);
        
        while(true){
            int n=sis.read();
            if(n==-1)break;
            System.out.print((char)n);
        }
        
        
        sis.close();
        fis1.close();
        fis2.close();
        
    }
}
