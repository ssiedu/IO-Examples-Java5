
import java.io.File;


public class FileDemo {
    public static void main(String[] args) {

        File f=new File("e:/javaprog");
        String items[]=f.list();
        
        for(String item:items){
            System.out.println(item);
        }
        
        
        
    }
}
