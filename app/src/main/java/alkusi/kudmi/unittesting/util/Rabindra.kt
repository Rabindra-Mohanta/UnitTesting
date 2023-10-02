package alkusi.kudmi.unittesting.util

import java.lang.IllegalArgumentException

class Rabindra {
    fun isPallindrome(value:String):Boolean
    {
        var result = true
        var i = 0;
        var j = value.length-1;
        while (i<j)
        {
            if(value[i]!=value[j])
            {
                result = false
                break
            }
            i++;
            j--
        }

        return result
    }
    fun reverse(str:String?):String{
        if(str==null)
        {
            throw IllegalArgumentException("Input String is Required")
        }
        val chars = str.toCharArray();
        var i = 0;
        var j = chars.size-1;
        while(i<j)
        {
            val temp = chars[i]
            chars[i] = chars[j]
            chars[j] = temp
            i++;
            i--;
        }

        return chars.joinToString("");

    }

    fun validPassword(input:String) = when{
        input.isBlank() ->
        {
            "password is required field"
        }
        input.length<6 ->
        {
            "Length of the password should be greater than 6"
        }
        input.length >15 ->
        {
            "Length of the password should be less than 15"
        }
        else ->
        {
            "valid"
        }
    }
}