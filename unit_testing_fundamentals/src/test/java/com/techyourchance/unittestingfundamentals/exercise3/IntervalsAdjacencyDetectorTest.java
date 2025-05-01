package com.techyourchance.unittestingfundamentals.exercise3;

import static org.hamcrest.CoreMatchers.is;

import com.techyourchance.unittestingfundamentals.example3.Interval;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntervalsAdjacencyDetectorTest {

    IntervalsAdjacencyDetector SUT;

    @Before
    public void setup(){
        SUT = new IntervalsAdjacencyDetector();
    }

    @Test
    public void test1(){
        boolean result = SUT.isAdjacent(new Interval(0, 1), new Interval(1,2));
        Assert.assertThat(result, is(true));
    }

    @Test
    public void test2(){
        boolean result = SUT.isAdjacent(new Interval(0, 1), new Interval(0,1));
        Assert.assertThat(result, is(false));
    }

    @Test
    public void test3(){
        boolean result = SUT.isAdjacent(new Interval(0, 1), new Interval(0,2));
        Assert.assertThat(result, is(false));
    }

    @Test
    public void test4(){
        boolean result = SUT.isAdjacent(new Interval(0, 1), new Interval(3,4));
        Assert.assertThat(result, is(false));
    }

}