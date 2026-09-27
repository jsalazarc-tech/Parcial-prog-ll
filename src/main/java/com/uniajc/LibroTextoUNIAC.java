package com.uniajc;

public class LibroTextoUNIAC extends LibroTexto {

    private String facultad;

    // Constructor por defecto
    public LibroTextoUNIAC() {
        super();
        this.facultad = "";
    }

    // Constructor con parámetros
    public LibroTextoUNIAC(String titulo, String autor,
                           int numeroEjemplares,
                           int numeroEjemplaresPrestados,
                           String curso,
                           String facultad) {

        super(titulo, autor, numeroEjemplares,
              numeroEjemplaresPrestados, curso);

        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {

        return "LibroTextoUNIAC{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", numeroEjemplares=" + getNumeroEjemplares() +
                ", numeroEjemplaresPrestados=" +
                getNumeroEjemplaresPrestados() +
                ", curso='" + getCurso() + '\'' +
                ", facultad='" + facultad + '\'' +
                '}';
    }
}