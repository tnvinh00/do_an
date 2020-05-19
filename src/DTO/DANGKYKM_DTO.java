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
public class DANGKYKM_DTO {
    private String  _mapt;
    private String  _makm;
    private String  _ngaykm;
    
    public boolean ck_string(String abc){
        for(char i: abc.toCharArray())
            if (i<48 || i>57)
                return false;
        return true;
    }
    //method init
    public DANGKYKM_DTO(){
        _mapt ="";
        _makm = "";
        _ngaykm = "";
    }
    public DANGKYKM_DTO(String mapt, String makm, String ngaykm) throws Exception{
        if (ck_string(mapt)==false)
            throw new Exception("*Mã phiếu thuê sai");
        if (ck_string(makm)==false)
            throw new Exception("*Mã khuyến mãi sai");
        _mapt = mapt;
        _makm = makm;
        _ngaykm = ngaykm;
    }
    //method set, get
    public String get_mapt(){ return _mapt; }
    public void set_mapt(String mapt) throws Exception{
        if (ck_string(mapt)==false)
            throw new Exception("*Mã phiếu thuê sai");
        _mapt = mapt;
    }
    
    public String get_makm(){ return _makm; }
    public void set_makm(String makm) throws Exception{
        if (ck_string(makm)==false)
            throw new Exception("*Mã khuyến mãi sai");
        _makm = makm;
    }
    
    public String get_ngaykm(){ return _ngaykm; }
    public void set_ngaykm(String ngaykm){ _ngaykm = ngaykm; }
    //method to array
    public String[] to_array(){
        return new String[] {_mapt,_makm,_ngaykm};
    }
}
