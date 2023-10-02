package alkusi.kudmi.unittesting

import alkusi.kudmi.unittesting.util.Rabindra
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class PasswordTest {
    lateinit var rabindra: Rabindra
    @Before
    fun initBefore()
    {
        rabindra = Rabindra()
    }
    @Test
    fun validPassword_blankInput_expectedRequiredFiled()
    {
        val rabindra = Rabindra()
        val result = rabindra.validPassword("    ")
        Assert.assertEquals("password is required field",result)
    }
    @Test
    fun validPassword_2CharInput_expectedValidationMsg()
    {
        val result = rabindra.validPassword("fr")
        Assert.assertEquals("Length of the password should be greater than 6",result)
    }

    @Test
    fun validPassword_moreThan15_Faild()
    {
        val result = rabindra.reverse("tjghlkjdlogjgolgkjgolgjgolgjgkgkgkgkgkgkgkgk")
        Assert.assertEquals("Length of the password should be less than 15",result)
    }

    @Test
    fun validPassword_vaildInput_validOutPut()
    {
        val result = rabindra.reverse("Rabindra")
        Assert.assertEquals("valid",result)
    }
}