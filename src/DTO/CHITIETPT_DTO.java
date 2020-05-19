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
public class CHITIETPT_DTO {
    private String  _mapt;
    private String  _cmnd;
    
    public boolean ck_string(String abc){
        for(char i: abc.toCharArray())
            if (i<48 || i>57)
                return false;
        return true;
    }
    //method init
    public CHITIETPT_DTO(){
        _mapt ="";
        _cmnd = "";
    }
    public CHITIETPT_DTO(String mapt, String cmnd) throws Exception{
        if (ck_string(cmnd)==false)
            throw new Exception("*Sai chứng minh nhân dân");
        if (ck_string(mapt)==false)
            throw new Exception("*Mã phiếu thuê sai");
        _mapt = mapt;
        _cmnd = cmnd;
    }
    //method set, get
    public String get_mapt(){ return _mapt; }
    public void set_mapt(String mapt) throws Exception{
        if (ck_string(mapt)==false)
            throw new Exception("*Mã phiếu thuê sai");
        _mapt = mapt;
    }
    
    public String get_cmnd(){ return _cmnd; }
    public void set_cmnd(String cmnd) throws Exception{
        if (ck_string(cmnd)==false)
            throw new Exception("*Sai chứng minh nhân dân");
        _cmnd = cmnd; 
    }
    //method to array
    public String[] to_array(){
        return new String[] {_mapt,_cmnd};
    }
}
