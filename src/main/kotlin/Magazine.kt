import book.Book
import book.CanAuthor
import book.CanBuy

class Magazine(
    override val name: String,
    override val price: Int
): Book(), CanBuy, CanAuthor {
    override fun detail() {
        println("Majalah ${this.name}, harganya Rp${this.price}, dan tahun terbitnya ${this.year}")
    }

    override fun buy() {
        println("Sedang membeli majalah ${this.name} dengan harga Rp${this.price}")
    }

    override fun getAuthor() {
        println("Penerbit majalah ${this.name} adalah ${this.author}")
    }
}