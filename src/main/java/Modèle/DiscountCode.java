/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modèle;

/**
 *
 * @author pedago
 */
public class DiscountCode {
    
    float taux;
    String code;
    
    public DiscountCode(String code,float taux){
        this.taux=taux;
        this.code=code;
    }
    
    public float getTaux(){
        return taux;
    }
    
    public String getCode(){
        return code;
    }
    
}
