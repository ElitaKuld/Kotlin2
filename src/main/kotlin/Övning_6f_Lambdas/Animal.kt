package Övning_6f_Lambdas

class Animal (var type: String, var numberOfLegs : Int) : Printable {
    override fun getData() = println("Djurets sort: $type, antal ben: $numberOfLegs")

}