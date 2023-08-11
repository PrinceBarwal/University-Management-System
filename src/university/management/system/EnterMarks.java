package university.management.system;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class EnterMarks extends JFrame{
    
    Choice ch;
    
    EnterMarks(){
        setSize(1000,650);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
//        #### add image ####
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/exam.jpg"));
        Image i2 = i1.getImage().getScaledInstance(450, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(500 , 70 , 450,400);
        add(image);
        
        
//        #### Add heading ###
        JLabel heading = new JLabel("Enter Marks of Student");
        heading.setBounds(100 , 30 , 300 , 30);
        heading.setFont(new Font("Raleway" , Font.BOLD , 25));
        add(heading);
        
        
//        ### add search bu roll number filed ####
        JLabel search_rollno = new JLabel("Search Roll Number :");
        search_rollno.setBounds(50 , 100 , 200 , 30);
        search_rollno.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(search_rollno);
        
//        ### dynamic add roll number if student ###
        ch = new Choice();
        ch.setBounds(260 , 100 , 200 , 30);
        ch.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(ch);
        
        try{
            Conn c = new Conn();
//            String rollno = (String)ch.getSelectedItem();
            
            ResultSet rs = c.s.executeQuery("select * from addstudent ");
            while(rs.next()){
                ch.add(rs.getString("roll_no"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
//        ### add semester combo filed ####
        JLabel semester = new JLabel("Select Semester : ");
        semester.setBounds(50 , 150 , 200,30);
        semester.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(semester);
        
        String[] semesterValues = {"semester 1","semester 2","semester 3","semester 4","semester 5","semester 6","semester 7","semester 8",};
        JComboBox semesterCombo = new JComboBox(semesterValues);
        semesterCombo.setBounds(260 , 150 , 200 , 30);
        semesterCombo.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        semesterCombo.setBackground(Color.WHITE);
        add(semesterCombo);
        
        
//        ### add tabel label ###
        JLabel enter_subject = new JLabel("Enter Subject");
        enter_subject.setBounds(70 , 240 , 200 , 30);
        enter_subject.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(enter_subject);
        
        
//        ### add subject text filed ###
        JTextField sub1 = new JTextField();
        sub1.setBounds(30 , 300 , 200 , 30 );
        sub1.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(sub1);
        
        
        JTextField sub2 = new JTextField();
        sub2.setBounds(30 , 330 , 200 , 30 );
        sub2.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(sub2);
        
        JTextField sub3 = new JTextField();
        sub3.setBounds(30 , 360 , 200 , 30 );
        sub3.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(sub3);
        
        JTextField sub4 = new JTextField();
        sub4.setBounds(30 , 390 , 200 , 30 );
        sub4.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(sub4);
        
        JTextField sub5 = new JTextField();
        sub5.setBounds(30 , 420 , 200 , 30 );
        sub5.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(sub5);
        
        
//        ### add tabel label ###
        JLabel enter_marks = new JLabel("Enter Marks");
        enter_marks.setBounds(270 , 240 , 200 , 30);
        enter_marks.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(enter_marks);
        
        
//        ### add marks text filed ###
        JTextField mark1 = new JTextField();
        mark1.setBounds(230 , 300 , 200 , 30 );
        mark1.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(mark1);
        
        
        JTextField mark2 = new JTextField();
        mark2.setBounds(230 , 330 , 200 , 30 );
        mark2.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(mark2);
        
        JTextField mark3 = new JTextField();
        mark3.setBounds(230 , 360 , 200 , 30 );
        mark3.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(mark3);
        
        JTextField mark4 = new JTextField();
        mark4.setBounds(230 , 390 , 200 , 30 );
        mark4.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(mark4);
        
        JTextField mark5 = new JTextField();
        mark5.setBounds(230 , 420 , 200 , 30 );
        mark5.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(mark5);
        
//        ### add submit button ###
        JButton submit = new JButton("Submit");
        submit.setBounds(60 , 500 , 100 , 30);
        submit.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        add(submit);
        
        
//        ### add cancel button ###
        JButton cancel = new JButton("Cancel");
        cancel.setBounds(260 , 500 , 100 , 30);
        cancel.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        add(cancel);
        
        
        setVisible(true);
    }
    
    public static void main(String[] args){
        new EnterMarks();
    }
}
