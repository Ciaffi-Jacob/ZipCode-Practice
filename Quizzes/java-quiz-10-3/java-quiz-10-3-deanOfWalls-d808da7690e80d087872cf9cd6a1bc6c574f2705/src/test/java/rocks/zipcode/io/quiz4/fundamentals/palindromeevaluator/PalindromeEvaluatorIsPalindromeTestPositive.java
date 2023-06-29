package rocks.zipcode.io.quiz4.fundamentals.palindromeevaluator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;
import rocks.zipcode.io.quiz4.objectorientation.PalindromeObject;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluatorIsPalindromeTestPositive {
    @Test
    public void test1() {
        test("racecar");
    }

    @Test
    public void test2() {
        test("racEcar");
    }
    
    @Test
    public void test3() {
        test("redder");
    }
    
    @Test
    public void test4() {
        test("redrum murder");
    }
    
    public void test(String input) {
        Assert.assertTrue(PalindromeEvaluator.isPalindrome(input));
    }
}
