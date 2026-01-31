package services

import Company
import java.time.LocalDate

class PayrollService( private val company: Company ) {
    fun pay(id: String){
        require(id.isNotBlank()){ "ID must not be blank" }
        require(company.employees.containsKey(id)){ "Employee with id '${id}' does not exist" }
        company.employees[id]?.addPaycheck(LocalDate.now())
    }
}