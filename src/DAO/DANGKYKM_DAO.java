/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.DANGKYKM_DTO;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author duyhi
 */
public class DANGKYKM_DAO {
    private final String insert = "insert into do_an.dangkykm(mapt, makm) values(?, ?)";
    private final String delete = "delete do_an.dangkykm where mapt=? and makm=?";
    private final String findbyMPT = "select * from do_an.dangkykm where mapt=?";

    private DataAccess dao;
    
    public DANGKYKM_DAO() throws SQLException{
        dao = new DataAccess();
    }
    public int insert(DANGKYKM_DTO obj) throws SQLException{
        int r;
        r = dao.executeUpdate(insert, obj.to_array());
        return r;
    }
    public int delete(DANGKYKM_DTO obj) throws SQLException{
        int r;
        r = dao.executeUpdate(delete, new String[]{obj.get_mapt(), obj.get_makm()});
        return r;
    }
    public DANGKYKM_DTO findbyMapt(String MA) throws SQLException, Exception{
        ResultSet rs;
        rs = dao.executeQuery(findbyMPT, new String[]{MA});
        if (rs.next()){
            DANGKYKM_DTO temp = new DANGKYKM_DTO(rs.getString(1), rs.getString(2), rs.getString(3));
            return temp;
        }
        return null;
    }
}
