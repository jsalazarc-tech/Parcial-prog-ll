package com.uniajc;

public class Novela extends Libro {

    private String tipo;

    // Constructor por defecto
    public Novela() {
        super();
        this.tipo = "";
    }

    // Constructor con parámetros
    public Novela(String titulo, String autor,
                  int numeroEjemplares,
                  int numeroEjemplaresPrestados,
                  String tipo) {

        super(titulo, autor, numeroEjemplares,
              numeroEjemplaresPrestados);

        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {

        return "Novela{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", numeroEjemplares=" + getNumeroEjemplares() +
                ", numeroEjemplaresPrestados=" +
                getNumeroEjemplaresPrestados() +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}