/*
* Desafío 2: Biblioteca
*/

// 5.
fun main() {

// 6.
    var libro1 = LibrosEscolares(
        "Hitchhiker's Guide to the Galaxy",
        "9780010-10",
        "1978",
        "Ballantine Books",
        224,
        2500,
        "Douglas Adams",
        "D"
    )
    var libro2 = LibrosEscolares(
        "Crónica de una muerte anunciada",
        "9780010-20",
        "1981",
        "Vintage Books",
        128,
        9000,
        "Gabriel García Marquez",
        "D"
    )
    var libro3 = LibrosEscolares(
        "Eva Luna",
        "9780010-30",
        "1987",
        "Atria",
        368,
        6700,
        "Isabel Allende",
        "D"
    )
    var libro4 = LibrosEscolares(
        "Minima Moralia: Reflexiones desde la vida dañada",
        "9780010-40",
        "1951",
        "Ediciones Akal",
        278,
        5000,
        "Theodor W. Adorno",
        "D"
    )

// 7.
    imprimir(libro1)
    imprimir(libro2)
    imprimir(libro3)
    imprimir(libro4)
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
                "Formato: ${libro.formatoDeLibro}\n" + "\n"
    )
}
