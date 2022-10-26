import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test

class CoroutineTest {

    /**
     * Coroutine 은 Thread 단위가 아니라
     */
    @Test
    fun runBlockingTest() =
        runBlocking {
            launch {
                delay(1000L)
                println("World!")
            }
        println("Hello")
    }
}