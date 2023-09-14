import book.Book
import book.CanBuy
import book.CanRead

class Dictionary(
    override val name: String,
    override val price: Int,
    override val author: String
): Book(), CanRead, CanBuy {
    override fun detail() {
        println("Kamus ${this.name}, harganya Rp${this.price}, dan tahun terbitnya ${this.year}")
    }

    override fun read() {
        println("Sedang membaca kamus ${this.name}")
    }

    override fun buy() {
        println("Sedang membeli kamus ${this.name} dengan harga Rp${this.price}")
    }
}