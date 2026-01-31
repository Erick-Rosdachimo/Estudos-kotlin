import java.time.Period
import java.time.LocalDate

class Employee(val id: String, val name: String, var jobTitle: String, var salary: Double, var dateOfEmployment: LocalDate) {
    init{
        require(name.isNotEmpty()) { "Name must not be empty" }
        require(jobTitle.isNotEmpty()) { "Job title must not be empty" }
        require(salary > 0) { "Salary must be positive" }
        require(dateOfEmployment <= LocalDate.now()) { "Date of employment must not be on future" }
    }

    fun getYearsOfService(): Int = Period.between(dateOfEmployment, LocalDate.now()).years

    fun calculateBonus(): Double = salary + salary * 0.1
}