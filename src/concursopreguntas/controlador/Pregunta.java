/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package concursopreguntas.controlador;

/**
 *
 * Autor: Victor Matías <vitomany@reproducir.net>
 * Fecha: 26/04/2016 
 * Hora: 04:09:36 PM
 * Web: https://reproducir.net
 */

public class Pregunta {
    
    private String pregunta;
    private boolean respuesta;
    private boolean fueRespondida;

    public Pregunta() {
    }

    public Pregunta(String pregunta, boolean respuesta, boolean fueRespondida) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.fueRespondida = fueRespondida;
    }

    /**
     * @return the pregunta
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * @param pregunta the pregunta to set
     */
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    /**
     * @return the respuesta
     */
    public boolean isRespuesta() {
        return respuesta;
    }

    /**
     * @param respuesta the respuesta to set
     */
    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }

    /**
     * @return the fueRespondida
     */
    public boolean isFueRespondida() {
        return fueRespondida;
    }

    /**
     * @param fueRespondida the fueRespondida to set
     */
    public void setFueRespondida(boolean fueRespondida) {
        this.fueRespondida = fueRespondida;
    }
    
    

}
