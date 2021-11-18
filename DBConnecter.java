package com.company;
import java.sql.*;

public class DBConnecter{

    static final String DB_URL = "jdbc:mysql://localhost/bordfodbold";

    Static final String USER = "root";
    Static final String PASS = "William22";

    @Override

    public String[] readGame(){
        Connection conn= null;
        Statement stm = null;

        try{
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Creating statement...");
            stm = conn.createStatement();
            String sql = "SELECT * FROM Field";
            ResultSet tm = stm.executeQuery(sql);

            while(tm.next()){
                //Retrieve by column name
                int team  = tm.getString("teams");
            }
            tm.close();
            stm.close();
            conn.close();


    }
        catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stm!=null)
                    stm.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try

}
