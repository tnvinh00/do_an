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
public class PHONG_DAO {
    private final String insert = "insert into do_an.phong values(?,?,?,?)";
    private final String delete = "delete do_an.phong where sophong=?";
    private final String updateObj = "update do_an.phong set loaiphong=?, sokhach=?, ghichu=? where sophong=?";
    private final String findbySP = "select * from do_an.phong where makm=?";
    private final String findbyLP = "select * from do_an.phong where loaiphong=?";
    private final String findbySK = "select * from do_an.phong where sokhach=?";
    private final String getAll = "select * from do_an.phong";
    
    private DataAccess dao;

    public PHONG_DAO() throws SQLException {
        dao = new DataAccess();
    }
    public int insert(PHONG_DTO obj) throws SQLException{
        int r;
        r = dao.executeUpdate(insert, obj.to_array());
        return r;
    }
    public int delete(PHONG_DTO obj) throws SQLException{
        int r;
        r = dao.executeUpdate(delete, new String[]{obj.get_sophong()});
        return r;
    }
    public int updateObj(PHONG_DTO obj) throws SQLException{
        int r;
        r = dao.executeUpdate(updateObj, new String[]{obj.get_loaiphong(),
            obj.get_sokhach(),obj.get_ghichu(),obj.get_sophong()});
        return r;
    }
    public PHONG_DTO findbySP(String SP) throws SQLException, Exception{
        ResultSet rs;
        rs = dao.executeQuery(findbySP, new String[]{SP});
        if (rs.next()){
            PHONG_DTO temp;
            temp = new PHONG_DTO(rs.getString(1),
                    rs.getString(2),rs.getString(3),rs.getString(4));
            return temp;
        }
        return null;
    }
    public ArrayList<PHONG_DTO> findbyLP(String lp) throws SQLException, Exception{
        ArrayList<PHONG_DTO> _ds = new ArrayList<>();
        ResultSet rs;
        rs = dao.executeQuery(findbyLP,new String[]{lp});
        while(rs.next()){
            PHONG_DTO temp;
            temp = new PHONG_DTO(rs.getString(1),
                    rs.getString(2),rs.getString(3),rs.getString(4));
            _ds.add(temp);
        }
        return _ds;
    }
    public ArrayList<PHONG_DTO> findbySK(String sk) throws SQLException, Exception{
        ArrayList<PHONG_DTO> _ds = new ArrayList<>();
        ResultSet rs;
        rs = dao.executeQuery(findbySK,new String[]{sk});
        while(rs.next()){
            PHONG_DTO temp;
            temp = new PHONG_DTO(rs.getString(1),
                    rs.getString(2),rs.getString(3),rs.getString(4));
            _ds.add(temp);
        }
        return _ds;
    }
    public ArrayList<PHONG_DTO> getAll() throws SQLException, Exception{
        ArrayList<PHONG_DTO> _ds = new ArrayList<>();
        ResultSet rs;
        rs = dao.executeQuery(getAll);
        while(rs.next()){
            PHONG_DTO temp;
            temp = new PHONG_DTO(rs.getString(1),
                    rs.getString(2),rs.getString(3),rs.getString(4));
            _ds.add(temp);
        }
        return _ds;
    }
}
