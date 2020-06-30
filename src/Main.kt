/*
Los datos que deben almacenar son:Nombre del libro.ISBN.Año publicaciónEditorialCantidad de páginasPrecioAutor del libroTipo de libro (D: Digital / I: Impreso)Este sistema debe tener una funcionalidad que permita devolver el precio con el signo $ en cualquier parte del proyecto. Además, debe contar con una función que imprima todos la información del libro.Para terminar, se solicita crear la función “main” y declarar 4 variables de tipo “LibrosEscolares”,donde 3 de estas variables deben ser mutables y una variable debe ser inmutable.Imprimir las 4 variables llamando a la función que imprime toda la información.
*/

// 5.
fun main() {

}

// 3.
fun LibrosEscolares.formateaPrecio(): String {
    return "$${this.precio}"
}

// 4.
//fun LibrosEscolares.imprimir():String {
//return this.nombreDeLibro, this.
}
