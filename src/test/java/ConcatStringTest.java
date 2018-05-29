import org.junit.Assert;
import org.junit.Test;

public class ConcatStringTest {


    @Test
    public void concatTest() {
        Assert.assertEquals("majom", ConcatString.concat("ma", "jom"));
    }
}
