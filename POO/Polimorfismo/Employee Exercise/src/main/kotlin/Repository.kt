interface Repository <T, ID> {
    fun save(entity: T)
    fun findById(id: ID): T?
}