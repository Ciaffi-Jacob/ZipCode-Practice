package rocks.zipcode.io.quiz4.collections.simplestringgroup;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.collections.SimpleStringGroup;

/**
 * @author leon on 11/12/2018.
 */
public class DeleteTest {
    @Test
    public void test1() {
        // given
        SimpleStringGroup group = new SimpleStringGroup();
        String valueToInsert = "first test";

        // when
        group.insert(valueToInsert);
        group.delete(valueToInsert);

        Assert.assertFalse(group.has(valueToInsert));
    }

    @Test
    public void test2() {
        // given
        SimpleStringGroup group = new SimpleStringGroup();
        String valueToInsert = "second test";

        // when
        group.insert(valueToInsert);
        group.delete(valueToInsert);

        // then
        Assert.assertFalse(group.has(valueToInsert));
    }

    @Test
    public void test3() {
        // given
        SimpleStringGroup group = new SimpleStringGroup();
        String valueToInsert = "third test";

        // when
        group.insert(valueToInsert);
        group.delete(valueToInsert);

        // then
        Assert.assertFalse(group.has(valueToInsert));
    }
}
