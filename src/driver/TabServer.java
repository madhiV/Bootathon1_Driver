package driver;
import javax.swing.*;
import java.awt.*;
import java.awt.Event;
public class TabServer extends JTabbedPane{
    JPanel login,signup,acceptRide,ProvideFeedback;
    TextField txtFld1,txtFld2;
    Label lbl1,lbl2,lbl3;
    TabServer(){
        setBounds(10,10,1000,2000);
        setVisible(true);
        setLayout(new BorderLayout());
        setFont(new Font("Times new roman",Font.BOLD,18));
    }
}
