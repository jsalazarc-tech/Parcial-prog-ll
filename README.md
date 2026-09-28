# Parcial I - Programación II

## Integrantes

* Jeram Jeamdro Salazar Calderon
* Yeneicy Alexandra Michileno Salcedo

## Descripción

Este proyecto corresponde al Parcial I de Programación II.

Se desarrolló un sistema de gestión de biblioteca aplicando conceptos de Programación Orientada a Objetos como encapsulamiento y herencia.

El proyecto fue desarrollado utilizando Java y Maven.

## Clases implementadas

* Libro
* LibroTexto
* LibroTextoUNIAC
* Novela

## Funcionalidades

El programa permite:

* Crear libros utilizando diferentes constructores.
* Consultar y modificar los datos de los libros.
* Realizar préstamos.
* Realizar devoluciones.
* Crear libros de texto.
* Crear libros de texto publicados por una facultad.
* Crear novelas indicando su tipo.
* Mostrar la información de los objetos mediante `toString()`.

## Herencia

La estructura de herencia implementada es:

Libro
→ LibroTexto
→ LibroTextoUNIAC

Libro
→ Novela

## Situaciones donde la herencia no sería posible

Se identificaron dos situaciones:

1. Una clase declarada como `final` no puede ser heredada.
2. Un constructor privado de la clase padre no puede ser utilizado directamente por la clase hija.

Estas situaciones fueron documentadas en `CasosHerencia.java`.

## Nuevos atributos propuestos

### Editorial
private String editorial; 

Permite identificar la editorial que publicó el libro.

### Año de publicación
private int anioPublicacion;
public boolean estaDisponible() {

    return numeroEjemplaresPrestados < numeroEjemplares;
}

Permite conocer el año en que fue publicado el libro.

## Método adicional propuesto

### `estaDisponible()`

Permite comprobar si todavía existen ejemplares disponibles para realizar un préstamo.

## Diagrama UML

El diagrama UML representa las clases del proyecto y las relaciones de herencia entre ellas.

## Participación de integrantes

Cada integrante trabajó en una rama independiente
utilizando Git y GitHub.

## Clases

La clase Libro representa la información básica de un libro.
LibroTexto y Novela heredan las características de Libro.
LibroTextoUNIAC hereda de LibroTexto.