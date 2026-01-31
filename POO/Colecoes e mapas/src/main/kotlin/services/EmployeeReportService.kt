package services

import Company
import Employee
import java.time.LocalDate

class EmployeeReportService( private val company: Company )  {
    fun getEmployees(): List<Employee> {
        return company.employees.values.toList()
    }

    fun getEmployees(jobTitle: String): List<Employee> {
        require(jobTitle.isNotBlank()){ "Job title must not be blank" }
        return company.employees.values.filter { it.jobTitle == jobTitle }
    }

    fun averageSalary(jobTitle: String): Double{
        require(jobTitle.isNotBlank()){ "Job title must not be blank" }
        return company.employees.values.filter { it.jobTitle == jobTitle }.map { it.salary }.average()
    }

    fun averageSalary(startTime: LocalDate, endTime: LocalDate): Double{
        require(startTime.isBefore(endTime)){ "StartTime must be before endTime" }
        return company.employees.values.filter { !it.dateOfEmployment.isAfter(endTime) && !it.dateOfEmployment.isBefore(startTime) }.map { it.salary }.average()
    }
}