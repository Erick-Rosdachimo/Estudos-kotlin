import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalTime

fun main() {
    val student = Student("SC123456X", "Carlos", LocalDate.of(2025, 2, 15))
    val course = Course(LocalTime.of(19,0), LocalTime.of(22, 30), "Banco de dados I", "BD1", "Fabio", DayOfWeek.MONDAY, Room.C102)

    print(course)
}