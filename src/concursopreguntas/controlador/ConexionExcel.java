/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concursopreguntas.controlador;

import static concursopreguntas.controlador.VariablesGlobales.FILAS_IGNORADAS;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 *
 * @author Baloo
 */
public class ConexionExcel {
    
    private static Workbook leerArchivo( String nombreArchivo ){
    
        Workbook archivoExcel = null;
        
        try {
            archivoExcel = Workbook.getWorkbook(
                    new File( "H:\\Proyecto-Be-1\\proventas-connector\\ConcursoPreguntas\\preguntas.xls" )
            );
                      
        } catch (IOException | BiffException ex) {
            Logger.getLogger(ConexionExcel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return archivoExcel;
    }
    
    private static Pregunta obtenerPregunta( Workbook archivoExcel, int area, int nivel, int numeroPregunta ){
 
        Pregunta datosPregunta = null;
        String pregunta;
        String respuesta;
        String esUtilizada;
        numeroPregunta += FILAS_IGNORADAS;

        Sheet hoja = archivoExcel.getSheet( area );
        if ( hoja != null ){
            pregunta = hoja.getCell( nivel , numeroPregunta ).getContents();
            respuesta = hoja.getCell(nivel + 1, numeroPregunta ).getContents();
            esUtilizada = hoja.getCell(nivel + 2, numeroPregunta ).getContents();
            if ( pregunta != null ){
                datosPregunta = new Pregunta();
                datosPregunta.setPregunta(pregunta);
                if ( respuesta.equalsIgnoreCase("n") ){
                    datosPregunta.setRespuesta(false);
                }
                else
                    if ( respuesta.equalsIgnoreCase("s") ){
                        datosPregunta.setRespuesta(true);
                    }
                if ( esUtilizada.equalsIgnoreCase("n") ){
                    datosPregunta.setFueRespondida(false);
                }
                else
                    if ( esUtilizada.equalsIgnoreCase("s") ){
                        datosPregunta.setFueRespondida(true);
                    }
                
            }
        }
        
        return datosPregunta;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        leerArchivo( "preguntas.xls" );
        
    }
    
}
