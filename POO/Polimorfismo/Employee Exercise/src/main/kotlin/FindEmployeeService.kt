class FindEmployeeService( private val repository: Repository<Employee, String>) {
    fun findById(id: String): Employee? {
        return repository.findById(id)
    }
}