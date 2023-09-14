fun main() {
    val novel = Novel(name = "Dunia Shopie")
    novel.read()

    println("-------------------------------------")

    val magazine = Magazine(name = "Keren", price = 20000)
    magazine.buy()
    magazine.getAuthor()

    println("-------------------------------------")

    val dictionary = Dictionary(name = "Bahasa Inggris", price = 50000, author = "Penerbit Kamus")
    dictionary.read()
    dictionary.buy()
}