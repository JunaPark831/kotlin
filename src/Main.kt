
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

            var randomNum = kotlin.random.Random.nextInt(1,10)
            println(randomNum)
        }
    }
}