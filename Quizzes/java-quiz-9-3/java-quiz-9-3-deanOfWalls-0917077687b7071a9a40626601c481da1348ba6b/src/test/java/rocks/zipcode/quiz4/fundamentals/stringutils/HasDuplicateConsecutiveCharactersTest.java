package rocks.zipcode.quiz4.fundamentals.stringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz4.fundamentals.StringUtils;

public class HasDuplicateConsecutiveCharactersTest {
    @Test
    public void test1() {
        String input = "Happy";
        Assert.assertTrue(StringUtils.hasDuplicateConsecutiveCharacters(input));
    }

    @Test
    public void test2() {
        String input = "Fool";
        Assert.assertTrue(StringUtils.hasDuplicateConsecutiveCharacters(input));
    }

    @Test
    public void test3() {
        String input = "George";
        Assert.assertFalse(StringUtils.hasDuplicateConsecutiveCharacters(input));
    }

    @Test
    public void test4() {
        String input = "False";
        Assert.assertFalse(StringUtils.hasDuplicateConsecutiveCharacters(input));
    }
}
