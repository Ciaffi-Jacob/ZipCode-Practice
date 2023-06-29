package rocks.zipcode.io.quiz4.collections.simplestringgroup;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.collections.SimpleStringGroup;

/**
 * @author leon on 11/12/2018.
 */
public class DistinctTest {
    @Test
    public void test1() {
        test("first test");
    }

    @Test
    public void test2() {
        test("second test");
    }

    @Test
    public void test3() {
        test("third test");
    }

    private void test(String valueToInsert) {
        // given
        SimpleStringGroup group = new SimpleStringGroup();

        // when
        Assert.assertFalse(group.has(valueToInsert));
        group.insert(valueToInsert);

        // then
        Assert.assertTrue(group.has(valueToInsert));
    }
}
