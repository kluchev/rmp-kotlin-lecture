interface ICommand {
    fun execute(x : Int, y : Int) : Int
}

class Add() : ICommand {
    override fun execute(x: Int, y: Int) = x + y
}

class Sub() : ICommand {
    override fun execute(x: Int, y: Int) = x - y
}

class InterfaceExample1 {
    fun calc(f : ICommand, x : Int, y : Int) : Int = f.execute(x, y)
}

class InterfaceExample2 {
    fun calc(f : ICommand, x : Int, y : Int) : Int =
        when(f) {
            is Add -> f.execute(x, y)
            is Sub -> f.execute(x, y)
            else -> throw Exception("???")
        }
}