/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.io.FileNotFoundException;

/**
 *
 * @author Miguelito
 */
public class Aplicacion {

    public void Start()throws FileNotFoundException{
        //INICIO DE NUESTRA LOGICA
        LogicaRest restaurante=new LogicaRest();
        Interfaz interfaz=new Interfaz(restaurante);
        restaurante.setInterfaz(interfaz);
        Vectores vec=new Vectores(restaurante);
        restaurante.LeerDatosIniciales();
        restaurante.CantidadMaxima();
        restaurante.CrearMesones();
        restaurante.CrearSemaforos();
        restaurante.CrearCocinerosIniciales();
        restaurante.CrearMesoneros();
        restaurante.RestCocineros(restaurante);
        restaurante.RestMesoneros(restaurante);
        restaurante.Start();
        restaurante.getInterfaz().setVisible(true);
        vec.start();
        //FIN DE NUESTRA LOGICA
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        /*
            PROYECTO RESTAURANTE:
            MIGUEL JAIMES V-27391760 CARNET:20171110127
            ALBERTO PEREIRA V-26648463 CARNET:20171110630
        */
        Aplicacion app=new Aplicacion();
        app.Start();
    }
    
}
