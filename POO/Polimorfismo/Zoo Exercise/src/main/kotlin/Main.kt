//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val zoo = Zoo()
    val owl = Owl("Owl")
    val wolf = Wolf("Wolf")
    val lion = Lion("Lion")
    zoo.addAnimal(owl)
    zoo.addAnimal(wolf)
    zoo.addAnimal(lion)
    zoo.seeAnimals()
}