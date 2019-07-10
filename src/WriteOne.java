import java.io.FileOutputStream;

public class WriteOne {
    public static void main(String[] args) throws Exception {

        //we want to write "abdc" to a file "myfile.txt"
        //step-1 (open a stream)
        //FileOutputStream fos=new FileOutputStream("e:/data/myfile.txt");
        FileOutputStream fos=new FileOutputStream("e:/data/myfile.txt",true);
        //step-2 (write the data on stream)
        fos.write(97);//e,f,g,h,i
        fos.write(98);
        fos.write(99);
        fos.write(100);
        fos.write(101);
        fos.flush();
        //step-3 (close the file
        fos.close();
        System.out.println("DATA STORED");
        
    }
}
