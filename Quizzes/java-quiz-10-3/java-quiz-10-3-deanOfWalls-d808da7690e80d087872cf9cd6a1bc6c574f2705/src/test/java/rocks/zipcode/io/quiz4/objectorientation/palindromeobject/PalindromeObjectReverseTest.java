package rocks.zipcode.io.quiz4.objectorientation.palindromeobject;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;
import rocks.zipcode.io.quiz4.objectorientation.PalindromeObject;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObjectReverseTest {
    @Test
    public void test1() {
        test("leon", "noel");
    }

    @Test
    public void test2() {
        test("Jerry", "yrreJ");
    }

    @Test
    public void test3() {
        test("KJack", "kcaJK");
    }

    @Test
    public void test4() {
        test("redrum murder", "redrum murder");
    }

    public void test(String input, String expected) {
        String actual =  new PalindromeObject(input).reverseString();
        Assert.assertEquals(expected, actual);
    }
}
