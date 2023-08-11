package university.management.system;
import javax.swing.*;
import java.awt.*;

public class About extends JFrame{
    
    About(){
        setSize(600 , 600);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        
//        ### Add image frame ###
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(260 , 50 , 300 , 200 );
        add(image);
        
        
//        ### add heading label ###
        JLabel heading = new JLabel("<html>University <br> Management<br>System</html>");
        heading.setBounds(50 , 30 , 200 , 200);
        heading.setFont(new Font("Tahoma" , Font.BOLD , 30));
        add(heading);
        
        
//        ### add develop_by heading label ###
        JLabel develop_by = new JLabel("Develop by : Future Coder");
        develop_by.setBounds(50 , 300 , 300 , 30);
        develop_by.setFont(new Font("Tahoma" , Font.BOLD , 20));
        add(develop_by);
        
        
//        ### add code  heading label ###
        JLabel code = new JLabel("Code : AP001  ");
        code.setBounds(50 , 350 , 300 , 30);
        code.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(code);
        
        
//        ### add contact  heading label ###
        JLabel contact = new JLabel("Contact : futurecoder404@gmail.com ");
        contact.setBounds(50 , 420 , 400 , 30);
        contact.setFont(new Font("Raleway" , Font.PLAIN , 20));
        add(contact);

        
        
        
        
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        new About();
    }
}
