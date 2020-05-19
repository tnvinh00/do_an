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
public class LOAIKHACH_DAO {
    private final String insert = "insert into do_an.loaikhach values(?,?)";
    private final String updateObj = "update do_an.loaikhach set heso=? where loaikhach=?";
    private final String updateAll = "update do_an.loaikhach set heso=?";
    private final String delete = "delete do_an.loaikhach where loaikhach=?";
    private final String delAll = "delete do_an.loaikhach";
    private final String findbyLK = "select * from do_an.loaikhach where loaikhach=?";
    private final String getAll = "select * from do_an.loaikhach";
    
    private DataAccess dao;

    public LOAIKHACH_DAO() throws SQLException {
        dao = new DataAccess();
    }
    public int insert(LOAIKHACH_DTO obj) throws SQLException{
        int r;
        r = dao.executeUpdate(insert, obj.to_array());
        return r;
    }
    public int updateObj(LOAIKHACH_DTO obj) throws SQLException{
        int r;
        String para[] = {obj.get_heso(),obj.get_loaikhach()};
        r = dao.executeUpdate(updateObj, para);
        return r;
    }
    public int updateAll(String heso) throws SQLException{
        int r;
        String para[] = {heso};
        r = dao.executeUpdate(updateAll, para);
        return r;
    }
    public int delete(LOAIKHACH_DTO obj) throws SQLException{
        int r;
        r = dao.executeUpdate(delete, new String[]{obj.get_loaikhach()});
        return r;
    }
    public int deleteAll() throws SQLException{
        int r;
        r = dao.executeUpdate(delAll);
        return r;
    }
    public LOAIKHACH_DTO findbyLK(String LK) throws SQLException, Exception{
        ResultSet rs;
        rs = dao.executeQuery(findbyLK, new String[]{LK});
        if(rs.next()){
            LOAIKHACH_DTO temp;
            temp = new LOAIKHACH_DTO(rs.getString(1),rs.getString(2));
            return temp;
        }
        return null;
    }
    public ArrayList<LOAIKHACH_DTO> getAll() throws SQLException, Exception{
        ArrayList<LOAIKHACH_DTO> _ds = new ArrayList<>();
        ResultSet rs;
        rs = dao.executeQuery(getAll);
        while(rs.next()){
            LOAIKHACH_DTO temp;
            temp = new LOAIKHACH_DTO(rs.getString(1),rs.getString(2));
            _ds.add(temp);
        }
        return _ds;
    }
}
