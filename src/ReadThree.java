
import java.io.FileInputStream;

public class ReadThree {

    public static void main(String[] args) {
        try (FileInputStream fis=new FileInputStream("e:/data/info.txt")) {
            //System.out.println(fis.available());
            System.out.println((char)fis.read());//A->B
            System.out.println((char)fis.read());//B->C
            fis.skip(3);//C,D,E->F
            System.out.println((char)fis.read());//F
            System.out.println((char)fis.read());//G->H
            fis.skip(4);//H,I,J,K->L
            System.out.println((char)fis.read());
            System.out.println((char)fis.read());
            
            //System.out.println(fis.available());
        }catch(Exception e){
            System.out.println("Something Wrong");
        }

    }
}
