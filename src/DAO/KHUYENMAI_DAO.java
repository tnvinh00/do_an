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
public class KHUYENMAI_DAO {
    private final String insert = "insert into do_an.khuyenmai values(?,?,?)";
    private final String delete = "delete do_an.khuyenmai where makm=?";
    private final String delAll = "delete do_an.khuyenmai";
    private final String updateObj = "update do_an.khuyenmai set tenkm=?, tile=? where makm=?";
    private final String updateAllTile = "update do_an.khuyenmai set tile=?";
    private final String findbyMA = "select * from do_an.khuyenmai where makm=?";
    private final String findbyTen = "select * from do_an.khuyenmai where tenkm like";
    private final String getAll = "select * from do_an.khuyenmai";
    
    private DataAccess dao;

    public KHUYENMAI_DAO() throws SQLException {
        dao = new DataAccess();
    }
    public int insert(KHUYENMAI_DTO obj) throws SQLException{
        int r;
        r = dao.executeUpdate(insert, obj.to_array());
        return r;
    }
    public int delete(KHUYENMAI_DTO obj) throws SQLException{
        int r;
        r = dao.executeUpdate(delete, new String[]{obj.get_makm()});
        return r;
    }
    public int deleteAll() throws SQLException{
        int r;
        r = dao.executeUpdate(delAll);
        return r;
    }
    public int updateObj(KHUYENMAI_DTO obj) throws SQLException{
        int r;
        r = dao.executeUpdate(updateObj, new String[]{obj.get_tenkm(),
            obj.get_tile(),obj.get_makm()});
        return r;
    }
    public int updateAll(String tile) throws SQLException{
        int r;
        r = dao.executeUpdate(updateAllTile, new String[]{tile});
        return r;
    }
    public KHUYENMAI_DTO findbyMA(String MA) throws SQLException, Exception{
        ResultSet rs;
        rs = dao.executeQuery(findbyMA, new String[]{MA});
        if (rs.next()){
            KHUYENMAI_DTO temp;
            temp = new KHUYENMAI_DTO(rs.getString(1),
                    rs.getString(2),rs.getString(3));
            return temp;
        }
        return null;
    }
    public ArrayList<KHUYENMAI_DTO> findbyTen(String Ten) throws SQLException, Exception{
        ArrayList<KHUYENMAI_DTO> _ds = new ArrayList<>();
        ResultSet rs;
        rs = dao.executeQuery(findbyTen+"'%"+Ten+"%'");
        while(rs.next()){
            KHUYENMAI_DTO temp;
            temp = new KHUYENMAI_DTO(rs.getString(1),
                    rs.getString(2),rs.getString(3));
            _ds.add(temp);
        }
        return _ds;
    }
    public ArrayList<KHUYENMAI_DTO> getAll() throws SQLException, Exception{
        ArrayList<KHUYENMAI_DTO> _ds = new ArrayList<>();
        ResultSet rs;
        rs = dao.executeQuery(getAll);
        while(rs.next()){
            KHUYENMAI_DTO temp;
            temp = new KHUYENMAI_DTO(rs.getString(1),
                    rs.getString(2),rs.getString(3));
            _ds.add(temp);
        }
        return _ds;
    }
}
