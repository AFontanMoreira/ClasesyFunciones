class Adestrador {

    var id: Int = 52

    var nome: String = "Pepito"

    var apelido: String = "Gonzalez"

    var edade: Int = 34

    var idFederacion: String = "12345"

    constructor(id: Int, nome: String, apelido: String, edade: Int, idFederacion: String) {

        this.id = id

        this.nome = nome

        this.apelido = apelido

        this.edade = edade

        this.idFederacion = idFederacion
    }

    fun concentrarse(tiempoConcentracion: Int): Int = tiempoConcentracion

    fun viaxar(destino: String): String = destino

    fun dirixirPartido(): Unit {}

    fun dirixirAdestramento(): Unit {}

    override fun toString(): String {
        return "Adestrador(id=$id, nome='$nome', apelido='$apelido', edade=$edade, idFederacion='$idFederacion')"
    }

}