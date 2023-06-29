package rocks.zipcode.quiz4.collections.food;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz4.collections.culonary.Food;
import rocks.zipcode.quiz4.collections.culonary.Curry;
import rocks.zipcode.quiz4.collections.culonary.Ginger;
import rocks.zipcode.quiz4.collections.culonary.Pepper;
import rocks.zipcode.quiz4.collections.culonary.Spice;

import java.util.Arrays;
import java.util.List;

public class GetAllSpicesTest {

    private void test(List<Spice> expected) {
        // given there is some food
        Food food = new Food();

        // given each spice is applied to food
        expected.forEach(food::applySpice);

        // when spice on food is evaluated
        List<Spice> actual = food.getAllSpices();

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test1() {
        // given
        test(Arrays.asList((Spice) new Curry()));
    }

    @Test
    public void test2() {
        // given
        test(Arrays.asList((Spice) new Ginger()));
    }

    @Test
    public void test3() {
        // given
        test(Arrays.asList((Spice) new Pepper()));
    }

    @Test
    public void test4() {
        // given
        test(Arrays.asList(
                (Spice) new Pepper(),
                (Spice) new Ginger(),
                (Spice) new Curry()));
    }

    @Test
    public void test5() {
        // given
        test(Arrays.asList(
                (Spice) new Pepper(),
                (Spice) new Pepper(),
                (Spice) new Ginger(),
                (Spice) new Curry()));
    }


    @Test
    public void test6() {
        // given
        test(Arrays.asList(
                (Spice) new Pepper(),
                (Spice) new Pepper(),
                (Spice) new Ginger(),
                (Spice) new Ginger(),
                (Spice) new Curry()));
    }

}
