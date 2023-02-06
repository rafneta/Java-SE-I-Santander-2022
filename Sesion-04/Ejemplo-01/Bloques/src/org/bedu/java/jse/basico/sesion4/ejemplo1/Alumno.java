package org.bedu.java.jse.basico.sesion4.ejemplo1;

public class Alumno {
    private String curso;
    private byte sesion;
    private String objetivo;


    {
        curso = "Java Standard edition";
        sesion = 4;
        objetivo = "Dominar Java";
    }

    {
        curso = "Java Standard Edition 2020";
    }

    // Los bloques de inicialización se ejecutan de acueedo al orden descendente
    // es decir es importante la forma en que los declaramos


    public String getCurso() {
        return curso;
    }

    public byte getSesion() {
        return sesion;
    }

    public String getObjetivo() {
        return objetivo;
    }
}
