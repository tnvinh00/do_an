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
public class LOAIKHACH_DTO {
    private String  _loaikhach;
    private String  _heso;
    
    public boolean check_hs(String hs){
        try{
            return Integer.parseInt(hs)>80 && Integer.parseInt(hs)<150;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
    //method init
    public LOAIKHACH_DTO(){
        _loaikhach ="";
        _heso = "";
    }
    public LOAIKHACH_DTO(String loaikhach, String heso) throws Exception{
        if(check_hs(heso)==false)
            throw new Exception("*Sai hệ số");
        _loaikhach = loaikhach;
        _heso = heso;
    }
    //method set, get
    public String get_loaikhach(){ return _loaikhach; }
    public void set_loaikhach(String loaikhach){ _loaikhach = loaikhach; }
    
    public String get_heso(){ return _heso; }
    public void set_heso(String heso) throws Exception{
        if(check_hs(heso)==false)
            throw new Exception("*Sai hệ số");
        _heso = heso;
    }
    //method to array
    public String[] to_array(){
        return new String[] {_loaikhach,_heso};
    }
}
