/**
 * Esta clase representa la estructura del rango de tamaños
 *
 * Fecha de creacion: Marzo 10 de 2016
 *
 * @Version 1.1
 * @Author Claudia Marcela Alvarez Ramos
 */package com.greatideas.app.model;

import java.util.LinkedList;
import util.LibreriaFuncionesEstadisticas;

public class RangoTamanio {
    
    private double VS;
    private double S;
    private double M;
    private double L;
    private double VL;
    private LinkedList<Double> listaValores;
    private double avg;
    private double o;

    public RangoTamanio(LinkedList<Double> lista){
        this.listaValores = lista;
        this.avg = LibreriaFuncionesEstadisticas.calcularMedia(LibreriaFuncionesEstadisticas.calcularLnPorElemento(lista));
        this.o = LibreriaFuncionesEstadisticas.calculaDesviacionEstandar(LibreriaFuncionesEstadisticas.calcularLnPorElemento(lista));
        this.VS = LibreriaFuncionesEstadisticas.redondear(Math.exp(avg-(2*o)),4);
        this.S = LibreriaFuncionesEstadisticas.redondear(Math.exp(avg-o),4);
        this.M = LibreriaFuncionesEstadisticas.redondear(Math.exp(avg),4);
        this.L = LibreriaFuncionesEstadisticas.redondear(Math.exp(avg+o),4);
        this.VL = LibreriaFuncionesEstadisticas.redondear(Math.exp(avg+(2*o)),4);
    }
     /**
     * #Method
     * 
     * Este método se encarga de obtener el valor del termino VS
     * 
     * @author Claudia Marcela Alvarez Ramos
     * @return VS
     */
    public double getVS() {
        
        return this.VS;
    }

    /**
     * #Method
     * 
     * Este método se encarga de modificar la valor del termino VS
     * 
     * @author Claudia Marcela Alvarez Ramos
     * @param VS
     */
    public void setVS(double VS) {
        this.VS = VS;
    }

    /**
     * #Method
     * 
     * Este método se encarga de obtener el valor del termino S
     * 
     * @author Claudia Marcela Alvarez Ramos
     * @return S
     */
    public double getS() {
        return S;
    }

    /**
     * #Method
     * 
     * Este método se encarga de modificar la valor del termino S
     * 
     * @author Claudia Marcela Alvarez Ramos
     * @param S
     */
    public void setS(double S) {
        this.S = S;
    }

    /**
     * #Method
     * 
     * Este método se encarga de obtener el valor del termino M
     * 
     * @author Claudia Marcela Alvarez Ramos
     * @return M
     */
    public double getM() {
        return M;
    }

    /**
     * #Method
     * 
     * Este método se encarga de modificar la valor del termino M
     * 
     * @author Claudia Marcela Alvarez Ramos
     * @param M
     */
    public void setM(double M) {
        this.M = M;
    }

    /**
     * #Method
     * 
     * Este método se encarga de obtener el valor del termino L
     * 
     * @author Claudia Marcela Alvarez Ramos
     * @return L
     */
    public double getL() {
        return L;
    }

    /**
     * #Method
     * 
     * Este método se encarga de modificar la valor del termino L
     * 
     * @author Claudia Marcela Alvarez Ramos
     * @param L
     */
    public void setL(double L) {
        this.L = L;
    }

    /**
     * #Method
     * 
     * Este método se encarga de obtener el valor del termino VL
     * 
     * @author Claudia Marcela Alvarez Ramos
     * @return VL
     */
    public double getVL() {
        return VL;
    }

    /**
     * #Method
     * 
     * Este método se encarga de modificar la valor del termino VL
     * 
     * @author Claudia Marcela Alvarez Ramos
     * @param VL
     */
    public void setVL(double VL) {
        this.VL = VL;
    }

    @Override
    public String toString() {
        return "VS:"+this.VS+", S:"+this.S+", M:"+this.M+", L:"+this.L+", VL:"+this.VL;
    }
    
    
}
