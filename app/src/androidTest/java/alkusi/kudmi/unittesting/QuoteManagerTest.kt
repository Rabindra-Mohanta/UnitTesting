package alkusi.kudmi.unittesting

import alkusi.Quote
import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.gson.JsonSyntaxException
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test
import java.io.FileNotFoundException

class QuoteManagerTest {



    @Test(expected = FileNotFoundException::class)
    fun populateQuoteFromAssets() {
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        quoteManager.populateQuoteFromAssets(context,"")
    }
    @Test(expected = JsonSyntaxException::class)
    fun populateQuoteFromAssets_InvalidJSON_excepted_Exception() {
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        quoteManager.populateQuoteFromAssets(context,"malfformed.json")
    }

    @Test
    fun testPopulateQuoteFromAssets_ValidJSON_expected_Count() {
        val quoteManager = QuoteManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        quoteManager.populateQuoteFromAssets(context,"quotes.json")
        assertEquals(202,quoteManager.quoteList.size)
    }
    @Test
    fun testPreviousQuote_expected_CorrectQuote()
    {
        val quoteManager = QuoteManager()
        quoteManager.populateQuotes(arrayOf(
                Quote("this is first quote","1"),
                    Quote("this is second quote","2"),
                   Quote("this is third quote","3"),
                   Quote("this is fourth quote","4"),
                  Quote("this is fifth quote","5")
        ))
        val quote = quoteManager.getPreviousQuote()
        //Assert
        assertEquals("1",quote.author)

    }
    @Test
    fun testNextQuote_expected_CorrectQuote()
    {
        val quoteManager = QuoteManager()
        quoteManager.populateQuotes(arrayOf(
            Quote("this is first quote","1"),
            Quote("this is second quote","2"),
            Quote("this is third quote","3"),
            Quote("this is fourth quote","4"),
            Quote("this is fifth quote","5")
        ))
        val quote = quoteManager.getNextQuote()
        //Assert
        assertEquals("2",quote.author)

    }
}