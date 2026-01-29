import java.time.LocalDate

class PerHourEmployee(var hourlyRate: Double, var workedHour: Int, id: String, name: String, jobTitle: String, dateOfEmployment: LocalDate): Employee(id, name, jobTitle,
    dateOfEmployment
) {
    init {
        require(hourlyRate >= 0) { "Hourly rate must be non-negative" }
        require(workedHour >= 0) { "Worked hours must be non-negative" }
    }

    override fun salary(): Double = hourlyRate * workedHour
}