import java.time.LocalDate
import java.time.Period

class Employee(val id: String, val name: String, var jobTitle: String, var salary: Double, val dateOfEmployment: LocalDate) {
    val paychecks = mutableListOf<Paycheck>()

    init {
        require(name.isNotEmpty()) { "Name must not be empty" }
        require(jobTitle.isNotEmpty()) { "Job title must not be empty" }
        require(salary > 0) { "Salary must be positive" }
        require(dateOfEmployment <= LocalDate.now()) { "Date of employment must not be on future" }
    }

    fun getYearsOfService(): Double = Period.between(dateOfEmployment, LocalDate.now()).years.toDouble()

    fun addPaycheck(payday: LocalDate){
        val paycheck = Paycheck(payday, salary)
        paychecks.add(paycheck)
    }

    fun removePaycheck(paycheck: Paycheck){
        paychecks.remove(paycheck)
    }

    fun iteratorPaycheck(): Iterator<Paycheck> = paychecks.iterator()


    override fun toString(): String {
        return "Employee(name='$name', jobTitle='$jobTitle', salary=$salary, dateOfEmployment=$dateOfEmployment)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Employee

        return id == other.id
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }
}