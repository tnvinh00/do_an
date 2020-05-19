/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author duyhi
 */
public class PHIEUTHUE_DAO {
    private final String insert = "insert into do_an.phieuthue(mapt, sophong) values(?,?)";
    private final String updateNGKT = "update do_an.phieuthue set ngkt = sysdate where mapt = ?";
    private final String findPT = "select * from do_an.phieuthue where mapt = ?";
    private final String findPhong = "select * from do_an.phieuthue where sophong = ?";
    
    
}
