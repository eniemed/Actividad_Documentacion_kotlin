package persona

class Persona(nombre_pers: String, apellidos_pers: String, dni_pers: String) {

    var nombre = ""
        get() = field
        set(value) {
            if (value.length < 40) {
                field = value
            } else {
                println("El nombre introducido es demasiado largo, inténtelo de nuevo")
            }
        }
    var apellidos = ""
        get() = field
        set(value) {
            if (value.length < 60) {
                field = value
            } else {
                println("Los apellidos introducidos son demasiado largos, inténtelo de nuevo")
            }
        }
    var dni = ""
        get() = field
        set(value) {
            if (value.length == 9) {
                field = value
            } else {
                println("El DNI introducido no es válido, inténtelo de nuevo")
            }
        }

    fun mostrar() {
        println("DNI: $dni" +
                "Nombre: $apellidos, $nombre")
    }
}
