package services

import Company
import Employee
import java.time.LocalDate
import kotlin.collections.set

class EmployeeManagementService( private val company: Company ) {
    fun hire(id: String, name: String, jobTitle: String, salary: Double) {
        require(id.isNotBlank()){ "ID must not be blank" }
        require(!company.employees.containsKey(id)){ "Employee with id '${id}' already exist" }
        require(name.isNotBlank()){ "Name must not be blank" }
        require(jobTitle.isNotBlank()){ "Job title must not be blank" }
        require(salary > 0) { "Salary must be greater than 0" }

        company.employees[id] = Employee(id, name, jobTitle, salary, LocalDate.now())
    }

    fun fire(id: String){
        require(id.isNotBlank()){ "ID must not be blank" }
        require(company.employees.containsKey(id)){ "Employee with id '${id}' does not exist" }
        company.employees.remove(id)
    }

    fun increaseSalary(id: String, newSalary: Double){
        require(id.isNotBlank()){ "ID must not be blank" }
        require(company.employees.containsKey(id)){ "Employee with id '${id}' does not exist" }
        require(newSalary > 0) { "Salary must be greater than 0" }
        company.employees[id]?.salary = newSalary
    }
}