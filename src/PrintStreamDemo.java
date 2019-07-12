
import java.io.PrintStream;


public class PrintStreamDemo {
    public static void main(String[] args) throws Exception {
        PrintStream ps=new PrintStream("e:/data/psdata.txt");
        ps.print(97);
        ps.print(65);
        ps.print("hello");
        ps.print(true);
        ps.print(23.35);
        ps.close();
        System.out.println("data stored");
    }
}
