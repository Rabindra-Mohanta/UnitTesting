package alkusi.kudmi.unittesting

import alkusi.kudmi.unittesting.util.Rabindra
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before

class StringTest {
    lateinit var rabindra: Rabindra;
    @Before
    fun startFuction()
    {
        rabindra = Rabindra()
    }
    @Test
    fun testStringReversal_emptyString_ExpectedEmptyString()
    {

        val result = rabindra.reverse("")
        assertEquals("",result)

    }
    @Test
    fun testReversal_singleValue_ExpectedSingle()
    {

        val result = rabindra.reverse("a")
        assertEquals("a",result)
    }

    @Test
    fun testReversal_validInput_ExpectedValid()
    {

        val result = rabindra.reverse("Rabindra")
        assertEquals("ardnibaR",result)
    }

    @Test(expected = IllegalArgumentException::class)
    fun testReversal_NullValue_expectedException()
    {
        val result = rabindra.reverse(null)
    }
}