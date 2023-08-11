package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class StudentFeeForm extends JFrame implements ActionListener{
    
    Choice ch;
    JLabel nametf , fnametf , branchtf ;
    JComboBox semesterCombo , courseCombo;
    JLabel remaning_amount ;
    JButton update , payfee , back;
    
    StudentFeeForm(){
        setSize(800 , 650);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        //        ### Add image frame ###
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/fee.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(440 , 100 , 300 ,300 );
        add(image);
        
        
//        ### add heading heading label ###
        JLabel heading = new JLabel("Student Fee Form");
        heading.setBounds(50 , 20 , 200 , 30);
        heading.setFont(new Font("Tahoma" , Font.BOLD , 20));
        add(heading);

//        ### search by roll number ###
        JLabel search = new JLabel("Search by Roll No.");
        search.setBounds(20 , 100  ,170 , 30);
        search.setFont(new Font("Tahoma", Font.PLAIN , 20));
        add(search);
        
        ch = new Choice();
        ch.setBounds(200 , 100 , 200 , 40);
        ch.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(ch);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from addstudent");
            while(rs.next()){
                ch.add(rs.getString("roll_no"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        //        ### Add name Label###

        JLabel name = new JLabel("Name :  ");
        name.setBounds(20 , 160 , 100 , 30);
        name.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(name);
        
//        #### Aadd name text filed###
        nametf = new JLabel();
        nametf.setBounds(200 , 160 , 200 , 30);
        nametf.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(nametf);
        
//        ### Add father name Label###

        JLabel fname = new JLabel("Father's Name :  ");
        fname.setBounds(20 , 220 ,200 , 30);
        fname.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(fname);
        
//        #### Aadd name text filed###
        fnametf = new JLabel();
        fnametf.setBounds(200 , 220 , 200 , 30);
        fnametf.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(fnametf);
        
//        ### Add course Label###

        JLabel course = new JLabel("Course :  ");
        course.setBounds(20 , 280 , 100 , 30);
        course.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(course);
        
//        Add Combo box for course####
        String[] courseComboValue = {"BTech" , "BBA" , "BCA" , "Bsc" , "Msc" , "MBA" , "MCA" , "MCom" , "MA" , "BA"};
        courseCombo = new JComboBox(courseComboValue);
        courseCombo.setBounds(200 , 280 , 200 , 30);
        courseCombo.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        courseCombo.setSelectedItem(null);
        courseCombo.setBackground(Color.WHITE);
        add(courseCombo);
        
//        ### Add branch  Label###

        JLabel branch = new JLabel("Branch :  ");
        branch.setBounds(20 , 340 ,200 , 30);
        branch.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(branch);
        
//        #### Aadd branch text filed###
        branchtf = new JLabel();
        branchtf.setBounds(200 , 340 , 200 , 30);
        branchtf.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(branchtf);
        
        try{
            Conn c = new Conn();
            String roll_no = (String)ch.getSelectedItem();
            
            ResultSet rs = c.s.executeQuery("select * from addstudent where roll_no = '"+roll_no+"'  ");
            
            while(rs.next()){
                nametf.setText(rs.getString("name"));
                fnametf.setText(rs.getString("father_name"));
                branchtf.setText(rs.getString("branch"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        //        ###Add choice dynamic###
        ch.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ie){
                try{
                    Conn c = new Conn();
            String roll_no = (String)ch.getSelectedItem();
            
            ResultSet rs = c.s.executeQuery("select * from addstudent where roll_no = '"+roll_no+"'  ");
            
            while(rs.next()){
                nametf.setText(rs.getString("name"));
                fnametf.setText(rs.getString("father_name"));
                branchtf.setText(rs.getString("branch"));
            }

                }catch(Exception e){
                    e.printStackTrace();
                }  
            }
        });

        //        ### add semester combo filed ####
        JLabel semester = new JLabel("Select Semester : ");
        semester.setBounds(20 , 400 , 200,30);
        semester.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(semester);
        
        String[] semesterValues = {"semester1","semester2","semester3","semester4","semester5","semester6","semester7","semester8",};
        semesterCombo = new JComboBox(semesterValues);
        semesterCombo.setBounds(200 , 400 , 200 , 30);
        semesterCombo.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        semesterCombo.setBackground(Color.WHITE);
        add(semesterCombo);
        
//        ### add total payable filed ####
        JLabel total_pay = new JLabel("Total Pay : ");
        total_pay.setBounds(20 , 460 , 200,30);
        total_pay.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(total_pay);
        
//        ### add remaning payable amount filed ####
        remaning_amount = new JLabel();
        remaning_amount.setBounds(200 , 460 , 200,30);
        remaning_amount.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(remaning_amount);
        
//        ### add update button ###
    
        update = new JButton("Update");
        update.setBounds(20 , 550 , 100 , 30);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        update.addActionListener(this);
        add(update);
        
        
//        ### Add pay fee button ###
        payfee = new JButton("Pay Fee");
        payfee.setBounds(140 , 550 , 100 , 30);
        payfee.setBackground(Color.BLACK);
        payfee.setForeground(Color.WHITE);
        payfee.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        payfee.addActionListener(this);
        add(payfee);
        
        
//        ### Add back button ###
        back = new JButton("Back");
        back.setBounds(260 , 550 , 100 , 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == update){
            String course = (String)courseCombo.getSelectedItem();
            String semester = (String) semesterCombo.getSelectedItem();
            
            try{
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery("select * from fee where course = '"+course+"' ");
                while(rs.next()){
                    remaning_amount.setText(rs.getString(semester));
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == payfee){
            String rollno = (String)ch.getSelectedItem();
            String course = (String)courseCombo.getSelectedItem();
            String semester = (String) semesterCombo.getSelectedItem();
            String total = remaning_amount.getText();
            
            try{
                Conn c = new Conn();
                String query = "insert into collegefee values('"+rollno+"','"+course+"', '"+semester+"','"+total+"')";
                
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Fee Pay Successfully ");
                setVisible(false);
                
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new StudentFeeForm();
    }
}
