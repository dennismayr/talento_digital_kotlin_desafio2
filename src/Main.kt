/*
Los datos que deben almacenar son:

* Nombre del libro
* ISBN
* Año publicación
* Editorial
* Cantidad de páginas
* PrecioAutor del libro
* Tipo de libro (D: Digital / I: Impreso)
*/

// 5.
fun main() {

}

// 3.
fun precioFormateado(precioLibro: Int): String { // argumento nuevo (precioLibro de tipo Int), parseado a String
    return "$${precioLibro}"
// al llamar a este metodo, se puede pasar e.g. libro1.precio,
}

// 4.
fun imprimir(libro: LibrosEscolares) { // por cada `libros` en `LibrosEscolares`
    println(
        "Nombre: ${libro.nombreDeLibro}\n" +
                "ISBN: ${libro.ISBN}\n" +
                "Año de publicación: ${libro.anioPublicacion}\n" +
                "Editorial: ${libro.editorial}\n" +
                "Número de páginas: ${libro.cantPaginas}\n" +
                "Precio: ${precioFormateado(libro.precio)}\n" +
                "Autor: ${libro.autorLibro}\n" +
                "Formato: ${libro.formatoDeLibro}\n"
    )
}
