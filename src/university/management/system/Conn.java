package university.management.system;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    Conn(){
        try{
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem","root","saini@786;");
            s = c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
}
