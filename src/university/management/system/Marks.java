package university.management.system;
import javax.swing.*;
//import javax.swing.border.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class Marks extends JFrame implements ActionListener{
    
    JButton back;
    JLabel roll_no;
    String roll_number;
    Marks(String rollno){
        this.roll_number = rollno;
        setSize(500 , 600);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        
//        ### Add heading label  ###
        JLabel heading = new JLabel("Delhi Technical Univeristy");
        heading.setBounds(120 , 30 , 300 , 30);
        heading.setFont(new Font("Tahoma" , Font.BOLD , 20));
        add(heading);
        
        
//        ### add result year label ###
        JLabel yearheading = new JLabel("Result for Exam 2023");
        yearheading.setBounds(120 , 70 , 300 , 30);
        yearheading.setFont(new Font("Raleway" , Font.BOLD , 20));
        add(yearheading);
        
//        ### add roll number filed ###
        JLabel rollnumber = new JLabel("Roll Number : ");
        rollnumber .setBounds(50 , 150 , 150 , 30);
        rollnumber.setFont(new Font("Raleway" , Font.PLAIN , 20));
        add(rollnumber);
        
        
//        ### add roll number dunamic filed ###
        roll_no = new JLabel(roll_number);
        roll_no.setBounds(200 , 150 , 150 , 30);
        roll_no.setFont(new Font("Raleway" , Font.PLAIN , 20));
        add(roll_no);
        
//        ### add display label ###
        JLabel sub1 = new JLabel();
        sub1.setBounds(80 , 230 , 300 , 30);
        sub1.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(sub1);
        
        
        JLabel sub2 = new JLabel();
        sub2.setBounds(80 , 270 , 300 , 30);
        sub2.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(sub2);
        
        
        JLabel sub3 = new JLabel();
        sub3.setBounds(80 , 310 , 300 , 30);
        sub3.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(sub3);
        
        JLabel sub4 = new JLabel();
        sub4.setBounds(80 , 340 , 300 , 30);
        sub4.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(sub4);
        
        JLabel sub5 = new JLabel();
        sub5.setBounds(80 , 380 , 300 , 30);
        sub5.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(sub5);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from subject where roll_no = '"+roll_number+"' ");
            while(rs.next()){
                sub1.setText(rs.getString("subject1"));
                sub2.setText(rs.getString("subject2"));
                sub3.setText(rs.getString("subject3"));
                sub4.setText(rs.getString("subject4"));
                sub5.setText(rs.getString("subject5"));
                
            }
            ResultSet rs1 = c.s.executeQuery("select * from marks where roll_no = '"+roll_number+"' ");
            while(rs1.next()){
                sub1.setText(sub1.getText() + "   ------------   " + rs1.getString("marks1"));
                sub2.setText(sub2.getText() + "   ------------   " + rs1.getString("marks2"));
                sub3.setText(sub3.getText() + "   ------------   " + rs1.getString("marks3"));
                sub4.setText(sub4.getText() + "   ------------   " + rs1.getString("marks4"));
                sub5.setText(sub5.getText() + "   ------------   " + rs1.getString("marks5"));
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
//        ## Add back button ###
        
        back = new JButton("Back");
        back.setBounds(290 , 450 , 100 , 30 );
        back.setFont(new Font("Tahoma" , Font.PLAIN , 17));
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        setVisible(true);
        
    }
    
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    
    public static void main(String[] args){
        new Marks("");
    }
}