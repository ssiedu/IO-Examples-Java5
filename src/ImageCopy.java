
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class ImageCopy {
    public static void main(String[] args) throws Exception {

        //reading the contents of an image file
        FileInputStream fis=new FileInputStream("d:/images/preview.png");
        byte b[]=new byte[fis.available()];
        fis.read(b);
        fis.close();
        
        //writing the contents of an image file to another file
        FileOutputStream fos=new FileOutputStream("e:/data/previewcopy.png");
        fos.write(b);
        fos.close();
        System.out.println("Operation Success");
    }
}
