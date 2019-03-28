/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miguelito
 */
public class Vectores extends Thread{
    //ATRIBUTOS
    LogicaRest restaurante;

    //CONSTRUCTOR
    public Vectores(LogicaRest restaurante) {
        this.restaurante = restaurante;
    }
    
    //START
    @Override
    public void run(){
        while(true){
            try{
                this.restaurante.getMesonE().imprimir();
                this.restaurante.getMesonPF().imprimir();
                this.restaurante.getMesonP().imprimir(); 
                this.sleep(1000);
            }catch(Exception e){
                Logger.getLogger(Vectores.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
    
}
