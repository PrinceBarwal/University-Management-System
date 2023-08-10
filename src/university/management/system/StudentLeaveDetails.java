package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;


public class StudentLeaveDetails extends JFrame implements ActionListener{
    
    Choice ch;
    JTable table;
    JButton searchbutton , print , cancel , add , update;
    
    StudentLeaveDetails(){
        
        setSize(1000,600);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
//        #### Add search label ###
        JLabel search = new JLabel("Search by Roll No.");
        search.setBounds(50 , 30  ,170 , 30);
        search.setFont(new Font("Tahoma", Font.PLAIN , 20));
        add(search);
        
        ch = new Choice();
        ch.setBounds(250 , 30 , 200 , 40);
        ch.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(ch);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from studentleave");
            while(rs.next()){
                ch.add(rs.getString("roll_no"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        table = new JTable();
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0,150,1000,500);
        add(jsp);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from studentleave");
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        searchbutton = new JButton("Search");
        searchbutton.setBounds(100 , 100 , 100 , 30 );
        searchbutton.setFont(new Font("Tahoma" , Font.PLAIN , 17));
        searchbutton.addActionListener(this);
        add(searchbutton);
        
        
        print = new JButton("Print");
        print.setBounds(230 , 100 , 100 , 30 );
        print.setFont(new Font("Tahoma" , Font.PLAIN , 17));
        print.addActionListener(this);
        add(print);
        
        
        add = new JButton("Add");
        add.setBounds(360 , 100 , 100 , 30 );
        add.setFont(new Font("Tahoma" , Font.PLAIN , 17));
        add.addActionListener(this);
        add(add);
        
        
        update = new JButton("Update");
        update.setBounds(490 , 100 , 100 , 30 );
        update.setFont(new Font("Tahoma" , Font.PLAIN , 17));
        update.addActionListener(this);
        add(update);
        
        
        cancel = new JButton("Cancel");
        cancel.setBounds(620 , 100 , 100 , 30 );
        cancel.setFont(new Font("Tahoma" , Font.PLAIN , 17));
        cancel.addActionListener(this);
        add(cancel);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == searchbutton){
            String rollno = (String)ch.getSelectedItem();
            String query = "select * from studentleave where roll_no = '"+rollno+"' ";
            
            try{
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query); 
                table.setModel(DbUtils.resultSetToTableModel(rs));
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == print){
            try{
                table.print();
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == add){
            setVisible(false);
            new AddStudent();
        }
        else if(ae.getSource() == update){
            setVisible(false);
//            new Detail
        }
        else{
            setVisible(false);
        }
        
    }
    
    public static void main(String[] args){
        new StudentLeaveDetails();
    }
    
}
