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
public class PHIEUTHUE_DTO {
    private String  _mapt;
    private String  _sophong;
    private String  _ngbd;
    private String  _ngkt;
    private String  _thanhtien;
    
    public boolean ck_string(String abc){
        for(char i: abc.toCharArray())
            if (i<48 || i>57)
                return false;
        return true;
    }
    //method init
    public PHIEUTHUE_DTO(){
        _mapt = "";
        _sophong = "";
        _ngbd = "";
        _ngkt = "";
        _thanhtien = "";
    }
    public PHIEUTHUE_DTO(String mapt, String sophong, String ngbd, String ngkt, String thanhtien) throws Exception{
        if (ck_string(mapt)==false)
            throw new Exception("*Mã phiếu thuê sai");
        if(ck_string(sophong)==false)
            throw new Exception("*Số phòng sai");
        _mapt = mapt;
        _sophong = sophong;
        _ngbd = ngbd;
        _ngkt = ngkt;
        _thanhtien = thanhtien;
    }
    //method set, get
    public String get_mapt(){ return _mapt; }
    public void set_mapt(String mapt){ _mapt = mapt; }
    
    public String get_sophong(){ return _sophong; }
    public void set_sophong(String sophong){ _sophong = sophong; }
    
    public String get_ngbd(){ return _ngbd; }
    public void set_ngbd(String ngbd){ _ngbd = ngbd; }
    
    public String get_ngkt(){ return _ngkt; }
    public void set_ngkt(String ngkt){ _ngkt = ngkt; }
    
    public String get_thanhtien(){ return _thanhtien; }
    public void set_thanhtien(String thanhtien){ _thanhtien = thanhtien; }
    //method to array
    public String[] to_array(){
        return new String[] {_mapt,_sophong,_ngbd,_ngkt,_thanhtien};
    }
}
