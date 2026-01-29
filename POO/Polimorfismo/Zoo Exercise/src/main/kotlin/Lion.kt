class Lion(name: String): Animal(name), Runner {
    override fun makeSound() {
        println("Rrrrrwaarrr")
    }

    override fun run(){
        println("Lion is running!")
    }
}