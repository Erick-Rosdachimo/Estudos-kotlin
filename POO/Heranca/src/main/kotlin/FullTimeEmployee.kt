import java.time.LocalDate

class FullTimeEmployee(var monthlySalary: Double, id: String, name: String, jobTitle: String, dateOfEmployment: LocalDate): Employee(id, name, jobTitle,
    dateOfEmployment
){
    init {
        require(monthlySalary >= 0) { "Monthly salary must be non-negative" }
    }

    override fun salary(): Double = monthlySalary
}