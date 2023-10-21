import redis.clients.jedis.Jedis

class Redis5 {

    fun start() {
        val jedis = Jedis("127.0.0.1", 6379)

        repeat(1000) {
            jedis.set("test_jedis", "test$it")
        }
    }
}
