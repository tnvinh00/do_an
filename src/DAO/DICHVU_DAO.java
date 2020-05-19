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
public class DICHVU_DAO {
    private final String insert = "insert into do_an.dichvu values(?,?,?)";
    private final String delete = "delete do_an.dichvu where madv=?";
    private final String delAll = "delete do_an.dichvu";
    private final String updateObj = "update do_an.dichvu set tendv=?, gia=? where madv=?";
    private final String updateAllGia = "update do_an.dichvu set gia=?";
    private final String findbyMA = "select * from do_an.dichvu where madv=?";
    private final String findbyTen = "select * from do_an.dichvu where tendv like";
    private final String getAll = "select * from do_an.dichvu";
    
    private DataAccess dao;

    public DICHVU_DAO() throws SQLException {
        dao = new DataAccess();
    }
    public int insert(DICHVU_DTO obj) throws SQLException{
        int r;
        r = dao.executeUpdate(insert, obj.to_array());
        return r;
    }
    public int delete(DICHVU_DTO obj) throws SQLException{
        int r;
        r = dao.executeUpdate(delete, new String[]{obj.get_madv()});
        return r;
    }
    public int deleteAll() throws SQLException{
        int r;
        r = dao.executeUpdate(delAll);
        return r;
    }
    public int updateObj(DICHVU_DTO obj) throws SQLException{
        int r;
        r = dao.executeUpdate(updateObj, new String[]{obj.get_tendv(),
            obj.get_gia(),obj.get_madv()});
        return r;
    }
    public int updateAll(String dongia) throws SQLException{
        int r;
        r = dao.executeUpdate(updateAllGia, new String[]{dongia});
        return r;
    }
    public DICHVU_DTO findbyMA(String MA) throws SQLException, Exception{
        ResultSet rs;
        rs = dao.executeQuery(findbyMA, new String[]{MA});
        if (rs.next()){
            DICHVU_DTO temp;
            temp = new DICHVU_DTO(rs.getString(1),
                    rs.getString(2),rs.getString(3));
            return temp;
        }
        return null;
    }
    public ArrayList<DICHVU_DTO> findbyTen(String Ten) throws SQLException, Exception{
        ArrayList<DICHVU_DTO> _ds = new ArrayList<>();
        ResultSet rs;
        rs = dao.executeQuery(findbyTen+"'%"+Ten+"%'");
        while(rs.next()){
            DICHVU_DTO temp;
            temp = new DICHVU_DTO(rs.getString(1),
                    rs.getString(2),rs.getString(3));
            _ds.add(temp);
        }
        return _ds;
    }
    public ArrayList<DICHVU_DTO> getAll() throws SQLException, Exception{
        ArrayList<DICHVU_DTO> _ds = new ArrayList<>();
        ResultSet rs;
        rs = dao.executeQuery(getAll);
        while(rs.next()){
            DICHVU_DTO temp;
            temp = new DICHVU_DTO(rs.getString(1),
                    rs.getString(2),rs.getString(3));
            _ds.add(temp);
        }
        return _ds;
    }
}
