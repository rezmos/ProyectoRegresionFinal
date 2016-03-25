import com.greatideas.app.model.RangoTamanio;
import java.util.LinkedList;
import static spark.Spark.*;
import static spark.Spark.get;
import util.Archivo;

public class Main {
    
 
    /**
     * #Method
     * 
     * Este metodo es el metodo principal de la aplicacion
     * 
     * @param args 
     * @author Claudia Marcela Alvarez Ramos
     * @return B0
    
     */
    
   public static void main(String[] args) {

        port(Integer.valueOf(System.getenv("PORT")));
        staticFileLocation("/public");

        get("/rango-tamanio", (req, res) -> {
 
    String retorno;
            RangoTamanio caso = null;
            LinkedList listaDeDatos = Archivo.leerArchivo();
            if(listaDeDatos!=null && listaDeDatos.size()>0){ 
               caso = new RangoTamanio((LinkedList<Double>)listaDeDatos.get(0));
             }
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
                    + "<th>VS</th>"
                    + "<th>S</th>"
                    + "<th>M</th>"
                    + "<th>L</th>"
                    + "<th>VL</th>"
                    + "</tr>";
                retorno += "<tr>"
                        + "<td>" + caso.getVS()+ "</td>"
                        + "<td>" + caso.getS()+ "</td>"
                        + "<td>" + caso.getM() + "</td>"
                        + "<td>" + caso.getL() + "</td>"
                        + "<td>" + caso.getVL() + "</td>"
                        + "</tr>";
            retorno += "</tbody>"
                    + "</table>"
                    + "</body>"
                    + "</html>";
            return retorno;
        });
    }
}