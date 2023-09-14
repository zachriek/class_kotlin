import book.Book
import book.CanBuy
import book.CanRead

class Novel(
    override val name: String
): Book(), CanRead {

    override fun detail() {
        println("Novel ${this.name}, harganya Rp${this.price}, dan tahun terbitnya ${this.year}")
    }

    override fun read() {
        println("Sedang membaca novel ${this.name}")
    }
}