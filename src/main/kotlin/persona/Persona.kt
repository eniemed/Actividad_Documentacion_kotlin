package persona
/**
 * ## CLASE **PERSONA**
 *
 * Los atributos deben ser [nombre], [apellidos] y [dni]
 *
 * Los añadiremos de esa manera en el constructor
 *
 * Declararemos las variables debajo del mismo
 *
 * @author Esther Nieto Medina
 **/
class Persona(nombre_pers: String, apellidos_pers: String, dni_pers: String) {
    /**
     * Añadimos los setter y getter de [nombre], el cual se asegura de que no sobrepasa los **40 caracteres**
     */
    var nombre = ""
        get() = field
        set(value) {
            if (value.length < 40) {
                field = value
            }
        }

    /**
     * Mediante setter y getter de [apellidos], nos aseguraremos de que no sobrepasa los 60 caracteres en total
     */
    var apellidos = ""
        get() = field
        set(value) {
            if (value.length < 60) {
                field = value
            }
        }

    /**
     * Mediante el getter y setter de [dni] nos aseguraremos de que el dni es exactamente 9 caracteres de largo
     */
    var dni = ""
        get() = field
        set(value) {
            if (value.length == 9) {
                field = value
            }
        }

    /**
     * Por último, haremos una función [toString] que sirva como presentación para la persona
     *
     * El [toString] devolverá el [nombre], los [apellidos] y el [dni]
     */
    override fun toString(): String {
        return "Persona(nombre='$nombre', apellidos='$apellidos', dni='$dni')"
    }
}
/**
 * @since 23/03/2023
 */

