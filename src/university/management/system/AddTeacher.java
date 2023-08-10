package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddTeacher extends JFrame implements ActionListener{
    
    JTextField nametf , addresstf , emailidtf , class12percent , fnametf , phonetf , class10percent , aadharnotf;
    JComboBox educationCombo , departmentCombo;
    JDateChooser dateChooser;
    JButton submit , back;
    JLabel employeeid;
    
    
    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000L) +1000L);
    
    AddTeacher(){
        
        setSize(800 , 600);
        setLocationRelativeTo(null);
        setLayout(null);
        
//        ### Add heading ###
        JLabel heading = new JLabel("New Teacher Details");
        heading.setBounds(250 , 20 , 500 , 40);
        heading.setFont(new Font("Raleway" , Font.BOLD , 30));
        add(heading);
        
        
//        ### Add name Label###

        JLabel name = new JLabel("Name :  ");
        name.setBounds(30 , 100 , 100 , 30);
        name.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(name);
        
//        #### Aadd name text filed###
        nametf = new JTextField();
        nametf.setBounds(150 , 100 , 200 , 30);
        nametf.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(nametf);
        
        
//        ### Add roll no Label###

        JLabel rollNo = new JLabel("Roll No :  ");
        rollNo.setBounds(30 , 160 , 100 , 30);
        rollNo.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(rollNo);
        
//        #### Aadd roll no filed###
        employeeid = new JLabel("1029" + first4);
        employeeid.setBounds(150 , 160 , 200 , 30);
        employeeid.setFont(new Font("Tahoma" , Font.BOLD , 18));
        add(employeeid);
        
        
//        ### Add Address Label###

        JLabel address = new JLabel("Address :  ");
        address.setBounds(30 , 220 , 100 , 30);
        address.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(address);
        
                
//        #### Aadd address text filed###
        addresstf = new JTextField();
        addresstf.setBounds(150 , 220 , 200 , 30);
        addresstf.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(addresstf);
        
        
//        ### Add email id Label###

        JLabel emailid = new JLabel("Email Id :  ");
        emailid.setBounds(30 , 280 , 100 , 30);
        emailid.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(emailid);
        
                
//        #### Aadd email text filed###
        emailidtf = new JTextField();
        emailidtf.setBounds(150 , 280 , 200 , 30);
        emailidtf.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(emailidtf);
        
        
        
//        ### Add calss 12 %  Label###

        JLabel class12 = new JLabel("Class XII% :  ");
        class12.setBounds(30 , 340 , 150 , 30);
        class12.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(class12);
        
                
//        #### Aadd class 12 % text filed###
        class12percent = new JTextField();
        class12percent.setBounds(150 , 340 , 200 , 30);
        class12percent.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(class12percent);
        
        
//        ### Add course Label###

        JLabel course = new JLabel("Education :  ");
        course.setBounds(30 , 400 , 150 , 30);
        course.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(course);
        
//        Add Combo box for course####
        String[] courseComboValue = {"B.Tech" , "BBA" , "BCA" , "Bsc" , "Msc" , "MBA" , "MCA" , "MCom" , "MA" , "BA"};
        educationCombo = new JComboBox(courseComboValue);
        educationCombo.setBounds(150 , 400 , 200 , 30);
        educationCombo.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        educationCombo.setSelectedItem(null);
        educationCombo.setBackground(Color.WHITE);
        add(educationCombo);
        
        
        
        
//        ### Add father name Label###

        JLabel fname = new JLabel("Father's Name :  ");
        fname.setBounds(400 , 100 ,200 , 30);
        fname.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(fname);
        
//        #### Aadd name text filed###
        fnametf = new JTextField();
        fnametf.setBounds(550 , 100 , 200 , 30);
        fnametf.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(fnametf);
        
        
//        ### Add date of birth no Label###

        JLabel dob = new JLabel("Date of Birth :  ");
        dob.setBounds(400 , 160 , 200 , 30);
        dob.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(dob);
        
//        ### Add calendar jar file ###
        dateChooser = new JDateChooser();
        dateChooser.setBounds(550 , 160 , 200 , 30);
        dateChooser.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(dateChooser);
        
        
//        ### Add Address Label###

        JLabel phone = new JLabel("Phone :  ");
        phone.setBounds(400 , 220 , 100 , 30);
        phone.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(phone);
        
                
//        #### Aadd address text filed###
        phonetf = new JTextField();
        phonetf.setBounds(550 , 220 , 200 , 30);
        phonetf.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(phonetf);
        
//        ### Add calss 10 %  Label###

        JLabel class10 = new JLabel("Class X % :  ");
        class10.setBounds(400 , 280 , 150 , 30);
        class10.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(class10);
        
                
//        #### Aadd class 10 % text filed###
        class10percent = new JTextField();
        class10percent.setBounds(550 , 280 , 200 , 30);
        class10percent.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(class10percent);
        
        
//        ### Add aadhar no  Label###

        JLabel aadharno = new JLabel("Aadhar No:  ");
        aadharno.setBounds(400 , 340 , 150 , 30);
        aadharno.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(aadharno);
        
                
//        #### Aadd aadhar text filed###
        aadharnotf = new JTextField();
        aadharnotf.setBounds(550 , 340 , 200 , 30);
        aadharnotf.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        add(aadharnotf);
        
//        ### Add branch Label###

        JLabel branch = new JLabel("Departement :  ");
        branch.setBounds(400 , 400 , 150 , 30);
        branch.setFont(new Font("SAN_SARIF" , Font.PLAIN , 20));
        add(branch);
        
//        Add Combo box for course####
        String[] branchComboValue = {"Computer Science" , "Electronic" , "Mechanical" , "Civil" , "IT" };
        departmentCombo = new JComboBox(branchComboValue);
        departmentCombo.setBounds(550 , 400 , 200 , 30);
        departmentCombo.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        departmentCombo.setSelectedItem(null);
        departmentCombo.setBackground(Color.WHITE);
        add(departmentCombo);
        
        
//        ### Add sumbit button ###
        submit = new JButton("Submit");
        submit.setBounds(250 , 500 , 100 , 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        submit.addActionListener(this);
        add(submit);
        
        
//        ### Add back button ###
        back = new JButton("Back");
        back.setBounds(450 , 500 , 100 , 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma" , Font.PLAIN , 18));
        back.addActionListener(this);
        add(back);
        
        
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String name = nametf.getText();
            String employee_id = employeeid.getText();
            String address = addresstf.getText();
            String emailid = emailidtf.getText();
            String class12 = class12percent.getText();
            String education = (String)educationCombo.getSelectedItem();
            String fname = fnametf.getText();
            String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
            String phone = phonetf.getText();
            String class10 = class10percent.getText();
            String aadhar = aadharnotf.getText();
            String department = (String)departmentCombo.getSelectedItem();
            
            
//            #### Add validation pattern to all the filed ###
            Pattern emailpattern = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
            Matcher emailmatcher = emailpattern.matcher(emailid);
            
            Pattern phonepattern = Pattern.compile("^[0-9]{10}$");
            Matcher phonematcher = phonepattern.matcher(phone);
            
            Pattern aadharpattern = Pattern.compile("[0-9]{12}$");
            Matcher aadharmatcher = aadharpattern.matcher(aadhar);
            
            Pattern namepattern = Pattern.compile("^[A-Za-z\\s'-]+$");
            Matcher namematcher = namepattern.matcher(name);
            
            Pattern fnamepattern = Pattern.compile("^[A-Za-z\\s'-]+$");
            Matcher fnamematcher = fnamepattern.matcher(fname);
            
            Pattern addresspattern = Pattern.compile("^[A-Za-z0-9A-Za-z\\s'-]+$");
            Matcher addressmatcher = addresspattern.matcher(address);
            
            Pattern class12pattern = Pattern.compile("[0-9]{2,3}$");
            Matcher class12matcher = class12pattern.matcher(class12);
            
            
            Pattern class10pattern = Pattern.compile("[0-9]{2,3}$");
            Matcher class10matcher = class10pattern.matcher(class10);
            
            
            
            
//            ### validation code ###
            if(name.equals("") ){
                JOptionPane.showMessageDialog(null, "Name is Required");
            }
            else if(!(namematcher.matches())){
                JOptionPane.showMessageDialog(null, "Enter Correct Name");
            }
            else if(fname.equals("") ){
                JOptionPane.showMessageDialog(null, "Father's name is Required");
            }
            else if(!(fnamematcher.matches())){
                JOptionPane.showMessageDialog(null, "Enter Correct Father Name");
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
            else if(class12.equals("")){
                JOptionPane.showMessageDialog(null, "Class 12 percentage is required.");
            }
            else if(!(class12matcher.matches())){
                JOptionPane.showMessageDialog(null, "Enter Correcr percentage ");
            }
            else if(class10.equals("")){
                JOptionPane.showMessageDialog(null, "class 10 percentage is required.");
            }
            else if(!(class10matcher.matches())){
                JOptionPane.showMessageDialog(null, "Enter Correcr percentage ");
            }
            else if(aadhar.equals("")){
                JOptionPane.showMessageDialog(null, "Aadhar number required.");
            }
            else if(!(aadharmatcher.matches())){
                JOptionPane.showMessageDialog(null, "Enter Correcr aadhar number ");
            }
            else if(dob.equals("")){
                JOptionPane.showMessageDialog(null, "Date of Birth is required.");
            }
            else if(education == null ){
                JOptionPane.showMessageDialog(null, "Course is required.");
            }
            else if(department == null){
                JOptionPane.showMessageDialog(null, "Branch is required.");
            }
            else{
                try{
                    Conn c = new Conn();
                
                    String query = "insert into addteacher values('"+name+"','"+fname+"','"+employee_id+"','"+emailid+"','"+class10+"','"+class12+"','"+dob+"','"+phone+"','"+aadhar+"','"+address+"','"+education+"','"+department+"')";
                
                    c.s.executeUpdate(query);
                
                    JOptionPane.showMessageDialog(null, "Teacher Added Successfully");
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
        new AddTeacher();
    }
}
