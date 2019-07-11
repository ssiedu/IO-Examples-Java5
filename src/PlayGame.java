
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class PlayGame {
    public static void main(String[] args) throws Exception {

        int choice=Integer.parseInt(args[0]);
        int xMove=Integer.parseInt(args[1]);
        int yMove=Integer.parseInt(args[2]);
        
        Game g=null;
        
        if(choice==1){//start a new game
            g=new Game();//x=0,y=0
        }else{
            //g=read-the-object-from-a-file 
            //which was stored at the end of last game
            FileInputStream fis=new FileInputStream("e:/data/lastgame.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            g=(Game) ois.readObject();
            ois.close();
            fis.close();
        }
        
        g.moveH(xMove);
        g.moveV(yMove);
        g.showPos();
        
        System.out.println("Saving Current Game....");
        
        FileOutputStream fos=new FileOutputStream("e:/data/lastgame.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(g);
        oos.close();
        fos.close();
        
        System.out.println("Game Stored ........");

        System.out.println("Quiting Game.........");
        
    }
}
