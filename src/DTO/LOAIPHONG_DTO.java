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
public class LOAIPHONG_DTO {
    private String  _loaiphong;
    private String  _dongia;
    
    public boolean ck_string(String abc){
        for(char i: abc.toCharArray())
            if (i<48 || i>57)
                return false;
        return true;
    }
    //method init
    public LOAIPHONG_DTO(){
        _loaiphong = "";
        _dongia = "";
    }
    public LOAIPHONG_DTO(String loaiphong, String dongia) throws Exception{
        if(loaiphong.length()!=1)
            throw new Exception("*Sai loại phòng");
        if(ck_string(dongia)==false)
            throw new Exception("*Đơn giá sai");
        _loaiphong = loaiphong;
        _dongia = dongia;
    }
    //method set, get
    public String get_loaiphong(){ return _loaiphong; }
    public void set_loaiphong(String loaiphong) throws Exception{
        if(loaiphong.length()!=1)
            throw new Exception("*Sai loại phòng");
        _loaiphong = loaiphong;
    }
    
    public String get_dongia(){ return _dongia; }
    public void set_dongia(String dongia) throws Exception{
        if(ck_string(dongia)==false)
            throw new Exception("*Đơn giá sai");
        _dongia = dongia;
    }
    //method to array, to string
    public String[] to_array(){
        return new String[] {_loaiphong, _dongia};
    }
}
