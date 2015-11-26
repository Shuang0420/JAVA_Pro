package javapro;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;
import org.jfree.data.general.Dataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.jdbc.JDBCPieDataset;
import org.jfree.data.jdbc.JDBCXYDataset;

/**
 *
 * @author Shuang
 */
public class Dbconnection {
    //string to store url,username,password
    private static final String URL="jdbc:mysql://mydatabase.cwhndt08kykb.us-west-2.rds.amazonaws.com:3306/studentinfor";
    private static final String USER="lynne";
    private static final String PASSWORD="abcd1234";
    public static java.sql.Connection conn = null;
    
    /**
     * Connect to database.
     */
    public static void getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Dbconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    /**
     * Returns the dataset under the query from database.
     * @param dataSetType
     * @param query
     * @return Returns the dataset under the query from database.
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public static Dataset connectDatabase(String dataSetType, String query) throws ClassNotFoundException, SQLException{
        Dataset data = null;
        getConnection();
        switch(dataSetType) {
            case "pie":
                data = new JDBCPieDataset(conn, query);
                break;
            case "xy":
                data = new JDBCXYDataset(conn, query);
                break;
            case "categoryx":
                data = new JDBCCategoryDataset(conn, query);
                break;  
            case "categoryy":
                data = new JDBCCategoryDataset(conn, query);
                break; 
            case "line":
                data = new JDBCCategoryDataset(conn, query);
                break;
            case "histogram":
                data = new JDBCXYDataset(conn,query);
                break;
            }
        
        return data;
    }
    
    /**
     * This method is to append data to database
     * @param filepath 
     */
    public static void connectDatabase(String filepath){
        Dataset data = null;
        getConnection();
        try (
            Statement state = conn.createStatement()) {
            state.executeUpdate("load DATA LOCAL INFILE '"+filepath+"' INTO TABLE student2 FIELDS TERMINATED BY ',' ENCLOSED BY '' LINES TERMINATED BY '\\n' ");
            } catch (SQLException ex) {
            Logger.getLogger(Dbconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null,"Update data successfully!"," ",
                PLAIN_MESSAGE);
        }
    
    /**
     * This method is to append data to database 
     * @return 
     */
    public static int connectDatabase(int total){
        try {
            getConnection();
            Statement state = conn.createStatement();
            ResultSet rs = state.executeQuery("SELECT count(*) FROM studentinfor.`student2`;");
            rs.next();
            total = rs.getInt(1);         
        } catch (SQLException ex) {
            Logger.getLogger(Dbconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
             return total;
        }    
    
    
}
