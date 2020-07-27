import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SpellCheckerTest {

    SpellChecker spellChecker;
    @Before
    public void setup() {
        this.spellChecker = new SpellChecker();
    }
    @Test
    public void readFileTest() throws FileNotFoundException {
        //given
        Scanner sc = new Scanner(new File("RawData.txt"));
        String [] expectedLine= {"cookies"};
        //when action
        String [] actualLine= spellChecker.getLine(sc.nextLine()); //calls getLine fx
        //then
        Assert.assertEquals(expectedLine,actualLine);
    }
}
