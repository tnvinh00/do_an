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
public class LOAIPHONG_DAO {
    private final String insert = "insert into do_an.loaiphong values(?,?)";
    private final String updateObj = "update do_an.loaiphong set dongia=? where loaiphong=?";
    private final String updateAll = "update do_an.loaiphong set dongia=?";
    private final String delete = "delete do_an.loaiphong where loaiphong=?";
    private final String delAll = "delete do_an.loaiphong";
    private final String findbyLP = "select * from do_an.loaiphong where loaiphong=?";
    private final String getAll = "select * from do_an.loaiphong";
    
    private DataAccess dao;

    public LOAIPHONG_DAO() throws SQLException {
        dao = new DataAccess();
    } 
    public int insert(LOAIPHONG_DTO obj) throws SQLException{
        int r;
        r = dao.executeUpdate(insert, obj.to_array());
        return r;
    }
    public int updateObj(LOAIPHONG_DTO obj) throws SQLException{
        int r;
        String para[] = {obj.get_dongia(),obj.get_loaiphong()};
        r = dao.executeUpdate(updateObj, para);
        return r;
    }
    public int updateAll(String dongia) throws SQLException{
        int r;
        String para[] = {dongia};
        r = dao.executeUpdate(updateAll, para);
        return r;
    }
    public int delete(LOAIPHONG_DTO obj) throws SQLException{
        int r;
        r = dao.executeUpdate(delete, new String[]{obj.get_loaiphong()});
        return r;
    }
    public int deleteAll() throws SQLException{
        int r;
        r = dao.executeUpdate(delAll);
        return r;
    }
    public LOAIPHONG_DTO findbyLP(String LP) throws SQLException, Exception{
        ResultSet rs;
        rs = dao.executeQuery(findbyLP, new String[]{LP});
        if(rs.next()){
            LOAIPHONG_DTO lp;
            lp = new LOAIPHONG_DTO(rs.getString(1),rs.getString(2));
            return lp;
        }
        return null;
    }
    public ArrayList<LOAIPHONG_DTO> getAll() throws SQLException, Exception{
        ArrayList<LOAIPHONG_DTO> _ds = new ArrayList<>();
        ResultSet rs;
        rs = dao.executeQuery(getAll);
        while(rs.next()){
            LOAIPHONG_DTO temp;
            temp = new LOAIPHONG_DTO(rs.getString(1),rs.getString(2));
            _ds.add(temp);
        }
        return _ds;
    }
}
