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
public class Productor extends Thread{
    //ATRIBUTOS
    private Semaphore SE,SP,SC;
    private Deposito MesonT;
    private LogicaRest restaurante;
    private int ID, trabajo;
    private boolean trabajar=true;

    //CONSTRUCTOR
    public Productor(Semaphore SE, Semaphore SP, Semaphore SC, Deposito MesonT, LogicaRest restaurante, int ID, int trabajo) {
        this.SE = SE;
        this.SP = SP;
        this.SC = SC;
        this.MesonT = MesonT;
        this.restaurante = restaurante;
        this.ID = ID;
        this.trabajo = trabajo;
    }

    //GETTERS Y SETTERS
    public Semaphore getSE() {
        return SE;
    }

    public void setSE(Semaphore SE) {
        this.SE = SE;
    }

    public Semaphore getSP() {
        return SP;
    }

    public void setSP(Semaphore SP) {
        this.SP = SP;
    }

    public Semaphore getSC() {
        return SC;
    }

    public void setSC(Semaphore SC) {
        this.SC = SC;
    }

    public Deposito getMesonT() {
        return MesonT;
    }

    public void setMesonT(Deposito MesonT) {
        this.MesonT = MesonT;
    }

    public LogicaRest getRestaurante() {
        return restaurante;
    }

    public void setLog(LogicaRest restaurante) {
        this.restaurante = restaurante;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(int trabajo) {
        this.trabajo = trabajo;
    }

    public boolean isTrabajar() {
        return trabajar;
    }

    public void setTrabajar(boolean trabajar) {
        this.trabajar = trabajar;
    }
    //FIN DE GETTERS Y SETTERS
    
    //METODO QUE PRODUCE(COCINA) LOS RESPECTIVOS PLATOS
    public void Cocinar() throws InterruptedException{
        if(this.ID==1){//IF SI EL ID ES 1 QUE VA CON RESPECTO A LOS COCINEROS DE ENTRADA
            //TIEMPO QUE TARDA EN PRODUCIR(COCINAR) UNA ENTRADA
            this.sleep((long) (1000*0.25));
            this.restaurante.getMesonE().setArray(this.restaurante.getPlatosE(), this.ID);
            this.restaurante.setPlatosE((this.restaurante.getPlatosE()+1)%this.restaurante.getMesonE().getTamaño());
            this.restaurante.setEntradas(this.restaurante.getEntradas()+1);
            if(this.restaurante.getEntradas()<=this.restaurante.getMesonEnt()){
                this.restaurante.getInterfaz().getCentrada().setText(Integer.toString(this.restaurante.getEntradas()));
            }
        } else if(this.ID==2){//IF SI EL ID ES 2 QUE VA CON RESPECTO A LOS COCINEROS DE PLATOS FUERTES
            //TIEMPO QUE TARDA EN PRODUCIR(COCINAR) UN PLATO FUERTE
            this.sleep((long) (1000*0.33));
            this.restaurante.getMesonPF().setArray(this.restaurante.getPlatosPF(), this.ID);
            this.restaurante.setPlatosPF((this.restaurante.getPlatosPF()+1)%this.restaurante.getMesonPF().getTamaño());
            this.restaurante.setPfuertes(this.restaurante.getPfuertes()+1);
            if(this.restaurante.getPfuertes()<=this.restaurante.getMesonPlatF()){
                this.restaurante.getInterfaz().getCfuerte().setText(Integer.toString(this.restaurante.getPfuertes()));
            }
        } else if(this.ID==3){//IF SI EL ID ES 3 QUE VA CON RESPECTO A LOS COCINEROS DE POSTRES
            //TIEMPO QUE TARDA EN PRODUCIR(COCINAR) UN POSTRE
            this.sleep((long) (1000*0.30));
            this.restaurante.getMesonP().setArray(this.restaurante.getPlatosP(), this.ID);
            this.restaurante.setPlatosP((this.restaurante.getPlatosP()+1)%this.restaurante.getMesonP().getTamaño());
            this.restaurante.setPostres(this.restaurante.getPostres()+1);
            if(this.restaurante.getPostres()<=this.restaurante.getMesonPost()){
                this.restaurante.getInterfaz().getCpostre().setText(Integer.toString(this.restaurante.getPostres()));
            }
        }
    }
    
    //START
    @Override
    public void run(){
        while(trabajar){
            try{
                this.SP.acquire();
                this.SE.acquire();
                this.Cocinar();
                this.SE.release();
                this.SC.release();
                this.sleep(1000);
            }catch(Exception e){
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
}
