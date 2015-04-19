/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desa;

/**
 *
 * @author Asus-PC
 */
public class Gaji {
    double g, tunjangan, pajak;
    void gajiTotall(double gp){
    
        tunjangan = (gp*0.45);
        pajak = 0.1*gp;
        g = (gp+tunjangan-pajak);
       
         
    }
    public double getGaji(){
        return g;
    }
}
