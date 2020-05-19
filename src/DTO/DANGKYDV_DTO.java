/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author duyhi
 */
public class DANGKYDV_DTO {
    private String  _mapt;
    private String  _madv;
    private String  _ngaysd;
    //ađâ
    //ađâ
    
    public boolean ck_string(String abc){
        for(char i: abc.toCharArray())
            if (i<48 || i>57)
                return false;
        return true;
    }
    //method init
    public DANGKYDV_DTO(){
        _mapt ="";
        _madv = "";
        _ngaysd = "";
    }
    public DANGKYDV_DTO(String mapt, String madv, String ngaysd) throws Exception{
        if (ck_string(mapt)==false)
            throw new Exception("*Mã phiếu thuê sai");
        if (ck_string(madv)==false)
            throw new Exception("*Mã dịch vụ sai");
        
        _mapt = mapt;
        _madv = madv;
        _ngaysd = ngaysd;
    }
    //method set, get
    public String get_mapt(){ return _mapt; }
    public void set_mapt(String mapt) throws Exception{
        if (ck_string(mapt)==false)
            throw new Exception("*Mã phiếu thuê sai");
        _mapt = mapt; 
    }
    
    public String get_madv(){ return _madv; }
    public void set_madv(String madv) throws Exception{
        if (ck_string(madv)==false)
            throw new Exception("*Mã dịch vụ sai");
        _madv = madv; 
    }
    
    public String get_ngaysd(){ return _ngaysd; }
    public void set_ngaysd(String ngaysd){ _ngaysd = ngaysd; }
    //method to array
    public String[] to_array(){
        return new String[] {_mapt,_madv,_ngaysd};
    }
}
