package university.management.system;
import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.sql.*;
import java.awt.event.*;


public class TeacherLeave extends JFrame implements ActionListener{
    
    Choice ch , duration;
    JDateChooser dateChooser;
    JButton submit , back;
    
    TeacherLeave(){
        
        setSize(500 , 600);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
//        ### Add heading ###
        JLabel heading = new JLabel("Leave Form (Teacher)");
        heading.setBounds(120 , 30 , 300 , 30);
        heading.setFont(new Font("Raleway" , Font.BOLD , 25));
        add(heading);


//        #### Add search by roll no label ###
        JLabel search = new JLabel("Employee ID.");
        search.setBounds(50 , 100  ,170 , 30);
        search.setFont(new Font("Tahoma", Font.PLAIN , 20));
        add(search);
        
        ch = new Choice();
        ch.setBounds(50 , 150 , 200 , 40);
        ch.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(ch);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from addteacher");
            while(rs.next()){
                ch.add(rs.getString("employee_id"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }

            
//        ### Add date of leave Label###

        JLabel dateOfleave = new JLabel("Date of Leave :  ");
        dateOfleave.setBounds(50 , 230 , 200 , 30);
        dateOfleave.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(dateOfleave);
        
//        ### Add calendar jar file ###
        dateChooser = new JDateChooser();
        dateChooser.setBounds(50 , 270 , 200 , 30);
        dateChooser.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(dateChooser);
        
        
//        #### Add duration Label ####
        
        JLabel durationOfLeave = new JLabel("Duration :  ");
        durationOfLeave.setBounds(50 , 330 , 200 , 30);
        durationOfLeave.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(durationOfLeave);
        
        
        duration = new Choice();
        duration.add("Half day");
        duration.add("Full day");
        duration.setBounds(50 , 370 , 200 , 30);
        duration.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(duration);
        
        
        
        //        ### Add sumbit button ###
        submit = new JButton("Submit");
        submit.setBounds(100 , 450 , 100 , 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        submit.addActionListener(this);
        add(submit);
        
        
//        ### Add back button ###
        back = new JButton("Back");
        back.setBounds(250 , 450 , 100 , 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        back.addActionListener(this);
        add(back);
        
        
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String rollno = ch.getSelectedItem();
            String date = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
            String leaveduration = duration.getSelectedItem();
            
            if(date.equals("")){
                JOptionPane.showMessageDialog(null, "Date is Required");
            }
            else{
               try{
                    Conn c = new Conn();
                    String query = "insert into teacherleave values('"+rollno+"','"+date+"','"+leaveduration+"')";
                
                    c.s.executeUpdate(query);
                
                    JOptionPane.showMessageDialog(null, "Teacher Leave Added Successfully");
                    setVisible(false);
                
                }catch(Exception e){
                    e.printStackTrace();
                } 
            }
            
            
        }
        else{
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new TeacherLeave();
    }
}
