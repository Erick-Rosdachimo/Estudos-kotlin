class Wolf(name: String): Animal(name), Runner {
    override fun makeSound() {
        println("Auuuuuu")
    }

    override fun run(){
        println("Wolf is running!")
    }
}