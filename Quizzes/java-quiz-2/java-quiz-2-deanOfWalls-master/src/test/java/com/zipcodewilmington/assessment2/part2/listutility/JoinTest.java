package com.zipcodewilmington.assessment2.part2.listutility;

import com.zipcodewilmington.assessment2.part2.ListUtility;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class JoinTest {
    private ListUtility utility = new ListUtility();


    @Test
    public void testJoin_withOneElement(){
        utility.add(812);
        String expected = "812";

        String actual = utility.join();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testJoin_withMultipleElement(){
        utility.add(8);
        utility.add(7);
        utility.add(9);
        utility.add(71);
        String expected = "8, 7, 9, 71";

        String actual = utility.join();

        Assert.assertEquals(expected, actual);
    }



}
