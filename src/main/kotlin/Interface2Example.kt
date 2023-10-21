interface IAdd {
    fun add(x : Int, y : Int) : Int = x + y
}

interface ISub {
    fun sub(x : Int, y : Int) : Int = x - y
}

class Calc() : IAdd, ISub

