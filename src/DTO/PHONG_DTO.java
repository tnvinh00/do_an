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
public class PHONG_DTO {
    private String  _sophong;
    private String  _loaiphong;
    private String  _sokhach;
    private String  _ghichu;
    
    public boolean ck_string(String abc){
        for(char i: abc.toCharArray())
            if (i<48 || i>57)
                return false;
        return true;
    }
    //method init
    public PHONG_DTO(){
        _sophong    ="";
        _loaiphong  ="";
        _sokhach    ="";
        _ghichu     ="";
    }
    public PHONG_DTO(String sophong, String loaiphong, String sokhach, String ghichu) throws Exception{
        if(ck_string(sophong)==false)
            throw new Exception("*Số phòng sai");
        if(loaiphong.length()!=1)
            throw new Exception("*Sai loại phòng");
        if(ck_string(sokhach))
            throw new Exception("*Số khách sai");
        _sophong = sophong;
        _loaiphong = loaiphong;
        _sokhach = sokhach;
        _ghichu = ghichu;
    }
    //method set, get
    public String get_sophong(){ return _sophong; }
    public void set_sophong(String sophong) throws Exception{
        if(ck_string(sophong)==false)
            throw new Exception("*Số phòng sai");
        _sophong = sophong;
    }
    
    public String get_loaiphong(){ return _loaiphong; }
    public void set_loaiphong(String loaiphong) throws Exception{
        if(loaiphong.length()!=1)
            throw new Exception("*Sai loại phòng");
        _loaiphong = loaiphong;
    }
    
    public String get_sokhach(){ return _sokhach; }
    public void set_sokhach(String sokhach) throws Exception{
        if(ck_string(sokhach))
            throw new Exception("*Số khách sai");
        _sokhach = sokhach;
    }
    
    public String get_ghichu(){ return _ghichu; }
    public void set_ghichu(String ghichu){ _ghichu = ghichu; }
    //method to array
    public String[] to_array(){
        return new String[] {_sophong,_loaiphong,_sokhach,_ghichu};
    }
}
