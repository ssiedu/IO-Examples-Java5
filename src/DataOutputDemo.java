
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputDemo {
    public static void main(String[] args) throws Exception {
        
        int eno=5001;
        double sal=25000.50;
        boolean married=true;
        FileOutputStream fos=new FileOutputStream("e:/data/empdata.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeInt(eno);
        dos.writeDouble(sal);
        dos.writeBoolean(married);
        dos.close();
        fos.close();
        System.out.println("Data Stored");
        
    }
}
