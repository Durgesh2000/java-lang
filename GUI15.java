import javax.swing.*;
//import java.awt.*;
import java.awt.event.*;
class MarvellousFrame
{
    public MarvellousFrame(String title)
    {
        JFrame fobj = new JFrame(title);
        fobj.setSize(500,500);
        fobj.setVisible(true);

        fobj.addWindowListener(new marvellousListrner());
    }
}


class marvellousListrner extends WindowAdapter
{
      
      public void windowClosing(WindowEvent obj)
      {
        System.exit(0);
      }
      

}       
class GUI15
{
    public static void main(String arg[])
    {
        MarvellousFrame mobj = new MarvellousFrame("Marvellous PPA41");
    }
}