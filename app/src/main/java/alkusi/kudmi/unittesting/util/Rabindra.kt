package alkusi.kudmi.unittesting.util

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
}