package alkusi.kudmi.unittesting.util

import org.junit.Assert.*

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class ParameterizedExample(val inputString: String,val expectedValue:Boolean) {
    @Test
    fun test()
    {
        val rabindra = Rabindra()
        val result = rabindra.isPallindrome(inputString)
        assertEquals(expectedValue,result)
    }
    companion object{
        @JvmStatic
        @Parameterized.Parameters(name = "{index}:{0} is palindrome - {1}")
        fun data():List<Array<Any>>{
            return listOf(
                arrayOf("hello",false),
                arrayOf("level",true),
                arrayOf("a",true),
                arrayOf("",true)
            )
        }
    }
}