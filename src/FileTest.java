
import java.io.File;
import java.io.IOException;


public class FileTest {
    public static void main(String[] args) throws IOException {

        File f=new File("e:/data/trial.txt");
        boolean b=f.createNewFile();
        
        //File f1=new File("e:/data/info.txt");
        //File f2=new File("e:/data/demo.txt");
        //boolean b=f2.renameTo(f1);
        
        //File f=new File("e:/data/studinfo.txt");
        //boolean b=f.mkdir();
        //boolean b=f.delete();
        
        if(b){
            System.out.println("Operation Success");
        }else{
            System.out.println("Operation Failed");
        }
                
        
    }
}
