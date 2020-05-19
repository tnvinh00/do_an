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
public class KHACHHANG_DTO {
    private String  _cmnd;
    private String  _hoten;
    private String  _loaikhach;
    private String  _diachi;
    
    public boolean ck_string(String abc){
        for(char i: abc.toCharArray())
            if (i<48 || i>57)
                return false;
        return true;
    }
    //method init
    public KHACHHANG_DTO(){
        _cmnd = "";
        _hoten = "";
        _loaikhach ="";
        _diachi ="";
    }
    public KHACHHANG_DTO(String cmnd, String hoten, String loaikhach, String diachi) throws Exception{
        if (ck_string(cmnd)==false)
            throw new Exception("*Sai chứng minh nhân dân");
        _cmnd = cmnd;
        _hoten = hoten;
        _loaikhach = loaikhach;
        _diachi = diachi;
    }
    //method set, get
    public String get_cmnd(){ return _cmnd; }
    public void set_cmnd(String cmnd) throws Exception{
        if (ck_string(cmnd)==false)
            throw new Exception("*Sai chứng minh nhân dân");
        _cmnd = cmnd;
    }
    
    public String get_hoten(){ return _hoten; }
    public void set_hoten(String hoten){ _hoten = hoten; }
    
    public String get_loaikhach(){ return _loaikhach; }
    public void set_loaikhach(String loaikhach) throws Exception{ _loaikhach = loaikhach; }
    
    public String get_diachi(){ return _diachi; }
    public void set_diachi(String diachi){ _diachi = diachi; }
    //method to array
    public String[] to_array(){
        return new String[] {_cmnd,_hoten,_loaikhach,_diachi};
    }
}
