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
public class KHACHHANG_DAO {
    private final String insert = "insert into do_an.khachhang values(?,?,?,?)";
    private final String delete = "delete do_an.khachhang where cmnd=?";
    private final String updateObj = "update do_an.khachhang set hoten=?, loaikhach=?, diachi=? where cmnd=?";
    private final String findbyCM = "select * from do_an.khachhang where cmnd=?";
    private final String findbyHT = "select * from do_an.khachhang where hoten like ";
    private final String findbyLK = "select * from do_an.khachhang where loaikhach=?";
    private final String getAll = "select * from do_an.khachhang";
    
    private DataAccess dao;

    public KHACHHANG_DAO() throws SQLException {
        dao = new DataAccess();
    }
    public int insert(KHACHHANG_DTO obj) throws SQLException{
        int r;
        r = dao.executeUpdate(insert, obj.to_array());
        return r;
    }
    public int delete(KHACHHANG_DTO obj) throws SQLException, Exception{
        int r;
        r = dao.executeUpdate(delete, new String[]{obj.get_cmnd()});
        NGUOIDUNG_DAO obj1 = new NGUOIDUNG_DAO();
        obj1.delete(new NGUOIDUNG_DTO(obj.get_cmnd(),""));
        return r;
    }
    public int updateObj(KHACHHANG_DTO obj) throws SQLException{
        int r;
        r = dao.executeUpdate(updateObj, new String[]{obj.get_hoten(),
            obj.get_loaikhach(),obj.get_diachi(),obj.get_cmnd()});
        return r;
    }
    public KHACHHANG_DTO findbyCM(String CM) throws SQLException, Exception{
        ResultSet rs;
        rs = dao.executeQuery(findbyCM, new String[]{CM});
        if (rs.next()){
            KHACHHANG_DTO temp;
            temp = new KHACHHANG_DTO(rs.getString(1),
                    rs.getString(2),rs.getString(3),rs.getString(4));
            return temp;
        }
        return null;
    }
    public ArrayList<KHACHHANG_DTO> findbyHT(String ht) throws SQLException, Exception{
        ArrayList<KHACHHANG_DTO> _ds = new ArrayList<>();
        ResultSet rs;
        rs = dao.executeQuery(findbyHT+"'"+ht+"'");
        while(rs.next()){
            KHACHHANG_DTO temp;
            temp = new KHACHHANG_DTO(rs.getString(1),
                    rs.getString(2),rs.getString(3),rs.getString(4));
            _ds.add(temp);
        }
        return _ds;
    }
    public ArrayList<KHACHHANG_DTO> findbyLK(String lk) throws SQLException, Exception{
        ArrayList<KHACHHANG_DTO> _ds = new ArrayList<>();
        ResultSet rs;
        rs = dao.executeQuery(findbyLK,new String[]{lk});
        while(rs.next()){
            KHACHHANG_DTO temp;
            temp = new KHACHHANG_DTO(rs.getString(1),
                    rs.getString(2),rs.getString(3),rs.getString(4));
            _ds.add(temp);
        }
        return _ds;
    }
    public ArrayList<KHACHHANG_DTO> getAll() throws SQLException, Exception{
        ArrayList<KHACHHANG_DTO> _ds = new ArrayList<>();
        ResultSet rs;
        rs = dao.executeQuery(getAll);
        while(rs.next()){
            KHACHHANG_DTO temp;
            temp = new KHACHHANG_DTO(rs.getString(1),
                    rs.getString(2),rs.getString(3),rs.getString(4));
            _ds.add(temp);
        }
        return _ds;
    }
}
