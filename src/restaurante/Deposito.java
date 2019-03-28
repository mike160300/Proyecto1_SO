/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * @author Miguelito
 */
public class Deposito {
    //ATRIBUTOS
    private int[] deposito;
    private int tamaño;

    //CONSTRUCTOR
    public Deposito(int tamaño) {
        this.tamaño = tamaño;
        this.deposito = new int[tamaño];
    }
    
    //GETTERS Y SETTERS
    public int getTamaño() {
        return tamaño;
    }
    
    public int getArray(int x, int valor){
        return this.deposito[x]=valor;
    }
    
    public void setArray(int x, int valor){
        this.deposito[x]=valor;
    }
    //FIN GETTERS Y SETTERS
    
    //METODO QUE IMPRIME EL DEPOSITO ESPECIFICADO
    public void imprimir(){
        for (int i = 0; i < this.tamaño ; i++) {
            System.out.print(this.deposito[i] + " ");
        }
        System.out.println("");
    }
}
