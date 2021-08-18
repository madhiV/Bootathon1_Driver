package driver;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Login extends JPanel{
    TextField txtFld1,txtFld2;
    Label lbl1,lbl2,lbl3;
    Button btn1;
    Login(){
        setLayout(null);
        setVisible(true);
        setFont(new Font("TIMES NEW ROMAN",Font.BOLD,18));
        setBounds(0,0,1000,1900);

        //Label
        lbl1=new Label("Email/Phone Number : ");
        lbl2=new Label("Password : ");
        lbl3=new Label("Forgot password");

        //TextField
        txtFld1=new TextField();
        txtFld2=new TextField();

        //Button
        btn1=new Button("LOGIN");

        lbl1.setBounds(10,10,200,70);
        lbl2.setBounds(10,80,200,70);

        txtFld1.setBounds(210,10,200,70);
        txtFld2.setBounds(210,80,200,70);

        btn1.setBounds(210,150,200,70);

        add(lbl1);
        add(lbl2);
        add(txtFld1);
        add(txtFld2);
        add(btn1);
    }
}
