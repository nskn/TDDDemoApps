import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;


public class WordCounterTest {
    private WordCounter wordCount;
    @Before
    public void setup(){
        wordCount = new WordCounter();
    }

    @Test
    public void TestForCountWordsShouldReturnValueIntegerAsZeroOnNoMatch(){
        assertEquals(0,wordCount.countWords("test","Teest"));
    }

    @Test
    public void TestForGivenWordInTheGivenAnotherString(){
        assertTrue(wordCount.countWords("awesome","awe")==1);
         //assertEquals(true,wordCount.countWords("awesome","awe"));
    }

    @Test
    public void TestForCheckingGivenWrodsOcucrancesInTheString(){
        assertEquals(3, wordCount.countWords("All good, All well, All Great","All"));
    }

    @Test
    public void TestForSingleCharcterOccurancesInTheString(){
        assertEquals(3,wordCount.countWords("All good, All well, All Great","A"));
    }
    
}
