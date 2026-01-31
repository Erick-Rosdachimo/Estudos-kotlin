import java.time.LocalDate

class Company() {
    val employees: MutableMap<String,Employee> = mutableMapOf()

    fun hire(id: String, name: String, jobTitle: String, salary: Double) {
        if (employees.containsKey(id)) return
        val employee = Employee(id, name, jobTitle, salary, LocalDate.now())
        employees[id] = employee
    }

    fun fire(id: String){
        employees.remove(id)
    }

    fun getEmployees(): List<Employee> {
        return employees.values.toList()
    }

    fun getEmployees(jobTitle: String): List<Employee> {
        return employees.values.filter { it.jobTitle == jobTitle }
    }

    fun pay(id: String){
        employees[id]?.addPaycheck(LocalDate.now())
    }

    fun increaseSalary(id: String, newSalary: Double){
        if (newSalary <= 0) return
        employees[id]?.salary = newSalary
    }

    fun averageSalary(jobTitle: String): Double{
        return employees.values.filter { it.jobTitle == jobTitle }.map { it.salary }.average()
    }

    fun averageSalary(startTime: LocalDate, endTime: LocalDate): Double{
        return employees.values.filter { !it.dateOfEmployment.isAfter(endTime) && !it.dateOfEmployment.isBefore(startTime) }.map { it.salary }.average()
    }
}