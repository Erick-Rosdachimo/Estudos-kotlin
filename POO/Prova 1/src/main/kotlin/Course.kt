import java.time.DayOfWeek
import java.time.LocalTime

class Course (
    val startTime: LocalTime,
    val endTime: LocalTime,
    val name: String,
    val code: String,
    val professor: String,
    val dayOfWeek: DayOfWeek,
    val room: Room,
) {
    val id = nextId()

    init {
        require(name.isNotEmpty()) { "Name must not be empty" }
        require(professor.isNotEmpty()) { "Professor must not be empty" }
        require(code.isNotEmpty()) { "Code must not be empty" }
        require(startTime.isBefore(endTime)) { "Start time must be before endTime" }
    }

    companion object {
        private var counter = 0
        private fun nextId() = ++counter
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Course

        return id == other.id
    }

    override fun hashCode(): Int {
        return id
    }

    override fun toString(): String {
        return "| id = $id  | $name ($code) | $dayOfWeek | Start = $startTime | End = $endTime | $professor | Room = $room |"
    }
}

enum class Room{
    C102,
    C104,
    C105,
    C106,
    C107,
    C209
}