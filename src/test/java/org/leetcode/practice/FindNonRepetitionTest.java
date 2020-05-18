package org.leetcode.practice;


import org.junit.Assert;
import org.junit.Test;

public class FindNonRepetitionTest {

    @Test
    public void findNonRepeat_BaseRight() {
        int output = new FindNonRepetition().findNonRepeat(new int[]{1,1,2});
        Assert.assertEquals(2,output);
    }

    @Test
    public void findNonRepeat_BaseLeft() {
        int output = new FindNonRepetition().findNonRepeat(new int[]{1,2,2});
        Assert.assertEquals(1,output);
    }

    @Test
    public void findNonRepeat_ManyExtremeLeft() {
        int output = new FindNonRepetition().findNonRepeat(new int[]{1,2,2,3,3,4,4,5,5});
        Assert.assertEquals(1,output);
    }


    @Test
    public void findNonRepeat_ManyExtremeRight() {
        int output = new FindNonRepetition().findNonRepeat(new int[]{1,1,2,2,3,3,4,4,5});
        Assert.assertEquals(5,output);
    }

    @Test
    public void findNonRepeat_ManyLeft() {
        int output = new FindNonRepetition().findNonRepeat(new int[]{1,1,2,3,3,4,4,5,5});
        Assert.assertEquals(2,output);
    }

    @Test
    public void findNonRepeat_ManyRight() {
        int output = new FindNonRepetition().findNonRepeat(new int[]{1,1,2,2,3,3,4,5,5});
        Assert.assertEquals(4,output);
    }

}
