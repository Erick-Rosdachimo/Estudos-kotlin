class FakeEmployeeRepository():Repository<Employee, String> {
    val employees = mutableListOf<Employee>()
    override fun save(entity: Employee) {
        employees.add(entity)
    }

    override fun findById(id: String): Employee? {
        return employees.find { it.id == id }
    }
}