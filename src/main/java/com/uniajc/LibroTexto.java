package com.uniajc;

public class LibroTexto extends Libro {

    private String curso;

    // Constructor por defecto
    public LibroTexto() {
        super();
        this.curso = "";
    }

    // Constructor con parámetros
    public LibroTexto(String titulo, String autor,
                      int numeroEjemplares,
                      int numeroEjemplaresPrestados,
                      String curso) {

        super(titulo, autor, numeroEjemplares,
              numeroEjemplaresPrestados);

        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {

        return "LibroTexto{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", numeroEjemplares=" + getNumeroEjemplares() +
                ", numeroEjemplaresPrestados=" +
                getNumeroEjemplaresPrestados() +
                ", curso='" + curso + '\'' +
                '}';
    }
}