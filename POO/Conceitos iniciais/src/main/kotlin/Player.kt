class Player(var name: String, var number: Int, var position: String, var isFielded: Boolean) {

    fun getStateAsString() = "Position: $position, " + if (isFielded) "Fielded" else "Bench"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Player

        if (number != other.number) return false
        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        var result = number
        result = 31 * result + name.hashCode()
        return result
    }

    override fun toString(): String {
        return "Player(name='$name', number=$number, position='$position', isFielded=$isFielded)"
    }
}