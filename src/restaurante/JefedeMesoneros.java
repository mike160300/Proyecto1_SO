/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Miguelito
 */
public class JefedeMesoneros extends Thread{
    //ATRIBUTOS
    public LogicaRest restaurante;
    public Interfaz interfaz;
    private final Semaphore SEG;

    //CONSTRUCTOR
    public JefedeMesoneros(LogicaRest restaurante, Semaphore SEG) {
        this.restaurante = restaurante;
        this.interfaz = interfaz;
        this.SEG = SEG;
    }
    
    //METODO PARA IR REDUCIENDO LAS HORAS(SEGUNDOS)
    public void Contador(){
        if(this.restaurante.getTiempo()!= 0 && this.restaurante.getTiempo() > 0){
            this.restaurante.setTiempo(this.restaurante.getTiempo()-1);
            this.restaurante.getInterfaz().getJorden().setText(Integer.toString(this.restaurante.getTiempo()));
        }
    }
    
    //START
    @Override
    public void run(){
        while(true){
            try{
                this.restaurante.getInterfaz().getEstadoJ1().setText("Descansando");
                //DUERME CADA HORA
                this.sleep(1000);
                this.restaurante.getInterfaz().getEstadoJ1().setText("Trabajando");
                
                SEG.acquire();
                //TIEMPO QUE TARDA EN HACER SU FUNCION
                this.sleep((long) (1000*0.05));
                this.Contador();
                SEG.release();
            
            }catch (InterruptedException ex) {
              Logger.getLogger(JefedeMesoneros.class.getName()).log(Level.SEVERE, null, ex);
          }
        }
    }
}
