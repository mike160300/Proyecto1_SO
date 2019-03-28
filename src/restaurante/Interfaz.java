/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Miguelito
 */
public class Interfaz extends javax.swing.JFrame {
    //ATRIBUTOS
    LogicaRest restaurante;
    
    //CONSTRUCTOR
    public Interfaz(LogicaRest restaurante) {
        initComponents();
        this.restaurante=restaurante;
        this.centrada.setText("0");
        this.cfuerte.setText("0");
        this.cpostre.setText("0");
    }

    //GETTERS Y SETTERS ATRIBUTOS
    public LogicaRest getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(LogicaRest restaurante) {
        this.restaurante = restaurante;
    }
    //FIN GETTERS Y SETTERS ATRIBUTOS
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        entrada = new javax.swing.JLabel();
        postres = new javax.swing.JLabel();
        centrada = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        mesoneros = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        estadoG = new javax.swing.JLabel();
        estadoJ1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pfuertes1 = new javax.swing.JLabel();
        cpostre = new javax.swing.JLabel();
        cfuerte = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ordenes = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jorden = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("COCINEROS");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("ENTRADA");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("PLATOS FUERTES");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("POSTRES");

        entrada.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        entrada.setText("numero");

        postres.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        postres.setText("numero");

        centrada.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        centrada.setText("numero");

        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("DESPEDIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton2.setText("CONTRATAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton3.setText("CONTRATAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton4.setText("CONTRATAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton5.setText("DESPEDIR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton6.setText("DESPEDIR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("MESONEROS");

        mesoneros.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mesoneros.setText("numero");

        jButton7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton7.setText("CONTRATAR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton8.setText("DESPEDIR");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("GERENTE");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("JEFE DE MESONEROS");

        estadoG.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        estadoG.setText("jLabel8");

        estadoJ1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        estadoJ1.setText("jLabel8");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("PLATOS FUERTES");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("ORDENES ATENDIDAS");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("POSTRES");

        pfuertes1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pfuertes1.setText("numero");

        cpostre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cpostre.setText("numero");

        cfuerte.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cfuerte.setText("numero");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("ENTRADAS");

        ordenes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ordenes.setText("numero");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setText("HORAS QUE FALTAN PARA TERMINAR");

        jorden.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jorden.setText("jLabel13");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mesoneros, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(centrada, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(cfuerte, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(cpostre, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(239, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(126, 126, 126)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(pfuertes1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(postres, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(66, 66, 66)
                                        .addComponent(ordenes, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estadoG, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(estadoJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(158, 158, 158)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jorden, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(101, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postres, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfuertes1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton3)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesoneros, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7)
                    .addComponent(centrada, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpostre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cfuerte, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ordenes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estadoJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jorden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(12, 12, 12)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(estadoG, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //DESPEDIR COCINERO ENTRANTE
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        for(int i=0; i<this.restaurante.getCocineroE().length; i++){
            boolean despedir = false;
            if(this.restaurante.getCocineroE()[i]!=null && despedir==false){
                this.restaurante.getCocineroE()[i].setTrabajar(false);
                this.restaurante.getCocineroE()[i]=null;
                System.out.println(this.restaurante.getCocineroE()[i]);
                despedir=true;
                break; 
            }  
        }
        if(this.restaurante.getInicialCEnt() > 0){
        this.restaurante.setInicialCEnt(this.restaurante.getInicialCEnt()-1);
        this.restaurante.getInterfaz().getEntrada().setText(Integer.toString(this.restaurante.getInicialCEnt()));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    //CONTRATAR COCINEROS ENTRADAS
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        boolean contratar = false;
         
        if(this.restaurante.getInicialCEnt() < this.restaurante.getMaxCEnt()){
            this.restaurante.setInicialCEnt(this.restaurante.getInicialCEnt()+1);
            this.restaurante.getInterfaz().getEntrada().setText(Integer.toString(this.restaurante.getInicialCEnt()));
        }
        
        for(int i=0; i<this.restaurante.getInicialCEnt(); i++){
            if(this.restaurante.getCocineroE()[i] == null && !contratar){
                this.restaurante.getCocineroE()[i] = new Productor(this.restaurante.getSEE(), this.restaurante.getSPE(), this.restaurante.getSCE(), this.restaurante.getMesonE(), this.restaurante,1,25);
                this.restaurante.getCocineroE()[i].start();
                contratar=true;
                System.out.println(this.restaurante.getCocineroE()[i]);
                break;
            }
        } 
    }//GEN-LAST:event_jButton2ActionPerformed

    //CONTRATAR COCINERO PLATOS FUERTES
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        boolean contratar = false;
        
        if(this.restaurante.getInicialCPF() < this.restaurante.getMaxCPF()){
            this.restaurante.setInicialCPF(this.restaurante.getInicialCPF()+1);
            this.restaurante.getInterfaz().getPfuertes1().setText(Integer.toString(this.restaurante.getInicialCPF()));
        }
        
        for(int i=0; i<this.restaurante.getInicialCPF(); i++){
            if(this.restaurante.getCocineroPF()[i] == null && !contratar){
                this.restaurante.getCocineroPF()[i] = new Productor(this.restaurante.getSEPF(), this.restaurante.getSPPF(), this.restaurante.getSCPF(), this.restaurante.getMesonPF(), this.restaurante,2,33);
                this.restaurante.getCocineroPF()[i].start();
                contratar=true;
                System.out.println(this.restaurante.getCocineroPF()[i]);
                break;
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    //CONTRATAR COCINEROS DE POSTRES
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         boolean contratar = false;
        
        if(this.restaurante.getInicialCPost() < this.restaurante.getMaxCPost()){
            this.restaurante.setInicialCPost(this.restaurante.getInicialCPost()+1);
            this.restaurante.getInterfaz().getPostres().setText(Integer.toString(this.restaurante.getInicialCPost()));
        }
       
        for(int i=0; i<this.restaurante.getInicialCPost(); i++){
            if(this.restaurante.getCocineroP()[i] == null && !contratar){
                this.restaurante.getCocineroP()[i] = new Productor(this.restaurante.getSEP(), this.restaurante.getSPP(), this.restaurante.getSCP(), this.restaurante.getMesonP(), this.restaurante,3,30);
                this.restaurante.getCocineroP()[i].start();
                contratar=true;
                System.out.println(this.restaurante.getCocineroP()[i]);
                break;
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    //DESPEDIR COCINERO PLATOS FUERTES
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
          for(int i=0; i<this.restaurante.getCocineroPF().length; i++){
            boolean despedir = false;
            if(this.restaurante.getCocineroPF()[i]!=null && despedir==false){
                this.restaurante.getCocineroPF()[i].setTrabajar(false);
                this.restaurante.getCocineroPF()[i]=null;
                System.out.println(this.restaurante.getCocineroPF()[i]);
                despedir=true;
                break; 
            }  
        }
        if(this.restaurante.getInicialCPF() > 0){
        this.restaurante.setInicialCPF(this.restaurante.getInicialCPF()-1);
        this.restaurante.getInterfaz().getPfuertes1().setText(Integer.toString(this.restaurante.getInicialCPF()));
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    //DESPEDIR COCINEROS DE POSTRES
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         for(int i=0; i<this.restaurante.getCocineroP().length; i++){
            boolean despedir = false;
            if(this.restaurante.getCocineroP()[i]!=null && despedir==false){
                this.restaurante.getCocineroP()[i].setTrabajar(false);
                this.restaurante.getCocineroP()[i]=null;
                System.out.println(this.restaurante.getCocineroP()[i]);
                despedir=true;
                break; 
            }  
        }
        if(this.restaurante.getInicialCPost() > 0){
        this.restaurante.setInicialCPost(this.restaurante.getInicialCPost()-1);
        this.restaurante.getInterfaz().getPostres().setText(Integer.toString(this.restaurante.getInicialCPost()));
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    //CONTRATAR MESONEROS
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         boolean contratar = false;
        
        if(this.restaurante.getInicialMes() < this.restaurante.getMaxMes()){
            this.restaurante.setInicialMes(this.restaurante.getInicialMes()+1);
            this.restaurante.getInterfaz().getMesoneros().setText(Integer.toString(this.restaurante.getInicialMes()));
        } 
         
        for(int i=0; i<this.restaurante.getInicialMes(); i++){
            if(this.restaurante.getMesonero()[i] == null && !contratar){
                this.restaurante.getMesonero()[i] = new Consumidor(this.restaurante.getSPE(),this.restaurante.getSCE(),this.restaurante.getSEE(),this.restaurante.getSPPF(),this.restaurante.getSCPF(),this.restaurante.getSEPF(),this.restaurante.getSPP(),this.restaurante.getSCP(),this.restaurante.getSEP(),this.restaurante.getConsumirE(),this.restaurante.getConsumirPF(),this.restaurante.getConsumirP(),this.restaurante,this.restaurante.getInterfaz());
                this.restaurante.getMesonero()[i].start();
                contratar=true;
                System.out.println(this.restaurante.getMesonero()[i]);
                break;
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    //DESPEDIR MESONEROS
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        for(int i=0; i<this.restaurante.getMesonero().length; i++){
            boolean despedir = false;
            if(this.restaurante.getMesonero()[i]!=null && despedir==false){
                this.restaurante.getMesonero()[i].setTrabajar(false);
                this.restaurante.getMesonero()[i]=null;
                System.out.println(this.restaurante.getMesonero()[i]);
                despedir=true;
                break; 
            }  
        }
        if(this.restaurante.getInicialMes() > 0){
        this.restaurante.setInicialMes(this.restaurante.getInicialMes()-1);
        this.restaurante.getInterfaz().getMesoneros().setText(Integer.toString(this.restaurante.getInicialMes()));
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    //GETTERS Y SETTERS DE LA INTERFAZ
    public JLabel getCentrada() {
        return centrada;
    }

    public void setCentrada(JLabel centrada) {
        this.centrada = centrada;
    }

    public JLabel getCfuerte() {
        return cfuerte;
    }

    public void setCfuerte(JLabel cfuerte) {
        this.cfuerte = cfuerte;
    }

    public JLabel getCpostre() {
        return cpostre;
    }

    public void setCpostre(JLabel cpostre) {
        this.cpostre = cpostre;
    }

    public JLabel getEntrada() {
        return entrada;
    }

    public void setEntrada(JLabel entrada) {
        this.entrada = entrada;
    }

    public JLabel getMesoneros() {
        return mesoneros;
    }

    public void setMesoneros(JLabel mesoneros) {
        this.mesoneros = mesoneros;
    }

    public JLabel getPfuertes1() {
        return pfuertes1;
    }

    public void setPfuertes1(JLabel pfuertes1) {
        this.pfuertes1 = pfuertes1;
    }

    public JLabel getPostres() {
        return postres;
    }

    public void setPostres(JLabel postres) {
        this.postres = postres;
    }

    public JLabel getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(JLabel ordenes) {
        this.ordenes = ordenes;
    }

    public JLabel getEstadoJ1() {
        return estadoJ1;
    }

    public void setEstadoJ1(JLabel estadoJ1) {
        this.estadoJ1 = estadoJ1;
    }

    public JLabel getJorden() {
        return jorden;
    }

    public void setJorden(JLabel jorden) {
        this.jorden = jorden;
    }

    public JLabel getEstadoG() {
        return estadoG;
    }

    public void setEstadoG(JLabel estadoG) {
        this.estadoG = estadoG;
    }
    //FIN DE GETTERS Y SETTERS DE LA INTERFAZ

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel centrada;
    private javax.swing.JLabel cfuerte;
    private javax.swing.JLabel cpostre;
    private javax.swing.JLabel entrada;
    private javax.swing.JLabel estadoG;
    private javax.swing.JLabel estadoJ1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jorden;
    private javax.swing.JLabel mesoneros;
    private javax.swing.JLabel ordenes;
    private javax.swing.JLabel pfuertes1;
    private javax.swing.JLabel postres;
    // End of variables declaration//GEN-END:variables
}
