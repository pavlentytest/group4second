fun main() {
    // анонимная функция
    val y = fun() = println("Hello")
    y()
    val z = fun(x: Int, y: Int) = println(x+y)
    z(1,2)

    val r = bigFun(1)
    println(r(4,5))

    example(5,6, fun(x: Int, y: Int) = println("$x $y"))

}

fun example(k: Int, z: Int, test: (Int, Int) -> Unit) {
    test(k,z)
}

fun bigFun(k: Int) : (Int, Int) -> Int {
    when(k) {
        1 -> return fun(a: Int, b: Int) : Int = a*b*a*b
        2 -> return {x: Int, y: Int -> 1000*x*y}
        else -> return fun(x: Int, y:Int) = 5
    }
}

fun main2(args: Array<String>) {
   // println(test(4,5));

    println("12312")
    val x : () -> Unit = { println("hello") }
    val x1 = { println("123") }
    x()
    x1() // x1.invoke()
    x1.invoke()

    val printer = { message: String -> println(message) }
    printer("123")

    val sum = {x: Int, y: Int -> val res = x+y; println(res)}

    val sum2 = {x: Int, y: Int ->
        val res = x+y
        println(res)
        // не может быть return
    }
    val sum3 : (Int, Int) -> Int = {x: Int, y: Int ->
        val res = x+y
        res
    }

    sum2(5,6)
    println(sum3)

    //  передача лямбды как параметра
    doOperation(1,2, { m: Int, n: Int -> m*n+1000})
    doOperation(1,2) { m: Int, n: Int -> m * n + 1000 }
    doOperation { i, i2 -> i+i2 }
    doOperation (4){ i, i2 -> i+i2 }
    // Анонимная функция
    doSmth(100,200, fun(x: Int, y: Int) = x*y)

}
fun doOperation(x1: Int=2, y1: Int=2, op: (Int, Int) -> Int) {
    println(op(x1,y1))
}
fun doSmth(x1: Int, y1: Int, op: (Int, Int) -> Int) {
    println(op(x1,y1))
}



