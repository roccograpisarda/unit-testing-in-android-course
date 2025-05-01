package com.techyourchance.unittestingfundamentals.exercise2;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringDuplicatorTest {

    StringDuplicator SUT;


    @Before
    public void setup(){
        SUT = new StringDuplicator();
    }

    @Test
    public void test1(){
       String result =  SUT.duplicate("");
        Assert.assertThat(result, is(""));
    }

    @Test
    public void test2(){
        String result =  SUT.duplicate("a");
        Assert.assertThat(result, is("aa"));
    }

    @Test
    public void test3(){
        String result =  SUT.duplicate("aa");
        Assert.assertThat(result, is("aaaa"));
    }

}