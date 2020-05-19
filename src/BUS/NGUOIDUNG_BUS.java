/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;
import DAO.*;
import DTO.*;
import java.sql.SQLException;

/**
 *
 * @author duyhuy
 */
public class NGUOIDUNG_BUS {
    NGUOIDUNG_DAO dao;
    
    //method init
    public NGUOIDUNG_BUS() throws SQLException{
        dao = new NGUOIDUNG_DAO();
    }
    public boolean kt_nguoidung(String cmnd, String matkhau) throws Exception{
        if(cmnd.equals("system")){
            NGUOIDUNG_DTO ql = dao.getQL();
            if (ql.get_matkhau().equals(matkhau))
                return true;
        }
        else{
            NGUOIDUNG_DTO nd = dao.findbyCM(cmnd);
            if (nd.get_matkhau().equals(matkhau))
                return true;
        }
        return false;
    }
    public void doimk_QL(String pwd, String mkc, String mkm, String xnl) throws SQLException, Exception{
        //return dao.updateQL(mk) > 0;
        //NGUOIDUNG_DTO ql = dao.getQL();
        if (pwd.equals(mkc) && mkm.equals(xnl) && mkc.equals(mkm)==false)
            dao.updateQL(mkm);
        else if (!pwd.equals(mkc))
            throw new Exception("*Mật khẩu sai");
        else if (mkc.equals(mkm))
            throw new Exception("*Trùng với mật khẩu cũ");
        else
            throw new Exception("*Xác nhận mật khẩu sai");
    }
}
