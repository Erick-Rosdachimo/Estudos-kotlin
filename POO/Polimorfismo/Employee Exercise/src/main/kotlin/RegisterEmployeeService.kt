class RegisterEmployeeService(
    private val repository: Repository<Employee, String>
) {

    fun register(employee: Employee) {
        if (repository.findById(employee.id) == null) {
            repository.save(employee)
        }
    }
}