/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.DANGKYDV_DTO;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author duyhi
 */
public class DANGKYDV_DAO {
    private final String insert_DKDV ="insert into do_an.DANGKYDV(mapt, madv) values(?,?)" ;
    private final String deleted_DKDV ="delete do_an.DANGKYDV where madv = ? and ngaysd=? and mapt=?";
    private final String findMA_DKDV="select * from do_an.DANGKYDV where madv=?";
    private final String findTEN_DKDV="select * from do_an.DANGKYDV where ngaysd=?";
    //dazsdxfgfchvhjbkjkm
    //âs
    private DataAccess dao; 
    
    public DANGKYDV_DAO() throws SQLException{
        dao = new DataAccess();
    }
    public int insert(DANGKYDV_DTO obj) throws SQLException{
        int r;
        r = dao.executeUpdate(insert_DKDV, obj.to_array());
        return r;
    }
    public int delete(DANGKYDV_DTO obj) throws SQLException{
        int r;
        r = dao.executeUpdate(insert_DKDV, new String[]{obj.get_mapt(), obj.get_madv()});
        return r;
    }
    public DANGKYDV_DTO findbyMapt(String MA) throws SQLException, Exception{
        ResultSet rs;
        rs = dao.executeQuery(findMA_DKDV, new String[]{MA});
        if (rs.next()){
            DANGKYDV_DTO temp;
            temp = new DANGKYDV_DTO(rs.getString(1), rs.getString(2), rs.getString(3));
            return temp;
        }
        return null;
    }
}
