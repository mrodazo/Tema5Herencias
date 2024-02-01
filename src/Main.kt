//Si no se pone la clase Open o la fun Open, la subclase no puede acceder a ellas
open class Base(var p: Int) {
    open fun incrementar(num: Int) {
        p += num
    }
}

class Derivada(p: Int, var msj: String) : Base(p) {
    override fun incrementar(num: Int) {
        //p += (num * 2)
        super.incrementar(num * 2) //Esto hace lo mismo que la línea de arriba
    }
}

class Derivada2 : Base {
    var msj: String = ""
    constructor(p: Int) : super(p) //Para llamar desde un constructor secundario a la clase, hay que llamarla con super()
}

fun main() {
    val base = Base(10)
    val derivada = Derivada(10,"Esto es un mensaje")
    val derivada2 = Derivada2 (10)

    base.incrementar(5)
    derivada.incrementar(5)

    println("${derivada.p}, ${derivada.msj}")
    println("${base.p}")
}