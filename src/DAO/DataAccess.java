/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author duyhi
 */
public class DataAccess {
    private final String urlDB = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static String username = "";
    private static String password = "";
    private final static String driver = "oracle.jdbc.driver.OracleDriver";
    private Connection con = null;
    
    //
    public static void setUsr_Pwd(String usr, String pwd){
        username = usr;
        password = pwd;
    }
    //
    public DataAccess() throws SQLException {
        connect();
    }
    @Override
    protected void finalize() throws Throwable {
        disconnect();
        super.finalize();
    }
    public static void load_driver() throws ClassNotFoundException{
        Class.forName(driver);
    }
    public void connect() throws SQLException{
        con = DriverManager.getConnection(urlDB,username,password);
    }
    public void disconnect() throws SQLException{
        con.close();
    }
    public Connection getConnection(){ return con; }
    //execute query select non parameter
    public ResultSet executeQuery(String query) throws SQLException{
        Statement s = con.createStatement();
        return s.executeQuery(query);
    }
    //execute query inser, delete, update non parameter
    public int executeUpdate(String query) throws SQLException{
        Statement s = con.createStatement();
        return s.executeUpdate(query);
    }
    //execute query select with parameter, not include parameter Date
    public ResultSet executeQuery(String query, String[] para) throws SQLException{
        PreparedStatement s;
        s = con.prepareStatement(query);
        for(int i=0; i<para.length; i++)
            s.setString(i+1, para[i]);
        return s.executeQuery();
    }
    //execute query insert,update,delete with parameter, not include parameter Date
    public int executeUpdate(String query, String[] para) throws SQLException{
        PreparedStatement s;
        s = con.prepareStatement(query);
        for(int i=0; i<para.length; i++)
            s.setString(i+1, para[i]);
        return s.executeUpdate();
    }
    //call function not include parameter Date
    public String callFunction(String func, int para_out, String[] para) throws SQLException{
        CallableStatement s = con.prepareCall(func);
        s.registerOutParameter(1, para_out);
        for(int i=0; i<para.length; i++)
            s.setString(i+2, para[i]);
        s.executeUpdate();
        return s.getString(1);
    }
    //call procedure not include parameter Date
    public String callProcedure(String proc, String[] para) throws SQLException{
        CallableStatement s = con.prepareCall(proc);
        for(int i=0; i<para.length; i++)
            s.setString(i, para[i]);
        s.executeUpdate();
        return s.getString(1);
    }
}
