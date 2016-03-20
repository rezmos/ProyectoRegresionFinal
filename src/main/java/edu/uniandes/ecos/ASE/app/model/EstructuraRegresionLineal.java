/**
 * Esta clase representa la estructura de campos de la regresion lineal
 *
 * Fecha de creacion: Marzo 10 de 2016
 *
 * @Version 1.1
 * @Author Claudia Marcela Alvarez Ramos
 */
package edu.uniandes.ecos.ASE.app.model;

public class EstructuraRegresionLineal {
    
    private Double B0;
    private Double B1;
    private Double rxy;
    private Double r2;
    private Double yk;

    public EstructuraRegresionLineal(){
        
    }
    
    public EstructuraRegresionLineal(Double B0, Double B1, Double rxy, Double r2, Double yk){
        this.B0 = B0;
        this.B1 = B1;
        this.rxy = rxy;
        this.r2 = r2;
        this.yk = yk;
    }
    
     /**
     * #Method
     * 
     * Este método se encarga de obtener el termino B0
     * 
     * @author Claudia Marcela Alvarez Ramos
     * @return B0
     */
    public Double getB0() {
        return B0;
    }

    /**
     * #Method
     * 
     * Este método se encarga de modificar la valor del termino b0
     * 
     * @author Claudia Marcela Alvarez Ramos
     * @param b0
     */
    public void setB0(Double b0) {
        this.B0 = b0;
    }

    /**
     * #Method
     * 
     * Este método se encarga de obtener el termino B1
     * 
     * @author Claudia Marcela Alvarez Ramos
     * @return B1
     */
    public Double getB1() {
        return B1;
    }
    
    /**
     * #Method
     * 
     * Este método se encarga de modificar la valor del termino B1
     * 
     * @author Claudia Marcela Alvarez Ramos
     * @param B1
     */
    public void setB1(Double b1) {
        this.B1 = b1;
    }

    /**
     * #Method
     * 
     * Este método se encarga de obtener el termino Rxy
     * 
     * @author Claudia Marcela Alvarez Ramos
     * @return Rxy
     */
    public Double getRxy() {
        return rxy;
    }

    /**
     * #Method
     * 
     * Este método se encarga de modificar la valor del termino Rxy
     * 
     * @author Claudia Marcela Alvarez Ramos
     * @param Rxy
     */
    public void setRxy(Double rxy) {
        this.rxy = rxy;
    }

    /**
     * #Method
     * 
     * Este método se encarga de obtener el termino R2
     * 
     * @author Claudia Marcela Alvarez Ramos
     * @return R2
     */
    public Double getR2() {
        return r2;
    }

    /**
     * #Method
     * 
     * Este método se encarga de modificar la valor del termino R2
     * 
     * @author Claudia Marcela Alvarez Ramos
     * @param R2
     */
    public void setR2(Double r2) {
        this.r2 = r2;
    }

    /**
     * #Method
     * 
     * Este método se encarga de obtener el termino Yk
     * 
     * @author Claudia Marcela Alvarez Ramos
     * @return Yk
     */
    public Double getYk() {
        return yk;
    }

    /**
     * #Method
     * 
     * Este método se encarga de modificar la valor del termino Yk
     * 
     * @author Claudia Marcela Alvarez Ramos
     * @param Yk
     */
    public void setYk(Double yk) {
        this.yk = yk;
    }
  
    
    
}
