package book

abstract class Book() {
    open val name: String = "No Longer Human"
    open val price: Int = 20000
    open val year: Int = 2005
    open val author: String = "Osamu Dazai"
    open val editionNumber: Int = 20

    abstract fun detail()
}