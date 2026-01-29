import java.time.LocalDate

abstract class Employee (val id: String, val name: String, var jobTitle: String, val dateOfEmployment: LocalDate) {
    abstract fun salary(): Double
}