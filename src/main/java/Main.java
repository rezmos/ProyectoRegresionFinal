/**
 * Esta clase es el punto de entrada a la aplicacion
 *
 * Fecha de creacion: Marzo 10 de 2016
 *
 * @Version 1.1
 * @Author Claudia Marcela Alvarez Ramos
 */
import java.util.ArrayList;
import static spark.Spark.*;
import edu.uniandes.ecos.ASE.app.model.EstructuraRegresionLineal;
import static edu.uniandes.ecos.ASE.app.model.RegresionLineal.obtenerDatosRegresionLineal;
import java.util.LinkedList;
import java.util.List;
import util.Archivo;
import static spark.Spark.get;

public class Main {
    /**
     * #Method
     * 
     * Este método es el método principal de la aplicacion
     * 
     * @param args 
     * @author Claudia Marcela Alvarez Ramos
     * @return B0
    
     */
   public static void main(String[] args) {

        port(Integer.valueOf(System.getenv("PORT")));
        staticFileLocation("/public");

        get("/regresion-lineal", (req, res) -> {
            String retorno;
            List<EstructuraRegresionLineal> casosPrueba = new ArrayList<EstructuraRegresionLineal>();
            LinkedList listaDeDatos = Archivo.leerArchivo();
            if(listaDeDatos!=null && (listaDeDatos.size()==4)){ 
               casosPrueba.add(obtenerDatosRegresionLineal((LinkedList)listaDeDatos.get(0), (LinkedList)listaDeDatos.get(2), 2,4,4,4,3));
               casosPrueba.add(obtenerDatosRegresionLineal((LinkedList)listaDeDatos.get(0), (LinkedList)listaDeDatos.get(3), 3,4,4,4,3));
               casosPrueba.add(obtenerDatosRegresionLineal((LinkedList)listaDeDatos.get(1), (LinkedList)listaDeDatos.get(2), 2,5,4,4,4));
               casosPrueba.add(obtenerDatosRegresionLineal((LinkedList)listaDeDatos.get(1), (LinkedList)listaDeDatos.get(3), 3,6,4,4,4));
             }
            //dibujarTablaValores.DibujarReporte(casosPrueba);

            retorno = "<!DOCTYPE html>"
                    + "<html>"
                    + "<head>"
                    + "<style>"
                    + "table, th, td {"
                    + "border: 1px solid black;"
                    + "border-collapse: collapse;"
                    + "}"
                    + "th, td {"
                    + "padding: 5px;"
                    + "text-align: left;"
                    + "}"
                    + "table#t01 {"
                    + "width: 100%;    "
                    + "background-color: #A9BCF5;"
                    + "}"
                    + "</style>"
                    + "</head>"
                    + "<body>"
                    + "<table id=\"t01\">"
                    + "<tbody>"
                    + "<tr>"
                    + "<th>Nombre</th>"
                    + "<th>B0</th>"
                    + "<th>B1</th>"
                    + "<th>rxy</th>"
                    + "<th>r^2</th>"
                    + "<th>yk</th>"
                    + "<th>B0</th>"
                    + "<th>B1</th>"
                    + "<th>rxy</th>"
                    + "<th>r^2</th>"
                    + "<th>yk</th>"
                    + "</tr>";
            int i = 1;
            for (EstructuraRegresionLineal casoPrueba : casosPrueba) {
                retorno += "<tr>"
                        + "<td>" + "" + i + "</td>"
                        + "<td>" + casoPrueba.getB0()+ "</td>"
                        + "<td>" + casoPrueba.getB1()+ "</td>"
                        + "<td>" + casoPrueba.getRxy() + "</td>"
                        + "<td>" + casoPrueba.getR2() + "</td>"
                        + "<td>" + casoPrueba.getYk() + "</td>"
                        + "<td>" + casoPrueba.getB0()+ "</td>"
                        + "<td>" + casoPrueba.getB1()+ "</td>"
                        + "<td>" + casoPrueba.getRxy() + "</td>"
                        + "<td>" + casoPrueba.getR2() + "</td>"
                        + "<td>" + casoPrueba.getYk() + "</td>"
                        + "</tr>";
                i++;
            }
            retorno += "</tbody>"
                    + "</table>"
                    + "</body>"
                    + "</html>";
            return retorno;
        });
    }
   
}
