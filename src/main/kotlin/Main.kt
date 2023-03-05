fun fun1(a : Int, b : Int) : Int {
    return (a + b) * 2
}

fun main() {
    val const1 = 1
    var result: Int
    print("Hello ")
    println("World!")
    result = const1 + 3
    result += 1
    println( "result = $result")
    println( fun1( 2,3) )
}