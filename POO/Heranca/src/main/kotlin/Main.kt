import java.time.LocalDate

fun main() {
    val employees: List<Employee> = listOf(
        FullTimeEmployee(5000.0, "1", "Ana", "Dev", LocalDate.now()),
        PerHourEmployee(50.0, 160, "2", "Bruno", "Tester", LocalDate.now())
    )

    employees.forEach {
        println(it.salary())
    }
}