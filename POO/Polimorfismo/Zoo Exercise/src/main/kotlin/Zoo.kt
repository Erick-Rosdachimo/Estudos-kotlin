class Zoo {
    val zoo: MutableList<Animal> = mutableListOf()

    fun addAnimal(animal: Animal){
        zoo.add(animal)
    }

    fun seeAnimals(){
        zoo.forEach{
            it.makeSound()
            if (it is Runner) it.run()
        }
    }
}