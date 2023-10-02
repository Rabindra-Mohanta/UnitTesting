package alkusi.kudmi.unittesting.util
import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test
class RabindraTest {
    lateinit var rabindra: Rabindra
    @Before
    fun setUp() {
        rabindra = Rabindra()
        println("Before Every Test case")
    }
    @After
    fun tearDown() {
        println("After Every Test case")
    }
    @Test
    fun isPallindrome() {
        //Arrange
        //act
        val result = rabindra.isPallindrome("hello")
        //ASSERT
        assertEquals(false, result)
    }
    @Test
    fun isPlallindrome_inputString_level_expectedTrue() {
        //Arrange
        //act
        val result = rabindra.isPallindrome("level")
        //ASSERT
        assertEquals(true, result)
    }
}