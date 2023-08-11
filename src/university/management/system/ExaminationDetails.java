package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;


public class ExaminationDetails extends JFrame implements ActionListener{
    
    JTextField ch;
    JTable table;
    JButton cancel, result;
    
    ExaminationDetails(){
        
        setSize(1000,600);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
//        #### Add result label ###
        JLabel search = new JLabel("Check Result");
        search.setBounds(50 , 30  ,200 , 40);
        search.setFont(new Font("Raleway", Font.PLAIN , 30));
        add(search);
        
        
//        #### add text filed###
        ch = new JTextField();
        ch.setBounds(70 , 100 , 200 , 30);
        ch.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(ch);
        
        
        
        
        table = new JTable();
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0,150,1000,500);
        add(jsp);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from addstudent");
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
//        searchbutton = new JButton("Search");
//        searchbutton.setBounds(100 , 100 , 100 , 30 );
//        searchbutton.setFont(new Font("Tahoma" , Font.PLAIN , 17));
//        searchbutton.addActionListener(this);
//        add(searchbutton);
//        
//        
//        print = new JButton("Print");
//        print.setBounds(230 , 100 , 100 , 30 );
//        print.setFont(new Font("Tahoma" , Font.PLAIN , 17));
//        print.addActionListener(this);
//        add(print);


//        ### add dynamic value to text filed ###
        table.addMouseListener(new MouseAdapter(){
           public void mouseClicked(MouseEvent me){
               int row = table.getSelectedRow();
               ch.setText(table.getModel().getValueAt(row , 2).toString());
               
           } 
        });
        
        
        result = new JButton("Result");
        result.setBounds(360 , 100 , 100 , 30 );
        result.setFont(new Font("Tahoma" , Font.PLAIN , 17));
        result.setBackground(Color.BLACK);
        result.setForeground(Color.WHITE);
        result.addActionListener(this);
        add(result);
        
        
        cancel = new JButton("Cancel");
        cancel.setBounds(490 , 100 , 100 , 30 );
        cancel.setFont(new Font("Tahoma" , Font.PLAIN , 17));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
////        if(ae.getSource() == searchbutton){
////            String rollno = (String)ch.getSelectedItem();
////            String query = "select * from addstudent where roll_no = '"+rollno+"' ";
////            
////            try{
////                Conn c = new Conn();
////                ResultSet rs = c.s.executeQuery(query); 
////                table.setModel(DbUtils.resultSetToTableModel(rs));
////                
////            }catch(Exception e){
////                e.printStackTrace();
////            }
////        }
////        else if(ae.getSource() == print){
////            try{
////                table.print();
////            }catch(Exception e){
////                e.printStackTrace();
////            }
////        }else if(ae.getSource() == add){
////            setVisible(false);
////            new AddStudent();
////        }
////        else if(ae.getSource() == update){
////            setVisible(false);
//////            new Detail
////        }
//        else{
//            setVisible(false);
//        }
        
    }
    
    public static void main(String[] args){
        new ExaminationDetails();
    }
    
}
