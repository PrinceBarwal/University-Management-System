package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class AddStudent extends JFrame{
    
    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000L) +1000L);
    
    AddStudent(){
        
        setSize(800 , 600);
        setLocationRelativeTo(null);
        setLayout(null);
        
//        ### Add heading ###
        JLabel heading = new JLabel("New Student Details");
        heading.setBounds(250 , 20 , 500 , 40);
        heading.setFont(new Font("Raleway" , Font.BOLD , 30));
        add(heading);
        
        
//        ### Add name Label###

        JLabel name = new JLabel("Name :  ");
        name.setBounds(30 , 100 , 100 , 30);
        name.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(name);
        
//        #### Aadd name text filed###
        JTextField nametf = new JTextField();
        nametf.setBounds(150 , 100 , 200 , 30);
        nametf.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(nametf);
        
        
//        ### Add roll no Label###

        JLabel rollNo = new JLabel("Roll No :  ");
        rollNo.setBounds(30 , 160 , 100 , 30);
        rollNo.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(rollNo);
        
//        #### Aadd roll no filed###
        JLabel rolltf = new JLabel("2023" + first4);
        rolltf.setBounds(150 , 160 , 200 , 30);
        rolltf.setFont(new Font("Tahoma" , Font.BOLD , 18));
        add(rolltf);
        
        
//        ### Add Address Label###

        JLabel address = new JLabel("Address :  ");
        address.setBounds(30 , 220 , 100 , 30);
        address.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(address);
        
                
//        #### Aadd address text filed###
        JTextField addresstf = new JTextField();
        addresstf.setBounds(150 , 220 , 200 , 30);
        addresstf.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(addresstf);
        
        
//        ### Add email id Label###

        JLabel emailid = new JLabel("Email Id :  ");
        emailid.setBounds(30 , 280 , 100 , 30);
        emailid.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(emailid);
        
                
//        #### Aadd email text filed###
        JTextField emailidtf = new JTextField();
        emailidtf.setBounds(150 , 280 , 200 , 30);
        emailidtf.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(emailidtf);
        
        
        
//        ### Add calss 12 %  Label###

        JLabel class12 = new JLabel("Class XII% :  ");
        class12.setBounds(30 , 340 , 150 , 30);
        class12.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(class12);
        
                
//        #### Aadd class 12 % text filed###
        JTextField class12percent = new JTextField();
        class12percent.setBounds(150 , 340 , 200 , 30);
        class12percent.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(class12percent);
        
        
//        ### Add course Label###

        JLabel course = new JLabel("Course :  ");
        course.setBounds(30 , 400 , 150 , 30);
        course.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(course);
        
//        Add Combo box for course####
        String[] courseComboValue = {"B.Tech" , "BBA" , "BCA" , "Bsc" , "Msc" , "MBA" , "MCA" , "MCom" , "MA" , "BA"};
        JComboBox courseCombo = new JComboBox(courseComboValue);
        courseCombo.setBounds(150 , 400 , 200 , 30);
        courseCombo.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        courseCombo.setBackground(Color.WHITE);
        add(courseCombo);
        
        
        
        
//        ### Add father name Label###

        JLabel fname = new JLabel("Father's Name :  ");
        fname.setBounds(400 , 100 ,200 , 30);
        fname.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(fname);
        
//        #### Aadd name text filed###
        JTextField fnametf = new JTextField();
        fnametf.setBounds(550 , 100 , 200 , 30);
        fnametf.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(fnametf);
        
        
//        ### Add date of birth no Label###

        JLabel dob = new JLabel("Date of Birth :  ");
        dob.setBounds(400 , 160 , 200 , 30);
        dob.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(dob);
        
//        ### Add calendar jar file ###
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(550 , 160 , 200 , 30);
        dateChooser.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(dateChooser);
        
        
//        ### Add Address Label###

        JLabel phone = new JLabel("Phone :  ");
        phone.setBounds(400 , 220 , 100 , 30);
        phone.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(phone);
        
                
//        #### Aadd address text filed###
        JTextField phonetf = new JTextField();
        phonetf.setBounds(550 , 220 , 200 , 30);
        phonetf.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(phonetf);
        
//        ### Add calss 10 %  Label###

        JLabel class10 = new JLabel("Class X % :  ");
        class10.setBounds(400 , 280 , 150 , 30);
        class10.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(class10);
        
                
//        #### Aadd class 10 % text filed###
        JTextField class10percent = new JTextField();
        class10percent.setBounds(550 , 280 , 200 , 30);
        class10percent.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(class10percent);
        
        
//        ### Add aadhar no  Label###

        JLabel aadharno = new JLabel("Aadhar No:  ");
        aadharno.setBounds(400 , 340 , 150 , 30);
        aadharno.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(aadharno);
        
                
//        #### Aadd class 12 % text filed###
        JTextField aadharnotf = new JTextField();
        aadharnotf.setBounds(550 , 340 , 200 , 30);
        aadharnotf.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(aadharnotf);
        
//        ### Add branch Label###

        JLabel branch = new JLabel("Branch :  ");
        branch.setBounds(400 , 400 , 150 , 30);
        branch.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(branch);
        
//        Add Combo box for course####
        String[] branchComboValue = {"Computer Science" , "Electronic" , "Mechanical" , "Civil" , "IT" };
        JComboBox branchCombo = new JComboBox(branchComboValue);
        branchCombo.setBounds(550 , 400 , 200 , 30);
        branchCombo.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        branchCombo.setBackground(Color.WHITE);
        add(branchCombo);
        
        
//        ### Add sumbit button ###
        JButton submit = new JButton("Submit");
        submit.setBounds(250 , 500 , 100 , 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(submit);
        
        
//        ### Add back button ###
        JButton back = new JButton("Back");
        back.setBounds(450 , 500 , 100 , 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(back);
        
        
        setVisible(true);
    }
    
    public static void main(String[] args){
        new AddStudent();
    }
}
