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
public class Consumidor extends Thread{
    //ATRIBUTOS
    private Semaphore SPE,SCE,SEE;
    private Semaphore SPPF,SCPF,SEPF;
    private Semaphore SPP,SCP,SEP;
    
    private int consumirE,consumirPF,consumirP;
    private LogicaRest restaurante;
    private Interfaz interfaz;
    private boolean trabajar = true;

    //CONSTRUCTOR
    public Consumidor(Semaphore SPE, Semaphore SCE, Semaphore SEE, Semaphore SPPF, Semaphore SCPF, Semaphore SEPF, Semaphore SPP, Semaphore SCP, Semaphore SEP, int consumirE, int consumirPF, int consumirP, LogicaRest restaurante, Interfaz interfaz) {
        this.SPE = SPE;
        this.SCE = SCE;
        this.SEE = SEE;
        this.SPPF = SPPF;
        this.SCPF = SCPF;
        this.SEPF = SEPF;
        this.SPP = SPP;
        this.SCP = SCP;
        this.SEP = SEP;
        this.consumirE = consumirE;
        this.consumirPF = consumirPF;
        this.consumirP = consumirP;
        this.restaurante = restaurante;
        this.interfaz = interfaz;
    }

    //GETTERS Y SETTERS
    public Semaphore getSPE() {
        return SPE;
    }

    public void setSPE(Semaphore SPE) {
        this.SPE = SPE;
    }

    public Semaphore getSCE() {
        return SCE;
    }

    public void setSCE(Semaphore SCE) {
        this.SCE = SCE;
    }

    public Semaphore getSEE() {
        return SEE;
    }

    public void setSEE(Semaphore SEE) {
        this.SEE = SEE;
    }

    public Semaphore getSPPF() {
        return SPPF;
    }

    public void setSPPF(Semaphore SPPF) {
        this.SPPF = SPPF;
    }

    public Semaphore getSCPF() {
        return SCPF;
    }

    public void setSCPF(Semaphore SCPF) {
        this.SCPF = SCPF;
    }

    public Semaphore getSEPF() {
        return SEPF;
    }

    public void setSEPF(Semaphore SEPF) {
        this.SEPF = SEPF;
    }

    public Semaphore getSPP() {
        return SPP;
    }

    public void setSPP(Semaphore SPP) {
        this.SPP = SPP;
    }

    public Semaphore getSCP() {
        return SCP;
    }

    public void setSCP(Semaphore SCP) {
        this.SCP = SCP;
    }

    public Semaphore getSEP() {
        return SEP;
    }

    public void setSEP(Semaphore SEP) {
        this.SEP = SEP;
    }

    public int getConsumirE() {
        return consumirE;
    }

    public void setConsumirE(int consumirE) {
        this.consumirE = consumirE;
    }

    public int getConsumirPF() {
        return consumirPF;
    }

    public void setConsumirPF(int consumirPF) {
        this.consumirPF = consumirPF;
    }

    public int getConsumirP() {
        return consumirP;
    }

    public void setConsumirP(int consumirP) {
        this.consumirP = consumirP;
    }

    public LogicaRest getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(LogicaRest restaurante) {
        this.restaurante = restaurante;
    }

    public Interfaz getInterfaz() {
        return interfaz;
    }

    public void setInterfaz(Interfaz interfaz) {
        this.interfaz = interfaz;
    }

    public boolean isTrabajar() {
        return trabajar;
    }

    public void setTrabajar(boolean trabajar) {
        this.trabajar = trabajar;
    }
    //FIN DE GETTERS Y SETTERS
    
    //CONSUMIR PLATOS ENTRADAS
    public void ComerPE(){
        this.restaurante.getMesonE().setArray(this.restaurante.getConsumirE(), 0);
        this.restaurante.setConsumirE((this.restaurante.getConsumirE()+1)%(this.restaurante.getMesonE().getTamaño()));
        if(this.restaurante.getEntradas()>0){
            this.restaurante.setEntradas(this.restaurante.getEntradas()-3);
            this.restaurante.getInterfaz().getCentrada().setText(Integer.toString(this.restaurante.getEntradas()));
        }
    }
    
    //CONSUMIR PLATOS FUERTES
    public void ComerPF(){
        this.restaurante.getMesonPF().setArray(this.restaurante.getConsumirPF(), 0);
        this.restaurante.setConsumirPF((this.restaurante.getConsumirPF()+1)%(this.restaurante.getMesonPF().getTamaño()));
        if(this.restaurante.getPfuertes()>0){
            this.restaurante.setPfuertes(this.restaurante.getPfuertes()-2);
            this.restaurante.getInterfaz().getCfuerte().setText(Integer.toString(this.restaurante.getPfuertes()));
        }
    }
    
    //CONSUMIR PLATOS POSTRES
    public void ComerP(){
        this.restaurante.getMesonP().setArray(this.restaurante.getConsumirP(), 0);
        this.restaurante.setConsumirP((this.restaurante.getConsumirP()+1)%(this.restaurante.getMesonP().getTamaño()));
        if(this.restaurante.getPostres()>0){
            this.restaurante.setPostres(this.restaurante.getPostres()-1);
            this.restaurante.getInterfaz().getCpostre().setText(Integer.toString(this.restaurante.getPostres()));
        }
    }
    
    //START
    @Override
    public void run(){
      while(trabajar){
          try{


              
              //CONSUMIENDO O COMIENDO PLATOS DE ENTRADA
              this.SCE.acquire(3);
              this.SEE.acquire();
              this.ComerPE();
              this.SEE.release();
              this.SPE.release(3);
                           
              //CONSUMIENDO O COMIENDO PLATOS FUERTES
              this.SCPF.acquire(2);
              this.SEPF.acquire();
              this.ComerPF();
              this.SEPF.release();
              this.SPPF.release(2);
              
                            //CONSUMIENDO O COMIENDO PLATOS DE POSTRES
              this.SCP.acquire();
              this.SEP.acquire();
              this.ComerP();
              this.SEP.release();
              this.SPP.release();

              
              //TIEMPO QUE TARDA HACIENDO SU FUNCION
              this.sleep((long) (1000*0.15));
              
              //INFORMACION EN INTERFAZ
              this.restaurante.setDepositoOrd(this.restaurante.getDepositoOrd()+1);
              this.restaurante.getInterfaz().getOrdenes().setText(Integer.toString(this.restaurante.getDepositoOrd()));
                
          }catch(Exception ex){
              Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
          }
      }  
    }
    
}
