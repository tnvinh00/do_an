/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author duyhi
 */
public class NGUOIDUNG_DAO {
    private final String getQL = "select * from do_an.quanli where id='1111'";
    private final String updateQL = "update do_an.quanli set matkhau = ? where id = '1111'";
    private final String updateQL_tk = "alter user q1111 identified by ";
    private final String insert = "insert into do_an.nguoidung values(?,?)";
    private final String updateObj = "update do_an.nguoidung set matkhau=? where cmnd=?";
    private final String updateObj_tk = "alter user ? identified by ?";
    private final String delete = "delete do_an.nguoidung where cmnd=?";
    private final String delete_tk = "drop user ? cascade";
    private final String findbyCM = "select * from do_an.nguoidung where cmnd=?";
    private final String getAll = "select * from do_an.nguoidung";
    
    private DataAccess dao;

    public NGUOIDUNG_DAO() throws SQLException {
        dao = new DataAccess();
    }
    public NGUOIDUNG_DTO getQL() throws SQLException, Exception{
        ResultSet r = dao.executeQuery(getQL);
        r.next();
        NGUOIDUNG_DTO ql = new NGUOIDUNG_DTO(r.getString(1),r.getString(2));
        return ql;
    }
    public void updateQL(String mk) throws SQLException{
        dao.getConnection().setAutoCommit(false);
        dao.executeUpdate(updateQL, new String[]{mk});//DML
        dao.executeUpdate(updateQL_tk+mk);//DDL
        dao.getConnection().setAutoCommit(true);
    }
    public int insert(NGUOIDUNG_DTO obj) throws SQLException{
        int r;
        r = dao.executeUpdate(insert, obj.to_array());
        return r;
    }
    public void updateObj(NGUOIDUNG_DTO obj) throws SQLException{
        String para[] = {obj.get_matkhau(),obj.get_cmnd()};
        dao.getConnection().setAutoCommit(false);
        dao.executeUpdate(updateObj, para);
        dao.executeUpdate(updateObj_tk, new String[]{para[1],para[0]});
        dao.getConnection().setAutoCommit(true);
    }
    public void delete(NGUOIDUNG_DTO obj) throws SQLException{
        dao.getConnection().setAutoCommit(false);
        dao.executeUpdate(delete, new String[]{obj.get_cmnd()});
        dao.executeUpdate(delete_tk, new String[]{obj.get_cmnd()});
        dao.getConnection().setAutoCommit(true);
    }
    public NGUOIDUNG_DTO findbyCM(String CM) throws SQLException, Exception{
        ResultSet rs;
        rs = dao.executeQuery(findbyCM, new String[]{CM});
        if (rs.next()){
            NGUOIDUNG_DTO temp;
            temp = new NGUOIDUNG_DTO(rs.getString(1),rs.getString(2));
            return temp;
        }
        return null;
    }
    public ArrayList<NGUOIDUNG_DTO> getAll() throws SQLException, Exception{
        ArrayList<NGUOIDUNG_DTO> _ds = new ArrayList<>();
        ResultSet rs;
        rs = dao.executeQuery(getAll);
        while(rs.next()){
            NGUOIDUNG_DTO temp;
            temp = new NGUOIDUNG_DTO(rs.getString(1),rs.getString(2));
            _ds.add(temp);
        }
        return _ds;
    }
}
