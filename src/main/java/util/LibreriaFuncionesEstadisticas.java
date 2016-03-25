/**
 * Esta clase es una libreria de funciones estadisticas
 *
 * Fecha de creacion: Febrero 28 de 2016
 * Fecha de modificaci�n: Marzo 24 de 2016
 * @Version 1.2
 * @Author Claudia Marcela Alvarez Ramos
 */

package util;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.LinkedList;


public class LibreriaFuncionesEstadisticas {
    /**
     * #Method
     * Este m�todo se encarga de sumar todos los datos de la coleccion recibida por paramentros
     * 
     * @param lista
     * @author Claudia Marcela Alvarez Ramos
     * @return el total de la sumatoria
     */
        public static Double sumar(LinkedList<Double> lista){
		Double result= new Double(0);
		for (Double dato : lista) {
			result+=dato;
		}
		return result;
	}
        /**
         * #Method
         * 
         * Este m�todo se encarga de calcular el promedio de la lista de datos recibida por parametros
         * 
         * @param lista
         * @author Claudia Marcela Alvarez Ramos
         * @return el promedio de la lista recibida por parametros
         */
	public static Double calcularMedia(LinkedList<Double> lista){
                Double tama�o = new Double(lista.size());
		if(tama�o > 0){
			return LibreriaFuncionesEstadisticas.redondear(sumar(lista)/tama�o, 4);
		}
		return tama�o;
	}
        
        /**
         * #Method
         * 
         * Este m�todo se encarga de realizar la sumatoria de cada uno de los valores de la lista al cuadrado,
         * 
         * @param lista de datos
         * @author Claudia Marcela Alvarez Ramos
         * @return el total de la sumatoria  
         */
        public static Double calcularCuadrado(LinkedList<Double> lista){
                Double result= new Double(0);
                for (Double dato : lista) {
			result+=Math.pow(dato, 2);
		}
                return result;
        }
        
        /**
         * #Method
         * 
         * Este m�todo se encarga de realizar la sumatoria de el resultado de multiplicar los componentes de dos listas en la misma posicion.
         * 
         * @param lista1
         * @param lista2
         * @author Claudia Marcela Alvarez Ramos
         * @return  el total de la sumatoria
         */
        public static Double calcularMultiplicacionListasDeDatos(LinkedList<Double> lista1, LinkedList<Double> lista2){
                Double result= new Double(0);
                for (int i=0; i< lista1.size(); i++) {
			result+=(lista1.get(i)*lista2.get(i));
		}
                return result;
        }
       
        /**
         * #Method
         * 
         * Este m�todo se encarga de calcular el termino B1
         * 
         * @param producto
         * @param tama�o
         * @param promedioX
         * @param promedioY
         * @param cuadrado
         * @author Claudia Marcela Alvarez Ramos
         * @return B1
         */
        public static Double calcularB1(Double producto, int tama�o, Double promedioX, Double promedioY, Double cuadrado){
            
            return((producto-(tama�o*promedioX*promedioY))/(cuadrado-(tama�o*Math.pow(promedioX, 2))));
        }
        
        /**
         * #Method
         * 
         * Este m�todo se encarga de calcular el termino BO
         * 
         * @param promedioY
         * @param promedioX
         * @param b1
         * @author Claudia Marcela Alvarez Ramos
         * @return B0
         */
         public static Double calcularB0(Double promedioY, Double promedioX, Double b1){
            return(promedioY-(b1*promedioX));
        }
         
         /**
          *  #Method
          * 
          * Este m�todo se encarga de calcular el termino Yk
          * @param b0
          * @param b1
          * @param promedioX
          * @author Claudia Marcela Alvarez Ramos
          * @return yK
          */
        
        public static Double calcularYk(Double b0, Double b1, Double promedioX){
            return(b0+(b1*promedioX));
        }
        
        /**
         * #Method
         * 
         * Este m�todo se encarga de calcular el termino Rxy
         * 
         * @param sumatoriaColeccionX
         * @param sumatoriaColeccionY
         * @param producto
         * @param cuadradoX
         * @param cuadradoY
         * @param tama�o
         * @author Claudia Marcela Alvarez Ramos
         * @return Rxy
         */
         public static Double calcularRxy(Double sumatoriaColeccionX, Double sumatoriaColeccionY, Double producto, Double cuadradoX, Double cuadradoY, int tama�o){
            
            return((tama�o*producto)-(sumatoriaColeccionX*sumatoriaColeccionY))/(Math.sqrt(((tama�o*cuadradoX)-Math.pow(sumatoriaColeccionX, 2))*((tama�o*cuadradoY)-Math.pow(sumatoriaColeccionY, 2))));
        }
         
         /**
          * #Method
          * 
          * Este m�todo se encarga de calcular el cuadrado del termino Rxy 
          * 
          * @param sumatoriaColeccionX
          * @param sumatoriaColeccionY
          * @param producto
          * @param cuadradoX
          * @param cuadradoY
          * @param tama�o
          * @author Claudia Marcela Alvarez Ramos
          * @return 
          */
         public static Double calcularRxy2(Double sumatoriaColeccionX, Double sumatoriaColeccionY, Double producto, Double cuadradoX, Double cuadradoY, int tama�o){
            return Math.pow(LibreriaFuncionesEstadisticas.calcularRxy(sumatoriaColeccionX, sumatoriaColeccionY, producto, cuadradoX,  cuadradoY,  tama�o), 2);
        }
         
        /**
         * #Method
         * 
         * Este m�todo se encarga de calcular la desviacion estandar de los datos de la lista
         * @param lista
         * @author Claudia Marcela Alvarez Ramos
         * @return 
         */
	public static Double calculaDesviacionEstandar(LinkedList<Double> lista){
		Double result= new Double(0);
		Double tama�o = new Double(lista.size());
		Double media = LibreriaFuncionesEstadisticas.calcularMedia(lista);
		for (Double dato : lista) {
			result+=Math.pow((dato - media),2);
		}
		if(tama�o > 0){
			
			return LibreriaFuncionesEstadisticas.redondear(Math.sqrt(result/(tama�o-1)),4);
		}
		return tama�o;
	}
	/**
         * Este m�todo se encarga de calcular la desviacion estandar
         * @param lista
         * @param media
         * @author Claudia Marcela Alvarez Ramos
         * @return 	/**
         * Este m�todo se encarga de calcular la desviacion estandar
         * @param lista
         * @param media
         * @author Claudia Marcela Alvarez Ramos
         * @return 
         */
        
         
	public static Double calculaDesviacionEstandar(LinkedList<Double> lista, Double media){
		Double result= new Double(0);
		Double tama�o = new Double(lista.size());
		for (Double dato : lista) {
			result+=Math.pow((dato - media),2);
		}
		if(tama�o > 0){
			
			return LibreriaFuncionesEstadisticas.redondear(Math.sqrt(result/(tama�o-1)),4);
		}
		return tama�o;
	}
	/**
         * #Method
         * 
         * Este m�todo se encarga de redondear el numero flotante con una cantidad de decimales especifivos 
         * 
         * @param numero
         * @param decimals
         * @author Claudia Marcela Alvarez Ramos
         * @return el numero redondeado
         */
	public static Double redondear(Double numero, int decimals){
		BigDecimal b0p = new BigDecimal(numero);
                return (b0p.setScale(decimals, RoundingMode.HALF_UP)).doubleValue();
	}
         /**
         * #Method
         * 
         * Este m�todo se encarga de calcular el logaritmo natural por elemento de la lista y retorna
         * una nueva lista con todos los elementos con su ln.
         * 
         * @param lista
         * @author Claudia Marcela Alvarez Ramos
         * @return el promedio de la lista recibida por parametros
         */
	public static LinkedList<Double> calcularLnPorElemento(LinkedList<Double> lista){
                LinkedList<Double> lValores = new LinkedList<Double>();
                for (Double valor : lista) {
                    lValores.add(LibreriaFuncionesEstadisticas.redondear(Math.log(valor),4));
                }
		return lValores;
	}
        /**
         * #Method
         * 
         * Este m�todo se encarga de dar formato a un n�mero especifico
         * @param numero
         * @param format
         * @author Claudia Marcela Alvarez Ramos
         * @return el n�mero redondeado
         */
        public static Double darFormato(Double numero, String format){
		DecimalFormat df = new DecimalFormat(format);
		return(new Double((df.format(numero)).replace(',', '.')));
	}

        /**
         * #Method
         * 
         * Este m�todo se encarga de validar si el string es un numero o no
         * 
         * @param str
         * @author Claudia Marcela Alvarez Ramos
         * @return true si es un numero, de lo contrario false
         */
      
	public static boolean esNumero(String str)  
	{  
	  try  
	  {  
	     Double.parseDouble(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}
        
        
}
