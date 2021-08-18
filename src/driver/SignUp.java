package driver;
import javax.swing.*;
import java.awt.Event.*;
import java.awt.*;
public class SignUp extends JPanel{
    Label lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,lbl9,lbl10,lbl11,lbl12,lbl13;
    TextField txtFld1,txtFld2,txtFld3,txtFld4,txtFld5,txtFld6,txtFld7,txtFld8,txtFld9,txtFld10,txtFld12,txtFld11;
    JComboBox list1;
    Button btn1;
    SignUp(){
        setBounds(0,0,2000,1900);
        setFont(new  Font("Times New Roman",Font.BOLD,19));
        setVisible(true);
        setLayout(null);

        //Label
        lbl1=new Label("FirstName : ");
        lbl2=new Label("LastName : ");
        lbl3=new Label("Gender : ");
        lbl4=new Label("Date of Birth : ");
        lbl5=new Label("Car Details : ");
        lbl6=new Label("Driving Experience : ");
        lbl7=new Label("Address : ");
        lbl8=new Label("City : ");
        lbl9=new Label("Nationality : ");
        lbl10=new Label("Mobile Number : ");
        lbl11=new Label("Email : ");
        lbl12=new Label("Password : ");
        lbl13=new Label("Re-enter Password : ");

        //TextField
        txtFld1=new TextField();
        txtFld2=new TextField();
        txtFld3=new TextField();
        txtFld4=new TextField();
        txtFld5=new TextField();
        txtFld6=new TextField();
        txtFld7=new TextField();
        txtFld8=new TextField();
        txtFld9=new TextField();
        txtFld10=new TextField();
        txtFld11=new TextField();
        txtFld12=new TextField();

        //SetBounds
    }
}
