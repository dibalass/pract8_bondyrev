fun main(){
    var bk: Book=Book()
    println("книгу <"+bk.name+"> написал " +bk.autor+" в "+bk.year)
        var book1 = Book()
        println("введи название книги")
        var nm = readLine().toString()
    try {
        book1.name = nm
        println("сколько в ней страниц")
        var num = readLine()!!.toInt()
        book1.str = num
        println("какого она года выпуска")
        var voz = readLine()!!.toInt()
        if (num<1||voz<0)
            println("ошибка")
        else {
            book1.year = voz
            book1.sizebook()
            book1.sayAge()
        }
    }
    catch (e: Exception) {
        println("ошибка")
    }
    var zxc=Product()
    zxc.buyname()
    zxc.cena()
    zxc.ocenka()
}