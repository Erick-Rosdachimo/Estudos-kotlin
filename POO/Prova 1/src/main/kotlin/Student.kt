import java.time.LocalDate
import java.time.temporal.ChronoUnit

class Student (
    val id: String,
    val name: String,
    val admissionDate: LocalDate
) {
    init{
        require(!admissionDate.isAfter(LocalDate.now())){ "admissionDate must not be after today" }
        require(name.isNotBlank()) { "Name must not be blank" }
        require(id.isNotBlank()) { "Id must not be blank" }
        require(id.length == 9) { "Id must have exactly 9 characters" }
        require(id[0] == 'S' && id[1] == 'C') { "Id must start with 'SC'" }
        require(id.slice(2..7).toIntOrNull()?.takeIf { it >= 0 } != null) { "Id must be on pattern SC000000X" }
        require(id.last().isDigit() || id.last() == 'X') { "Last character must be a digit or X" }
    }

    fun getSemester(): Int {
        return ChronoUnit.MONTHS.between(admissionDate, LocalDate.now()).toInt() / 6 + 1

    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Student

        return id == other.id
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }

    override fun toString(): String {
        return "$id | $name | Admission date = $admissionDate"
    }
}