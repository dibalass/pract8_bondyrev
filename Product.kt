class Product (){
    var name: String=""
    var price: Int=0
    var edin: String=""
    var type: String=""
    var sum: Int=0
        fun buyname() {
            println("введи цифру вида продукта которого хочешь купить")
            println("1. Напитки")
            println("2. Сладости")
            println("3. Снеки")
            try {
                var vid = readLine()!!.toInt()
                when (vid) {
                    1 -> {
                        println("введи цифру товара которогу хочешь купить")
                        println("1. Кока кола")
                        println("2. Кефир")
                        println("3. Холодный чай")
                        edin = "л."
                        type = "напитки"
                        var tov = readLine()!!.toInt()
                        when(tov){
                            1->name = "Кока кола"
                            2->name = "Кефир"
                            3->name = "Холодный чай"
                            else -> println("ошибка")
                        }
                    }
                    2 ->{
                        println("введи цифру товара которогу хочешь купить")
                        println("1. Мармелад")
                        println("2. Леденец")
                        println("3. Шоколад")
                        edin = "шт."
                        type = "Сладости"
                        var tov = readLine()!!.toInt()
                        when(tov){
                            1->name = "Мармелад"
                            2->name = "Леденец"
                            3->name = "Шоколад"
                            else -> println("ошибка")
                        }
                    }
                    3 -> {
                        println("введи цифру товара которогу хочешь купить")
                        println("1. Чипсы")
                        println("2. Сухарики")
                        println("3. Кукурузные палочки")
                        edin = "гр."
                        type = "Снеки"
                        var tov = readLine()!!.toInt()
                        when(tov){
                            1->name = "Чипсы"
                            2->name = "Сухарики"
                            3->name = "Кукурузные палочки"
                            else -> println("ошибка")
                        }
                    }
                    else -> {
                        println("ошибка")
                    }
                }
            }
            catch (e: Exception){
                println("ошибка")
            }
        }
        fun cena()  {
            println("введи цифру ценового сегмента")
            println("1. Дешевый сегмент")
            println("2. Средний сегмент")
            println("3. Дорогой сегмент")
            var cen = readLine()!!.toInt()
            when (cen) {
                1 -> price = 30
                2 -> price = 70
                3 -> price = 150
                else -> println("ошибка")
            }
            println("сколько ты его купишь")
            var kol = readLine()!!.toInt()
            sum = kol*price
            println("За продукт $name тебе придется заплатить $sum")
        }
        fun ocenka() {
            when (sum) {
                in 0..1000 -> println("Вышло не дорого")
                else ->   println("Вышло дорого")
            }
        }
    }