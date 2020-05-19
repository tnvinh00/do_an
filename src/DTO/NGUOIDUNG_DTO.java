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
public class NGUOIDUNG_DTO {
    private String  _cmnd;
    private String  _matkhau;
    
    public boolean ck_string(String abc){
        for(char i: abc.toCharArray())
            if (i<48 || i>57)
                return false;
        return true;
    }
    //method init
    public NGUOIDUNG_DTO(){
        _cmnd = "";
        _matkhau = "";
    }
    public NGUOIDUNG_DTO(String cmnd, String matkhau) throws Exception{
        if (ck_string(cmnd)==false)
            throw new Exception("*Sai chứng minh nhân dân");
        _cmnd = cmnd;
        _matkhau = matkhau;
    }
    //method set, get
    public String get_cmnd(){ return _cmnd; }
    public void set_cmnd(String cmnd) throws Exception{
        if (ck_string(cmnd)==false)
            throw new Exception("*Sai chứng minh nhân dân");
        _cmnd = cmnd;
    }
    
    public String get_matkhau(){ return _matkhau; }
    public void set_matkhau(String matkhau){ _matkhau = matkhau; }
    //method to array, to string
    
    public String[] to_array(){
        return new String[] {_cmnd, _matkhau};
    }
}
