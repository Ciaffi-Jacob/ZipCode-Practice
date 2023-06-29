package rocks.zipcode.io.quiz4.collections.student;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.collections.Student;

/**
 * @author leon on 11/12/2018.
 */
public class LearnTest {
    @Test
    public void test1() {
        Student student = new Student();
        Double expected = 15.0;

        // when
        student.learn(expected);
        Double actual = student.getTotalStudyTime();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        Student student = new Student();
        Double expected = 30.0;

        // when
        student.learn(expected);
        Double actual = student.getTotalStudyTime();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        Student student = new Student();
        Double firstLecture = 15.0;
        Double secondLecture = 25.0;
        Double expected = firstLecture + secondLecture;

        // when
        student.learn(firstLecture);
        student.learn(secondLecture);
        Double actual = student.getTotalStudyTime();

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test4() {
        Student student = new Student();
        Double firstLecture = 35.0;
        Double secondLecture = 25.0;
        Double expected = firstLecture + secondLecture;

        // when
        student.learn(firstLecture);
        student.learn(secondLecture);
        Double actual = student.getTotalStudyTime();

        // then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void test5() {
        Student student = new Student();
        Double firstLecture = 98.0;
        Double secondLecture = 72.0;
        Double expected = firstLecture + secondLecture;

        // when
        student.learn(firstLecture);
        student.learn(secondLecture);
        Double actual = student.getTotalStudyTime();

        // then
        Assert.assertEquals(expected, actual);
    }

}
