/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Miguelito
 */
public class Gerente extends Thread{
    //ATTRIBUTOS
    private LogicaRest restaurante;
    private Semaphore SEG;
    private Semaphore SD;
    
    private boolean trabajar = true;
    private int ordenesA;
    private int x;
    private JefedeMesoneros jefeM;

    //CONSTRUCTOR
    public Gerente(LogicaRest restaurante, Semaphore SEG, Semaphore SD, int ordenesA) {
        this.restaurante = restaurante;
        this.SEG = SEG;
        this.SD = SD;
        this.ordenesA = ordenesA;
    }
    
    //METODO PARA MANDAR A PAGAR TODAS LAS ORDENES
    public void PagarOrdenes() throws InterruptedException{
       this.SD.acquire(1);
       this.restaurante.setDepositoOrd(0);
       this.restaurante.getInterfaz().getOrdenes().setText(Integer.toString(this.restaurante.getDepositoOrd()));
       this.SD.release();   
    }
    
    //METODO PARA EL TIEMPO DE DESCANDO DEL GERENTE
     public void Descansar(){
        try {
            Random z = new Random();
            if(this.restaurante.getTiempo() != 0){
                this.x=25+(z.nextInt(20));
            }else{
                this.x=0;
            }
            this.restaurante.getInterfaz().getEstadoG().setText("Descansando");
            //TIEMPO RANDOM QUE DESCANSA
            this.sleep(this.x*10);
            this.restaurante.getInterfaz().getEstadoG().setText("Trabajando");
        } catch (InterruptedException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    //START
    @Override
    public void run(){
        while(trabajar){
            try {
                SEG.acquire(1);
                    if(this.restaurante.getTiempo()==0){
                        //TIEMPO QUE TARDA EN HACER SU FUNCION
                        this.sleep((long) (1000*0.1));
                        this.PagarOrdenes();
                        this.restaurante.setTiempo(this.restaurante.getTiempoSprog());
                        this.restaurante.getInterfaz().getJorden().setText(Integer.toString(this.restaurante.getTiempo()));
                        this.restaurante.getInterfaz().getOrdenes().setText(Integer.toString(this.restaurante.getDepositoOrd()));
                    }
                SEG.release(1);
                this.Descansar();
            } catch (InterruptedException ex) {
                Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
    
    //GETTERS Y SETTERS
    public LogicaRest getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(LogicaRest restaurante) {
        this.restaurante = restaurante;
    }

    public Semaphore getSEG() {
        return SEG;
    }

    public void setSEG(Semaphore SEG) {
        this.SEG = SEG;
    }

    public Semaphore getSD() {
        return SD;
    }

    public void setSD(Semaphore SD) {
        this.SD = SD;
    }

    public boolean isTrabajar() {
        return trabajar;
    }

    public void setTrabajar(boolean trabajar) {
        this.trabajar = trabajar;
    }

    public int getOrdenesA() {
        return ordenesA;
    }

    public void setOrdenesA(int ordenesA) {
        this.ordenesA = ordenesA;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public JefedeMesoneros getJefeM() {
        return jefeM;
    }

    public void setJefeM(JefedeMesoneros jefeM) {
        this.jefeM = jefeM;
    }
    //FIN DE GETTERS Y SETTERS
}
