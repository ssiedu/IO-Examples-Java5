
import java.io.DataInputStream;
import java.io.FileInputStream;


public class DataInputDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("e:/data/empdata.txt");
        //reading premitive values using DataInputStream
        DataInputStream dis=new DataInputStream(fis);
        int v1=dis.readInt();
        double v2=dis.readDouble();
        boolean v3=dis.readBoolean();
        System.out.println("ECode  : "+v1);
        System.out.println("Salary : "+v2);
        System.out.println("Married : "+v3);
        dis.close();
        fis.close();
        
        
        
        
        
    }
}
