class ThreadClass1 : Thread() {
    override fun run() {
        repeat(5 ) {
            println("${Thread.currentThread()}  run  #$it")
            Thread.sleep(500)
        }
    }
}

class ThreadClass2 : Runnable {
    override fun run() {
        repeat(5 ) {
            println("${Thread.currentThread()}  run  #$it")
            Thread.sleep(500)
        }
    }
}


class ThreadClass3  {
     fun start() {
         Thread {
             repeat(5) {
                 println("${Thread.currentThread()}  run  #$it")
                 Thread.sleep(500)
             }
         }.start()
    }
}

class ThreadClass4  {
    fun start() {
        val thread = Thread {
            repeat(5) {
                println("${Thread.currentThread()}  run  #$it")
                Thread.sleep(500)
            }
        }
        thread.start()
    }
}
