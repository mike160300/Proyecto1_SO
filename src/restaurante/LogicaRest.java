/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import java.util.concurrent.Semaphore;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguelito
 */
public class LogicaRest {
    //LOGICA DE NUESTRO RESTAURANTE
    
    //ATRIBUTOS
    private Productor cocineroE[],cocineroPF[],cocineroP[];
    private Consumidor mesonero[];
    
    private int tiempoSprog;
    private int mesonEnt,mesonPlatF,mesonPost;
    private int inicialCEnt,inicialCPF,inicialCPost;
    private int maxCEnt,maxCPF,maxCPost;
    private int inicialMes,maxMes;
    
    private Deposito MesonE,MesonPF,MesonP;
    private Deposito depMesonero;
    
    private Semaphore SPE,SCE,SEE;
    private Semaphore SPPF,SCPF,SEPF;
    private Semaphore SPP,SCP,SEP;
    private Semaphore SEG,SD;
    
    private int platosE=0,platosPF=0,platosP=0;
    private int entradas=0,Pfuertes=0,postres=0;
    private int consumirE=0,consumirPF=0,consumirP=0;
    private int ID,trabajo;
    private int DepositoOrd = 0;
    
    private Gerente gerente;
    private JefedeMesoneros JM;
    private Interfaz interfaz;
    private LogicaRest restaurante;
    private int tiempo = this.tiempoSprog;
    //FIN DE LOS ATRIBUTOS
    
    //CONSTRUCTOR
    public LogicaRest(){
        this.restaurante=this;
    }
    
    //FUNCION PARA LEER LOS DATOS DEL ARCHIVO DE TEXTO
    public void LeerDatosIniciales() throws FileNotFoundException{
        Scanner d = new Scanner(new File("C:\\Users\\migue\\Desktop\\Restaurante\\src\\restaurante\\Inicial.txt"));
        String line=d.nextLine();
    
        this.tiempoSprog= parseInt(line.substring(20,25).trim());
        System.out.println(this.tiempoSprog);
        line=d.nextLine();
        if(this.tiempoSprog<0){
            JOptionPane.showMessageDialog(null, "Dato invalido");  
        }
      
        this.mesonEnt= parseInt(line.substring(20,25).trim());
        System.out.println(this.mesonEnt);
        line=d.nextLine();
        if(this.mesonEnt<0){
            JOptionPane.showMessageDialog(null, "Dato invalido");
        }

        this.mesonPlatF= parseInt(line.substring(20,25).trim());
        System.out.println(this.mesonPlatF);
        line=d.nextLine();
        if(this.mesonPlatF<0){
            JOptionPane.showMessageDialog(null, "Dato invalido");
        }
    
        this.mesonPost= parseInt(line.substring(20,25).trim());
        System.out.println(this.mesonPost);
        line=d.nextLine();
        if(this.mesonPost<0){
            JOptionPane.showMessageDialog(null, "Dato invalido");
        }
        
        this.inicialCEnt= parseInt(line.substring(20,25).trim());
        System.out.println(this.inicialCEnt);
        line=d.nextLine();
        if(this.inicialCEnt<0){
            JOptionPane.showMessageDialog(null, "Dato invalido");
        }
        
        this.inicialCPF= parseInt(line.substring(20,25).trim());
        System.out.println(this.inicialCPF);
        line=d.nextLine();
        if(this.inicialCPF<0){
            JOptionPane.showMessageDialog(null, "Dato invalido");
        }
        
        this.inicialCPost= parseInt(line.substring(20,25).trim());
        System.out.println(this.inicialCPost);
        line=d.nextLine();
        if(this.inicialCPost<0){
            JOptionPane.showMessageDialog(null, "Dato invalido");
        }
        
        this.maxCEnt= parseInt(line.substring(20,25).trim());
        System.out.println(this.maxCEnt);
        line=d.nextLine();
        if(this.maxCEnt<0){
            JOptionPane.showMessageDialog(null, "Dato invalido");
        }
        
        this.maxCPF= parseInt(line.substring(20,25).trim());
        System.out.println(this.maxCPF);
        line=d.nextLine();
        if(this.maxCPF<0){
            JOptionPane.showMessageDialog(null, "Dato invalido");
        }
        
        this.maxCPost= parseInt(line.substring(20,25).trim());
        System.out.println(this.maxCPost);
        line=d.nextLine();
        if(this.maxCPost<0){
            JOptionPane.showMessageDialog(null, "Dato invalido");
        }
        
        this.inicialMes= parseInt(line.substring(20,25).trim());
        System.out.println(this.inicialMes);
        line=d.nextLine();
        if(this.inicialMes<0){
            JOptionPane.showMessageDialog(null, "Dato invalido");
        }
        
        this.maxMes= parseInt(line.substring(20,25).trim());
        System.out.println(this.maxMes);
        line=d.nextLine();
        if(this.maxMes<0){
            JOptionPane.showMessageDialog(null, "Dato invalido");
        }
    }
    
    //METODO QUE CREA LOS MESONES
    public void CrearMesones(){
        this.MesonE= new Deposito(this.mesonEnt);
        this.MesonPF= new Deposito(this.mesonPlatF);
        this.MesonP= new Deposito(this.mesonPost);
    }
    
    //METODO PARA ASIGNAR EL TAMAÑO A LOS VECTORES DE LOS PRODUCTORES(COCINEROS) Y CONSUMIDORES(MESONEROS)
    public void CantidadMaxima(){
        this.cocineroE = new Productor[this.maxCEnt];
        this.cocineroPF = new Productor[this.maxCPF];
        this.cocineroP = new Productor[this.maxCPost];
        this.mesonero = new Consumidor[this.maxMes];
    }
    
    
    
    //METODO PARA CREAR COCINEROS INICIALES
    public void CrearCocinerosIniciales(){
        for(int i=0; i<this.inicialCEnt; i++){
            this.cocineroE[i] = new Productor(this.SEE, this.SPE, this.SCE, this.MesonE, this.restaurante,1, 25);
        }
        
        for(int i=0; i<this.inicialCPF; i++){
            this.cocineroPF[i] = new Productor(this.SEPF, this.SPPF, this.SCPF, this.MesonPF, this.restaurante,2, 33);
        }
        
        for(int i=0; i<this.inicialCPost; i++){
            this.cocineroP[i] = new Productor(this.SEP, this.SPP, this.SCP, this.MesonP, this.restaurante,3, 30);
        }
    }
    
    //METODOS PARA CREAR MESONEROS INICIALES
    public void CrearMesoneros(){
        for (int i = 0; i < this.inicialMes ; i++) {
            this.mesonero[i] = new Consumidor(this.SPE,this.SCE,this.SEE,this.SPPF,this.SCPF,this.SEPF,this.SPP,this.SCP,this.SEP,this.consumirE,this.consumirPF,this.consumirP,this.restaurante,this.interfaz);
        }
    }

    //METODO PARA CREAR SEMAFOROS RESPECTIVOS
    public void CrearSemaforos(){
        this.SPE = new Semaphore(this.MesonE.getTamaño());
        this.SEE = new Semaphore(1);
        this.SCE = new Semaphore(0);
        
        this.SPPF = new Semaphore(this.MesonPF.getTamaño());
        this.SEPF = new Semaphore(1);
        this.SCPF = new Semaphore(0);
        
        this.SPP = new Semaphore(this.MesonP.getTamaño());
        this.SEP = new Semaphore(1);
        this.SCP = new Semaphore(0);

        this.SEG=new Semaphore(1);
        this.SD=new Semaphore(1);
    }
    
    //METODO PARA CREAR EL JEFE DE MESONEROS Y QUE EMPIECE DIRECTAMENTE 
    public void CrearJefeMes(){
        this.JM= new JefedeMesoneros(this.restaurante,this.SEG);
        JM.start();
    }
    
    //METODO PARA CREAR EL GERENTE Y QUE EMPIECE DIRECTAMENTE
    public void CrearGerente(){
        this.gerente= new Gerente(this.restaurante,this.SEG,this.SD,this.DepositoOrd);
        gerente.start();
    }
    
    //METODO PARA ASGINAR AL RESTAURANTES LOS PRODUCTORES(COCINEROS)
    public void RestCocineros(LogicaRest restaurante){
        for (int i = 0; i < this.maxCEnt; i++) {
            if(this.cocineroE[i] != null){
                this.cocineroE[i].setLog(restaurante);
            }
        }
        
        for (int i = 0; i < this.maxCPF; i++) {
            if(this.cocineroPF[i] != null){
                this.cocineroPF[i].setLog(restaurante);
            }
        }
        
        for (int i = 0; i < this.maxCPost; i++) {
            if(this.cocineroP[i] != null){
                this.cocineroP[i].setLog(restaurante);
            }
        }
    }
    
    //METODOS PARA ASIGNAR AL RESTAURANTE LOS CONSUMIDORES(MESONEROS)
    public void RestMesoneros(LogicaRest restaurante){
        for (int i = 0; i < this.maxMes; i++) {
            if(this.mesonero[i] != null){
                this.mesonero[i].setRestaurante(restaurante);
            }
        }
    }
    
    //METODO QUE INICIA A LOS COCINEROS DE CADA TIPO Y A LOS MESONEROS
    public void Start(){
        for (int i = 0; i < this.cocineroE.length; i++) {
            if(this.cocineroE[i]!=null){
                this.cocineroE[i].start();
            }
        }
        for (int i = 0; i < this.cocineroPF.length; i++) {
            if(this.cocineroPF[i]!=null){
                this.cocineroPF[i].start();
            }
        }
        for (int i = 0; i < this.cocineroP.length; i++) {
            if(this.cocineroP[i]!=null){
                this.cocineroP[i].start();
            }
        }
        for (int i = 0; i < this.mesonero.length; i++) {
            if(this.mesonero[i]!=null){
                this.mesonero[i].start();
            }
        }
        
        this.restaurante.interfaz.getEntrada().setText(Integer.toString(this.restaurante.getInicialCEnt()));
        this.restaurante.interfaz.getPfuertes1().setText(Integer.toString(this.restaurante.getInicialCPF()));
        this.restaurante.interfaz.getPostres().setText(Integer.toString(this.restaurante.getInicialCPost()));
        this.restaurante.interfaz.getMesoneros().setText(Integer.toString(this.restaurante.getInicialMes()));
        
        this.CrearGerente();
        this.CrearJefeMes();
        this.restaurante.interfaz.getJorden().setText(Integer.toString(this.restaurante.tiempoSprog));
    }
    
    //GETTERS Y SETTERS
    public Productor[] getCocineroE() {
        return cocineroE;
    }

    public void setCocineroE(Productor[] cocineroE) {
        this.cocineroE = cocineroE;
    }

    public Productor[] getCocineroPF() {
        return cocineroPF;
    }

    public void setCocineroPF(Productor[] cocineroPF) {
        this.cocineroPF = cocineroPF;
    }

    public Productor[] getCocineroP() {
        return cocineroP;
    }

    public void setCocineroP(Productor[] cocineroP) {
        this.cocineroP = cocineroP;
    }

    public Consumidor[] getMesonero() {
        return mesonero;
    }

    public void setMesonero(Consumidor[] mesonero) {
        this.mesonero = mesonero;
    }

    public int getTiempoSprog() {
        return tiempoSprog;
    }

    public void setTiempoSprog(int tiempoSprog) {
        this.tiempoSprog = tiempoSprog;
    }

    public int getMesonEnt() {
        return mesonEnt;
    }

    public void setMesonEnt(int mesonEnt) {
        this.mesonEnt = mesonEnt;
    }

    public int getMesonPlatF() {
        return mesonPlatF;
    }

    public void setMesonPF(int mesonPlatF) {
        this.mesonPlatF = mesonPlatF;
    }

    public int getMesonPost() {
        return mesonPost;
    }

    public void setMesonPost(int mesonPost) {
        this.mesonPost = mesonPost;
    }

    public int getInicialCEnt() {
        return inicialCEnt;
    }

    public void setInicialCEnt(int inicialCEnt) {
        this.inicialCEnt = inicialCEnt;
    }

    public int getInicialCPF() {
        return inicialCPF;
    }

    public void setInicialCPF(int inicialCPF) {
        this.inicialCPF = inicialCPF;
    }

    public int getInicialCPost() {
        return inicialCPost;
    }

    public void setInicialCPost(int inicialCPost) {
        this.inicialCPost = inicialCPost;
    }

    public int getMaxCEnt() {
        return maxCEnt;
    }

    public void setMaxCEnt(int maxCEnt) {
        this.maxCEnt = maxCEnt;
    }

    public int getMaxCPF() {
        return maxCPF;
    }

    public void setMaxCPF(int maxCPF) {
        this.maxCPF = maxCPF;
    }

    public int getMaxCPost() {
        return maxCPost;
    }

    public void setMaxCPost(int maxCPost) {
        this.maxCPost = maxCPost;
    }

    public int getInicialMes() {
        return inicialMes;
    }

    public void setInicialMes(int inicialMes) {
        this.inicialMes = inicialMes;
    }

    public int getMaxMes() {
        return maxMes;
    }

    public void setMaxMes(int maxMes) {
        this.maxMes = maxMes;
    }

    public Deposito getMesonE() {
        return MesonE;
    }

    public void setMesonE(Deposito MesonE) {
        this.MesonE = MesonE;
    }

    public Deposito getMesonPF() {
        return MesonPF;
    }

    public void setMesonPF(Deposito MesonPF) {
        this.MesonPF = MesonPF;
    }

    public Deposito getMesonP() {
        return MesonP;
    }

    public void setMesonP(Deposito MesonP) {
        this.MesonP = MesonP;
    }

    public Deposito getDepMesonero() {
        return depMesonero;
    }

    public void setDepMesonero(Deposito depMesonero) {
        this.depMesonero = depMesonero;
    }

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

    public int getPlatosE() {
        return platosE;
    }

    public void setPlatosE(int platosE) {
        this.platosE = platosE;
    }

    public int getPlatosPF() {
        return platosPF;
    }

    public void setPlatosPF(int platosPF) {
        this.platosPF = platosPF;
    }

    public int getPlatosP() {
        return platosP;
    }

    public void setPlatosP(int platosP) {
        this.platosP = platosP;
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

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public JefedeMesoneros getJG() {
        return JM;
    }

    public void setJG(JefedeMesoneros JG) {
        this.JM = JM;
    }

    public Interfaz getInterfaz() {
        return interfaz;
    }

    public void setInterfaz(Interfaz interfaz) {
        this.interfaz = interfaz;
    }

    public LogicaRest getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(LogicaRest restaurante) {
        this.restaurante = restaurante;
    }

    public int getEntradas() {
        return entradas;
    }

    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }

    public int getPfuertes() {
        return Pfuertes;
    }

    public void setPfuertes(int Pfuertes) {
        this.Pfuertes = Pfuertes;
    }

    public int getPostres() {
        return postres;
    }

    public void setPostres(int postres) {
        this.postres = postres;
    }

    public int getDepositoOrd() {
        return DepositoOrd;
    }

    public void setDepositoOrd(int DepositoOrd) {
        this.DepositoOrd = DepositoOrd;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    //FIN DE GETTERS Y SETTERS
}


