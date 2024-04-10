
class KotlinStudy{
    companion object {
        @JvmStatic

        fun main(args: Array<String>) {
            val value = 4
            println("Hello World!")
            println("print value : $value")
            println("update in github please..")
            println("oh sung-gong!!")
            println("push까지 해야 github에 반영됨!!")
            println("repeat")

            val name: String = "Flature"
            val sentence: String = "studying Kotlin"

            val number1 = 123
            val number = 123L
            val number3: Long = 123
            val number4: Double = 123.45
            val number5: Float = 123.45F
            val number6 = 123.45

            val isTrue = true
            val isFalse: Boolean = false
            var isFalse2: Any = false
            isFalse2 = true
            isFalse2 = "can be String"
            println(isFalse2)

            val character = 'a'
            println(character)
            println(character + 1)

            var a: Int = -1
            println(a++) //++나중에 수행
            println(++a) //++먼저 수행
            var b: Int = 1
            println(a == b) //값 비교
            println(a === b) //참조 주소가 같은지 비교
            println(a !== b)
            println(a == b && a != b)
            println(!(a == b))

            var g = 1.0 / 3
            println("g $g")

            var num = 5
            num += 3
            num -= 4
            num *= 4
            num /= 2
            num %= 3

            var randomNum = kotlin.random.Random.nextInt(0,199)
            println(randomNum)
            println(randomNum > 6)

            var rdn = kotlin.random.Random.nextInt(0,199)
            if( rdn < 100){
                println("your score is under 100 : $rdn")
            } else if(rdn > 100) {
                println("your score is over 100 : $rdn")
            } else{
                println("your score is 100 : $rdn")
            }
            var max = if(randomNum > rdn) randomNum else rdn
            println(max)

            var x = 10
            while (x>5){
                println(x--)
            }
            println("${x+10}이다.")

            var num11 : Int = kotlin.random.Random.nextInt(1,10)
            when(num11){
                1, 2, 3 -> println("num11 is between 1 and 3")
                in 4 .. 8 -> println("num11 is between 4 and 8 ")
                else -> println("num11 is between 9 and 10")
            }
            println(num11)

            when{
                num11>5 -> println("num11 is over 5")
                else -> println("num11 is under 5")
            }

            for ( i in 1..10){
                println(i)
            }
            println()

            for (i in 10 downTo 1 step 2){
                println(i)

            }

            namedArgument(a="a","b","c")

        }
        fun function1(a: Int):String{
            return "a" + "B"
        }

        //return 생략 방식
        fun sum2(a: Int, b : Int) = a+b

        fun multi(a: Int, b : Int) = (a*b)

        fun noReturnFunction(a: String){
            println(a)
        }

        fun defaultParameter(a: String = "default value"){
            println(a)
        }

        fun namedArgument(a:String, b:String, c:String){
            print("$a $b $c")
        }
    }
}