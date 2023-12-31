package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Project extends JFrame implements ActionListener{
    
    Project(){
        
//        setSize(500,500);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setLayout(null);
        
//        ### Add Image to frame ###
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1400, 675, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1400,675);
        add(image);
        
        
//        ### Add menubar ###
        JMenuBar mb = new JMenuBar();
        mb.setBackground(Color.WHITE);
        setJMenuBar(mb);
        
//        ### Add First menu###
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        newInformation.setFont(new Font("Tahoma" , Font.PLAIN , 15));
        mb.add(newInformation);
        
//        ### Add menu item ###
        JMenuItem newStudentInformation = new JMenuItem("New Student Information");
        newStudentInformation.addActionListener(this);
        newInformation.add(newStudentInformation);
        
        
        JMenuItem newTeacherInformation = new JMenuItem("New Teacher Information");
        newTeacherInformation.addActionListener(this);
        newInformation.add(newTeacherInformation);
        
        
        //        ### Add Second menu###
        JMenu viewDetails = new JMenu("View Details");
        viewDetails.setForeground(Color.RED);
        viewDetails.setFont(new Font("Tahoma" , Font.PLAIN , 15));
        mb.add(viewDetails);
        
//        ### Add menu item ###
        JMenuItem studentDetail = new JMenuItem("View Student Detail");
        studentDetail.addActionListener(this);
        viewDetails.add(studentDetail);
        
        
        JMenuItem teacherDetail = new JMenuItem("View Teacher Detail");
        teacherDetail.addActionListener(this);
        viewDetails.add(teacherDetail);
        
//        ### Add Third menu###
        JMenu applyLeave = new JMenu("Apply Leave");
        applyLeave.setForeground(Color.BLUE);
        applyLeave.setFont(new Font("Tahoma" , Font.PLAIN , 15));
        mb.add(applyLeave);
        
//        ### Add menu item ###
        JMenuItem studentLeave = new JMenuItem("Student Leave");
        studentLeave.addActionListener(this);
        applyLeave.add(studentLeave);
        
        
        JMenuItem teacherLeave = new JMenuItem("Teacher Leave");
        teacherLeave.addActionListener(this);
        applyLeave.add(teacherLeave);
        
        
//        ### Add fourth menu###
        JMenu leaveDetail = new JMenu("Leave Detail");
        leaveDetail.setForeground(Color.RED);
        leaveDetail.setFont(new Font("Tahoma" , Font.PLAIN , 15));
        mb.add(leaveDetail);
        
//        ### Add menu item ###
        JMenuItem studentLeaveDetail = new JMenuItem("Student Leave Deatil");
        studentLeaveDetail.addActionListener(this);
        leaveDetail.add(studentLeaveDetail);
        
        
        JMenuItem teacherLeaveDetail = new JMenuItem("Teacher Leave Detail");
        teacherLeaveDetail.addActionListener(this);
        leaveDetail.add(teacherLeaveDetail);
        
//        ### Add fifth menu###
        JMenu examination = new JMenu("Examination");
        examination.setForeground(Color.BLUE);
        examination.setFont(new Font("Tahoma" , Font.PLAIN , 15));
        mb.add(examination);
        
//        ### Add menu item ###
        JMenuItem examinationDetail = new JMenuItem("Examination Details");
        examinationDetail.addActionListener(this);
        examination.add(examinationDetail);
        
        
        JMenuItem examMarks = new JMenuItem("Exam Marks");
        examMarks.addActionListener(this);
        examination.add(examMarks);
        
        
//        ### Add sixth menu###
        JMenu updateDetail = new JMenu("Update Deatil");
        updateDetail.setForeground(Color.RED);
        updateDetail.setFont(new Font("Tahoma" , Font.PLAIN , 15));
        mb.add(updateDetail);
        
//        ### Add menu item ###
        JMenuItem updateStudentDetail = new JMenuItem("Update Student Detail");
        updateStudentDetail.addActionListener(this);
        updateDetail.add(updateStudentDetail);
        
        
        JMenuItem updateTeacherDetail = new JMenuItem("Update Teacher Detail");
        updateTeacherDetail.addActionListener(this);
        updateDetail.add(updateTeacherDetail);
        
//        ### Add seventh menu###
        JMenu feeDetail = new JMenu("Fee Deatil");
        feeDetail.setForeground(Color.BLUE);
        feeDetail.setFont(new Font("Tahoma" , Font.PLAIN , 15));
        mb.add(feeDetail);
        
//        ### Add menu item ###
        JMenuItem feeStructure = new JMenuItem("Fee Structure");
        feeStructure.addActionListener(this);
        feeDetail.add(feeStructure);
        
        
        JMenuItem studentFeeForm = new JMenuItem("Student Fee Form");
        studentFeeForm.addActionListener(this);
        feeDetail.add(studentFeeForm);


//        ### Add eighth menu###
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.RED);
        utility.setFont(new Font("Tahoma" , Font.PLAIN , 15));
        mb.add(utility);
        
//        ### Add menu item ###
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.addActionListener(this);
        utility.add(notepad);
        
        
        JMenuItem calculator = new JMenuItem("Calculator");
        calculator.addActionListener(this);
        utility.add(calculator);
        
        JMenuItem webBrowser = new JMenuItem("Web Borwser");
        webBrowser.addActionListener(this);
        utility.add(webBrowser);


        
//        ### Add nineth menu###
        JMenu about = new JMenu("About ");
        about.setForeground(Color.BLUE);
        about.setFont(new Font("Tahoma" , Font.PLAIN , 15));
        mb.add(about);
        
        
//        ### Add menu item ###
        JMenuItem aboutUs = new JMenuItem("About Us");
        aboutUs.addActionListener(this);
        about.add(aboutUs);
        



//        ### Add tenth menu###
        JMenu exit = new JMenu("Exit ");
        exit.setForeground(Color.RED);
        exit.setFont(new Font("Tahoma" , Font.PLAIN , 15));
        mb.add(exit);
        
//        ### Add menu item ###
        JMenuItem close = new JMenuItem("Exit");
        close.addActionListener(this);
        exit.add(close);
        
        
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String msg = ae.getActionCommand();
        
        if(msg.equals("Exit")){
            System.exit(0);
        }
        else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(msg.equals("Web Borwser")){
            try{
                Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(msg.equals("New Student Information")){
            new AddStudent();
        }
        else if(msg.equals("New Teacher Information")){
            new AddTeacher();
        }
        else if(msg.equals("View Student Detail")){
            new StudentDetail();
        }
        else if(msg.equals("View Teacher Detail")){
            new TeacherDetails();
        }
        else if(msg.equals("Student Leave")){
            new StudentLeave();
        }
        else if(msg.equals("Teacher Leave")){
            new TeacherLeave();
        }
        else if(msg.equals("Student Leave Deatil")){
            new StudentLeaveDetails();
        }
        else if(msg.equals("Teacher Leave Detail")){
            new TeacherLeaveDetails();
        }
        else if(msg.equals("Update Student Detail")){
            new UpdateStudent();
        }
        else if(msg.equals("Update Teacher Detail")){
            new UpdateTeacher();
        }
        else if(msg.equals("Exam Marks")){
            new EnterMarks();
        }
        else if(msg.equals("Examination Details")){
            new ExaminationDetails();
        }
        else if(msg.equals("Fee Structure")){
            new FeeStructure();
        }
        else if(msg.equals("About Us")){
            new About();
        }
        else if(msg.equals("Student Fee Form")){
            new StudentFeeForm();
        }
    }
    
    public static void main(String[] args){
        new Project();
    }
}
