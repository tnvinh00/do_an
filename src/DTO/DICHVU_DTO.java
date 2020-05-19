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
public class DICHVU_DTO {
    private String  _madv;
    private String  _tendv;
    private String  _gia;
    
    public boolean ck_string(String abc){
        for(char i: abc.toCharArray())
            if (i<48 || i>57)
                return false;
        return true;
    }
    //method init
    public DICHVU_DTO(){
        _madv ="";
        _tendv = "";
        _gia = "";
    }
    public DICHVU_DTO(String madv, String tendv, String gia) throws Exception{
        if (ck_string(madv)==false)
            throw new Exception("*Mã dịch vụ sai");
        if (ck_string(gia)==false)
            throw new Exception("*Giá dịch vụ sai");
        _madv = madv;
        _tendv = tendv;
        _gia = gia;
    }
    //method set, get
    public String get_madv(){ return _madv; }
    public void set_madv(String madv) throws Exception{
        if (ck_string(madv)==false)
            throw new Exception("*Mã dịch vụ sai");
        _madv = madv;
    }
    
    public String get_tendv(){ return _tendv; }
    public void set_tendv(String tendv){ _tendv = tendv; }
    
    public String get_gia(){ return _gia; }
    public void set_gia(String gia) throws Exception{
        if (ck_string(gia)==false)
            throw new Exception("*Giá dịch vụ sai");
        _gia = gia;
    }
    //method to array
    public String[] to_array(){
        return new String[] {_madv,_tendv,_gia};
    }
}
