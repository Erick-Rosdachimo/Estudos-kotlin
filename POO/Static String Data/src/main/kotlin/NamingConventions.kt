object NamingConventions {
    fun isFollowingConvetion(valor: String, convention: Convention) : Boolean {
        return when (convention) {
            Convention.VARIABLE -> {
                valor[0].isLowerCase() && !valor.contains("_")
            }

            Convention.CONSTANT -> {
                return valor.count({ it.isUpperCase() || it == '_' }) != valor.length
            }

            Convention.CLASS -> {
                valor[0].isUpperCase() && !valor.contains("_")
            }

            Convention.METHOD -> {
                valor[0].isLowerCase() && !valor.contains("_")
            }
        }
    }

    fun fromConstToVariable(valor: String): String{
        if (valor.isBlank()) return ""
        return valor.split("_").joinToString("") { it.lowercase().replaceFirstChar { it.uppercase() } }.replaceFirstChar { it.lowercase() }
    }

    fun fromVariableToConst(valor: String): String{
        if (valor.isBlank()) return ""
        val acc = mutableListOf<String>()
        for (element in valor) {
            if (element.isUpperCase()) acc.add("_$element")
            else acc.add("$element")
        }
        return acc.joinToString("").uppercase()
    }

    fun isValidJavaIdentifier(valor: String): Boolean {
        if (valor.isBlank()) return false

        val first = valor[0]
        if (!(first.isLetter() || first == '_' || first == '$')) return false

        for (c in valor) {
            if (!(c.isLetterOrDigit() || c == '_' || c == '$')) return false
        }

        return true
    }
}