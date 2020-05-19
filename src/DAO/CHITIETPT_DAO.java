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
public class CHITIETPT_DAO {
    private final String insert = "insert into do_an.chitietpt values(?,?)";
    private final String delete = "delete do_an.chitietpt where mapt=? and cmnd=?";
    private final String delAll = "delete do_an.chitietpt";
    private final String findbyMA = "select * from do_an.chitietpt where mapt=?";
    private final String findbyCM = "select * from do_an.chitietpt where cmnd=?";
    private final String getAll = "select * from do_an.chitietpt";
    
    private DataAccess dao;

    public CHITIETPT_DAO() throws SQLException {
        dao = new DataAccess();
    }
    public int insert(CHITIETPT_DTO obj) throws SQLException{
        int r;
        r = dao.executeUpdate(insert, obj.to_array());
        return r;
    }
    public int delete(CHITIETPT_DTO obj) throws SQLException{
        int r;
        r = dao.executeUpdate(delete, obj.to_array());
        return r;
    }
    public int deleteAll() throws SQLException{
        int r;
        r = dao.executeUpdate(delAll);
        return r;
    }
    public ResultSet findbyMA(String MA) throws SQLException{
        ResultSet rs;
        rs = dao.executeQuery(findbyMA, new String[]{MA});
        return rs;
    }
    public ArrayList<CHITIETPT_DTO> findbyCM(String CM) throws SQLException, Exception{
        ArrayList<CHITIETPT_DTO> _ds = new ArrayList<>();
        ResultSet rs;
        rs = dao.executeQuery(findbyCM, new String[]{CM});
        while(rs.next()){
            CHITIETPT_DTO temp;
            temp = new CHITIETPT_DTO(rs.getString(1),rs.getString(2));
            _ds.add(temp);
        }
        return _ds;
    }
    public ArrayList<CHITIETPT_DTO> getAll() throws SQLException, Exception{
        ArrayList<CHITIETPT_DTO> _ds = new ArrayList<>();
        ResultSet rs;
        rs = dao.executeQuery(getAll);
        while(rs.next()){
            CHITIETPT_DTO temp;
            temp = new CHITIETPT_DTO(rs.getString(1),rs.getString(2));
            _ds.add(temp);
        }
        return _ds;
    }
}
