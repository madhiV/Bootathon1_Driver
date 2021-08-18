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

        lbl1.setBounds(10,10,250,70);
        lbl2.setBounds(10,80,250,70);

        txtFld1.setBounds(260,10,250,70);
        txtFld2.setBounds(260,80,250,70);
        txtFld2.setEchoChar('*');
        txtFld2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                login(txtFld1.getText(),txtFld2.getText());
            }
        });

        btn1.setBounds(260,160,250,60);
        btn1.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                login(txtFld1.getText(),txtFld2.getText());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        add(lbl1);
        add(lbl2);
        add(txtFld1);
        add(txtFld2);
        add(btn1);
    }
    public boolean login(String username,String password){
        return true;
    }
}
