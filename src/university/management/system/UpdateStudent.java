package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.util.*;
//import com.toedter.calendar.JDateChooser;
import java.util.regex.*;
import java.sql.*;

public class UpdateStudent extends JFrame implements ActionListener{
    
    JTextField   addresstf , emailidtf   , phonetf  , courseCombo , branchCombo;
//    JDateChooser dateChooser;
    JButton update , back;
    JLabel rolltf ,nametf , class12percent , fnametf ,  class10percent , aadharnotf , doblbl;
    Choice ch;
    
    
    
    UpdateStudent(){
        
        setSize(800 , 700);
        setLocationRelativeTo(null);
        setLayout(null);
        
//        ### Add heading ###
        JLabel heading = new JLabel("Update Student Details");
        heading.setBounds(250 , 20 , 500 , 40);
        heading.setFont(new Font("Raleway" , Font.BOLD , 30));
        add(heading);
        
        
//        #### Search by roll no frame ####
        JLabel search_roll = new JLabel("Search Roll No. : ");
        search_roll.setBounds(60 , 95 , 160 , 40);
        search_roll.setFont(new Font("Raleway" , Font.PLAIN , 20));
        add(search_roll);
        
//        ### Add roll no choice###ch = new Choice();
        ch = new Choice();
        ch.setBounds(250 , 100 , 200 , 40);
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
        name.setBounds(30 , 160 , 100 , 30);
        name.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(name);
        
//        #### Aadd name text filed###
        nametf = new JLabel();
        nametf.setBounds(150 , 160 , 200 , 30);
        nametf.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(nametf);
        
        
//        ### Add roll no Label###

        JLabel rollNo = new JLabel("Roll No :  ");
        rollNo.setBounds(30 , 220 , 100 , 30);
        rollNo.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(rollNo);
        
//        #### Aadd roll no filed###
        rolltf = new JLabel();
        rolltf.setBounds(150 , 220 , 200 , 30);
        rolltf.setFont(new Font("Tahoma" , Font.BOLD , 18));
        add(rolltf);
        
        
//        ### Add Address Label###

        JLabel address = new JLabel("Address :  ");
        address.setBounds(30 , 280 , 100 , 30);
        address.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(address);
        
                
//        #### Aadd address text filed###
        addresstf = new JTextField();
        addresstf.setBounds(150 , 280 , 200 , 30);
        addresstf.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(addresstf);
        
        
//        ### Add email id Label###

        JLabel emailid = new JLabel("Email Id :  ");
        emailid.setBounds(30 , 340 , 100 , 30);
        emailid.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(emailid);
        
                
//        #### Aadd email text filed###
        emailidtf = new JTextField();
        emailidtf.setBounds(150 , 340 , 200 , 30);
        emailidtf.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(emailidtf);
        
        
        
//        ### Add calss 12 %  Label###

        JLabel class12 = new JLabel("Class XII% :  ");
        class12.setBounds(30 , 400 , 150 , 30);
        class12.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(class12);
        
                
//        #### Aadd class 12 % text filed###
        class12percent = new JLabel();
        class12percent.setBounds(150 , 400 , 200 , 30);
        class12percent.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(class12percent);
        
        
//        ### Add course Label###

        JLabel course = new JLabel("Course :  ");
        course.setBounds(30 , 460 , 150 , 30);
        course.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(course);
        
//        Add Combo box for course####
        
        courseCombo = new JTextField();
        courseCombo.setBounds(150 , 460 , 200 , 30);
        courseCombo.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        courseCombo.setBackground(Color.WHITE);
        add(courseCombo);
        
        
        
        
//        ### Add father name Label###

        JLabel fname = new JLabel("Father's Name :  ");
        fname.setBounds(400 , 160 ,200 , 30);
        fname.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(fname);
        
//        #### Aadd name text filed###
        fnametf = new JLabel();
        fnametf.setBounds(550 , 160 , 200 , 30);
        fnametf.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(fnametf);
        
        
//        ### Add date of birth no Label###

        JLabel dob = new JLabel("Date of Birth :  ");
        dob.setBounds(400 , 220 , 200 , 30);
        dob.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(dob);
        


        doblbl = new JLabel();
        doblbl.setBounds(550 , 220 , 200 , 30);
        doblbl.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(doblbl);
        
       
        
        
//        ### Add Address Label###

        JLabel phone = new JLabel("Phone :  ");
        phone.setBounds(400 , 280 , 100 , 30);
        phone.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(phone);
        
                
//        #### Aadd address text filed###
        phonetf = new JTextField();
        phonetf.setBounds(550 , 280 , 200 , 30);
        phonetf.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(phonetf);
        
//        ### Add calss 10 %  Label###

        JLabel class10 = new JLabel("Class X % :  ");
        class10.setBounds(400 , 340 , 150 , 30);
        class10.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(class10);
        
                
//        #### Aadd class 10 % text filed###
        class10percent = new JLabel();
        class10percent.setBounds(550 , 340 , 200 , 30);
        class10percent.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(class10percent);
        
        
//        ### Add aadhar no  Label###

        JLabel aadharno = new JLabel("Aadhar No:  ");
        aadharno.setBounds(400 , 400 , 150 , 30);
        aadharno.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(aadharno);
        
                
//        #### Aadd aadhar text filed###
        aadharnotf = new JLabel();
        aadharnotf.setBounds(550 , 400 , 200 , 30);
        aadharnotf.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(aadharnotf);
        
//        ### Add branch Label###

        JLabel branch = new JLabel("Branch :  ");
        branch.setBounds(400 , 460 , 150 , 30);
        branch.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(branch);
        
//        Add Combo box for course####
        
        branchCombo = new JTextField();
        branchCombo.setBounds(550 , 460 , 200 , 30);
        branchCombo.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        branchCombo.setBackground(Color.WHITE);
        add(branchCombo);
        
        
//        #### Dynamic add data from data vase ####
        try{
            Conn c = new Conn();
            String roll_no = (String)ch.getSelectedItem();
            String query = "select * from addstudent where roll_no = '"+roll_no+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                nametf.setText(rs.getString("name"));
                fnametf.setText(rs.getString("father_name"));
                rolltf.setText(rs.getString("roll_no"));
                doblbl.setText(rs.getString("dob"));
                addresstf.setText(rs.getString("address"));
                phonetf.setText(rs.getString("phone"));
                emailidtf.setText(rs.getString("email_id"));
                class10percent.setText(rs.getString("X_percentage"));
                class12percent.setText(rs.getString("XII_percentage"));
                aadharnotf.setText(rs.getString("aadhar"));
                courseCombo.setText(rs.getString("course"));
                branchCombo.setText(rs.getString("branch"));
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
                    String query = "select * from addstudent where roll_no = '"+roll_no+"'";
                    ResultSet rs = c.s.executeQuery(query);
                    while(rs.next()){
                        nametf.setText(rs.getString("name"));
                        fnametf.setText(rs.getString("father_name"));
                        rolltf.setText(rs.getString("roll_no"));
                        doblbl.setText(rs.getString("dob"));
                        addresstf.setText(rs.getString("address"));
                        phonetf.setText(rs.getString("phone"));
                        emailidtf.setText(rs.getString("email_id"));
                        class10percent.setText(rs.getString("X_percentage"));
                        class12percent.setText(rs.getString("XII_percentage"));
                        aadharnotf.setText(rs.getString("aadhar"));
                        courseCombo.setText(rs.getString("course"));
                        branchCombo.setText(rs.getString("branch"));
                    }

                }catch(Exception e){
                    e.printStackTrace();
                }  
            }
        });
        
        
//        ### Add sumbit button ###
        update = new JButton("Update");
        update.setBounds(250 , 600 , 100 , 30);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        update.addActionListener(this);
        add(update);
        
        
//        ### Add back button ###
        back = new JButton("Back");
        back.setBounds(450 , 600 , 100 , 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        back.addActionListener(this);
        add(back);
        
        
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == update){
            String rollno = (String)ch.getSelectedItem();
            String address = addresstf.getText();
            String emailid = emailidtf.getText();
            String course = courseCombo.getText();
            String phone = phonetf.getText();
            String branch = branchCombo.getText();
            
            
//            #### Add validation pattern to all the filed ###
            Pattern emailpattern = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
            Matcher emailmatcher = emailpattern.matcher(emailid);
            
            Pattern phonepattern = Pattern.compile("^[0-9]{10}$");
            Matcher phonematcher = phonepattern.matcher(phone);
            
            
            Pattern coursepattern = Pattern.compile("^[A-Za-z\\s'-]+$");
            Matcher coursematcher = coursepattern.matcher(course);
            
            Pattern branchpattern = Pattern.compile("^[A-Za-z\\s'-]+$");
            Matcher branchmatcher = branchpattern.matcher(branch);
            
            Pattern addresspattern = Pattern.compile("^[A-Za-z0-9A-Za-z\\s'-]+$");
            Matcher addressmatcher = addresspattern.matcher(address);
            
            
            
            
            
//            ### validation code ###
            if(course.equals("") ){
                JOptionPane.showMessageDialog(null, "Course is Required");
            }
            else if(!(coursematcher.matches())){
                JOptionPane.showMessageDialog(null, "Enter Correct Course");
            }
            else if(branch.equals("") ){
                JOptionPane.showMessageDialog(null, "Branch is Required");
            }
            else if(!(branchmatcher.matches())){
                JOptionPane.showMessageDialog(null, "Enter Correct Branch");
            }
            else if(emailid.equals("")){
                JOptionPane.showMessageDialog(null, "Email Id is Required");
            }
            else if(!(emailmatcher.matches())){
                JOptionPane.showMessageDialog(null, "Enter Correcr Email Id.");
            }
            else if(phone.equals("")){
                JOptionPane.showMessageDialog(null, "Phone number is required.");
            }
            else if(!(phonematcher.matches())){
                JOptionPane.showMessageDialog(null, "Enter Correcr Phone Number ");
            }
            else if(address.equals("")){
                JOptionPane.showMessageDialog(null, "Address is required.");
            }
            else if(!(addressmatcher.matches())){
                JOptionPane.showMessageDialog(null, "Enter Correcr Address ");
            }
            else{
                try{
                    Conn c = new Conn();
                
                    String query = "update addstudent set email_id = '"+emailid+"' , phone = '"+phone+"', address = '"+address+"', course = '"+course+"', branch = '"+branch+"' where roll_no = '"+rollno+"' "  ;
                
                    c.s.executeUpdate(query);
                
                    JOptionPane.showMessageDialog(null, "Student Details Updated Successfully");
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
        new UpdateStudent();
    }
}
