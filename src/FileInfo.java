
import java.io.File;
import java.util.Date;


public class FileInfo {
    public static void main(String[] args) {
        File f1=new File("e:/data/TimeTable.xlsx");
        
        boolean b1=f1.exists();
        boolean b2=f1.isFile();
        boolean b3=f1.isDirectory();
        boolean b4=f1.isHidden();
        boolean b5=f1.canWrite();
        long size=f1.length();
        long val=f1.lastModified();
        Date dt=new Date(val);
        
        System.out.println("exists      : "+b1);
        System.out.println("isFile      : "+b2);
        System.out.println("isDirectory : "+b3);
        System.out.println("isHidden    : "+b4);
        System.out.println("canWrite    : "+b5);
        System.out.println("length      : "+size);
        System.out.println("lastModified: "+dt);
    }
}
/*
    Non-Static Methods of File class
    -------------------------------------
        long lastModified()
        boolean exists()
        boolean isFile()   
        boolean isDirectory()
        boolean isHidden()
        boolean canWrite()
        long length()
        String[] list() 

        boolean mkdir()
        boolean delete()
        boolean renameTo(File)
        boolean createNewFile()

        
    
*/
