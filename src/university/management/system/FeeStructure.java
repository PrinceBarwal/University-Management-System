package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;


public class FeeStructure extends JFrame{
    
    JTable table;
    
    FeeStructure(){
        
        setSize(1000,600);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
//        #### Add fee label ###
        JLabel search = new JLabel("Fee Sturcture");
        search.setBounds(50 , 30  ,300 , 40);
        search.setFont(new Font("Tahoma", Font.PLAIN , 30));
        add(search);
        

        
        table = new JTable();
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0,100,1000,500);
        add(jsp);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from fee");
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        
        setVisible(true);
    }
    
    
    
    public static void main(String[] args){
        new FeeStructure();
    }
    
}
