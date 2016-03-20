/**
 * Esta clase representa el modelo de una regresion lineal
 *
 * Fecha de creacion: Marzo 10 de 2016
 *
 * @Version 1.1
 * @Author Claudia Marcela Alvarez Ramos
 */
package edu.uniandes.ecos.ASE.app.model;

import java.util.LinkedList;
import util.LibreriaFuncionesEstadisticas;

public class RegresionLineal extends EstructuraRegresionLineal{
    
    private LinkedList<Double> listaX;
    private LinkedList<Double> listaY;
    private Double producto;
    private Double promedioX;
    private Double promedioY;
    private Double cuadradoX;
    private Double cuadradoY;
    private Double sumatoriaColeccionX;
    private Double sumatoriaColeccionY;
  
    /**
    * #Method
    * 
    * Este método se encarga de llamar a los sub métodos que se encargan de calcular la regresion lineal y su formato
    * @param lx
    * @param ly
    * @param i1
    * @param i2
    * @param i3
    * @param i4
    * @param i5
    * @return 
    */
    public static EstructuraRegresionLineal obtenerDatosRegresionLineal(LinkedList lx, LinkedList ly, int i1, int i2, int i3, int i4, int i5){
           EstructuraRegresionLineal cP = new EstructuraRegresionLineal();
           RegresionLineal rl = new RegresionLineal ();
           rl.setListaX(lx);
           rl.setListaY(ly);
           rl.calcularValoresRegresionLineal();
           cP.setB0(LibreriaFuncionesEstadisticas.redondear(rl.getB0(),i1));
           cP.setB1(LibreriaFuncionesEstadisticas.redondear(rl.getB1(),i2));
           cP.setRxy(LibreriaFuncionesEstadisticas.redondear(rl.getRxy(),i3));
           cP.setR2(LibreriaFuncionesEstadisticas.redondear(rl.getR2(),i4));
           cP.setYk(LibreriaFuncionesEstadisticas.redondear(rl.getYk(),i5));
           return cP;
    }
    /**
     * #Method
     * 
     * Este método se encarga de calcular los valores de regresion lineal y actualizarlos.
     * 
     * @author Claudia Marcela Alvarez Ramos
     */
    public void calcularValoresRegresionLineal(){
        this.producto = LibreriaFuncionesEstadisticas.calcularMultiplicacionListasDeDatos(listaX, listaY);
        this.promedioX = LibreriaFuncionesEstadisticas.calcularMedia(listaX);
        this.promedioY = LibreriaFuncionesEstadisticas.calcularMedia(listaY);
        this.cuadradoX = LibreriaFuncionesEstadisticas.calcularCuadrado(listaX);
        this.cuadradoY = LibreriaFuncionesEstadisticas.calcularCuadrado(listaY);
        this.sumatoriaColeccionX = LibreriaFuncionesEstadisticas.sumar(listaX);
        this.sumatoriaColeccionY = LibreriaFuncionesEstadisticas.sumar(listaY);
        int tamaño =listaX.size();
        this.setB1(LibreriaFuncionesEstadisticas.calcularB1(producto, tamaño, promedioX, promedioY, cuadradoX));
        this.setRxy(LibreriaFuncionesEstadisticas.calcularRxy(sumatoriaColeccionX, sumatoriaColeccionY, producto, cuadradoX, cuadradoY, tamaño));
        this.setR2(LibreriaFuncionesEstadisticas.calcularRxy2(sumatoriaColeccionX, sumatoriaColeccionY, producto, cuadradoX, cuadradoY, tamaño));
        this.setB0(LibreriaFuncionesEstadisticas.calcularB0(LibreriaFuncionesEstadisticas.calcularMedia(listaY), getB1(), LibreriaFuncionesEstadisticas.calcularMedia(listaX)));
        
        this.setYk(LibreriaFuncionesEstadisticas.calcularYk(getB0(), getB1(), new Double(386)));
    }
    /**
     * #Method
     * 
     * Este método se encarga de retornar los valores de la regresion lineal
     * @return 
     */
    @Override
    public String toString() {
        return (" "+getB0()+" "+getB1()+" "+getRxy()+" "+getR2()+" "+getYk());
    }
    
    
    /**
     * #Method
     * 
     * Este método se encarga de obtener la lista de datos X
     * 
     * @author Claudia Marcela Alvarez Ramos
     * @return the listaX
     */
    public LinkedList<Double> getListaX() {
        return listaX;
    }

    /**
     * #Method
     * 
     * Este método se encarga de modificar la lista de datos X por una lista de datos nueva
     * 
     * @author Claudia Marcela Alvarez Ramos
     * @param listaX the listaX to set
     */
    public void setListaX(LinkedList<Double> listaX) {
        this.listaX = listaX;
    }

    /**
     * #Method
     * 
     * Este método se encarga de obtener la lista de datos Y
     * 
     * @author Claudia Marcela Alvarez Ramos
     * @return the listaY
     */
    public LinkedList<Double> getListaY() {
        return listaY;
    }

    /**
     * #Method
     * 
     * Este método se encarga de modificar la lista de datos Y por una lista de datos nueva
     * 
     * @author Claudia Marcela Alvarez Ramos
     * 
     * @param listaY the listaY to set
     */
    public void setListaY(LinkedList<Double> listaY) {
        this.listaY = listaY;
    }

     
    
    
}

