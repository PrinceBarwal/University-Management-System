package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;




public class Login extends JFrame implements ActionListener{
    
    JTextField usertf , passwordtf;
    JButton login  , back;
    
    
    Login(){
        
        setSize(700 , 400);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
//        ####### Add Image to frame####
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400 , 50 , 200 , 200 );
        add(image);
        
//        #### Add user name filed######
        JLabel username = new JLabel("Username: ");
        username.setBounds(30 , 80 , 120 , 30);
        username.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(username);
        
//        ##### Add username text filed########
        usertf = new JTextField();
        usertf.setBounds(150 , 80 , 200 , 30);
        usertf.setFont(new Font("SAN_SARIF" , Font.PLAIN , 15));
        add(usertf);
        
        
//        ### Add Password filed#####
        JLabel password = new JLabel("Password: ");
        password.setBounds(30 , 140 , 120  ,30);
        password.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(password);
        
//        ### Add password text filed ##########
        passwordtf = new JTextField();
        passwordtf.setBounds(150 , 140 , 200 , 30);
        passwordtf.setFont(new Font("SAN_SARIF" , Font.PLAIN , 15));
        add(passwordtf);
        
        
//        ##### Add login button ####
        login = new JButton("Login");
        login.setBounds(80 , 230 , 100 , 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.setFont(new Font("Raleway" , Font.PLAIN , 20));
        login.addActionListener(this);
        add(login);
        
        //        ##### Add login button ####
        back = new JButton("Back");
        back.setBounds(220 , 230 , 100 , 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Raleway" , Font.PLAIN , 20));
        back.addActionListener(this);
        add(back);
        
        
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == login){
            Conn c = new Conn();
            String name = usertf.getText();
            String password = passwordtf.getText();
            String query = "select * from login where username = '"+name+"' and password = '"+password+"' ";
            
            try{
                
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid Username and Password");
                    setVisible(false);
                }
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            setVisible(false);
        }
    }
    
    
    public static void main(String[] args){
        new Login();
    }
}
