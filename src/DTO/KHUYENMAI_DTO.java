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
public class KHUYENMAI_DTO {
    private String  _makm;
    private String  _tenkm;
    private String  _tile;
    
    public boolean ck_string(String abc){
        for(char i: abc.toCharArray())
            if (i<48 || i>57)
                return false;
        return true;
    }
    //method init
    public KHUYENMAI_DTO(){
        _makm ="";
        _tenkm = "";
        _tile = "";
    }
    public KHUYENMAI_DTO(String makm, String tenkm, String tile) throws Exception{
        if (ck_string(makm)==false)
            throw new Exception("*Mã khuyến mãi sai");
        if (Integer.parseInt(tile)<1||Integer.parseInt(tile)>25)
            throw new Exception("Sai tỉ lệ khuyến mãi (<25%)");
        _makm = makm;
        _tenkm = tenkm;
        _tile = tile;//(0,25)
    }
    //method set, get
    public String get_makm(){ return _makm; }
    public void set_makm(String makm) throws Exception{
        if (ck_string(makm)==false)
            throw new Exception("*Mã khuyến mãi sai");
        _makm = makm;
    }
    
    public String get_tenkm(){ return _tenkm; }
    public void set_tenkm(String tenkm){ _tenkm = tenkm; }
    
    public String get_tile(){ return _tile; }
    public void set_tile(String tile) throws Exception{
        if (Integer.parseInt(tile)<1||Integer.parseInt(tile)>25)
            throw new Exception("Sai tỉ lệ khuyến mãi (<25%)");
        _tile = tile;
    }
    //method to array
    public String[] to_array(){
        return new String[] {_makm,_tenkm,_tile};
    }
}
