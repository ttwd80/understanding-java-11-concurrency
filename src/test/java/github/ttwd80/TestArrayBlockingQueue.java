package github.ttwd80;

import java.util.concurrent.ArrayBlockingQueue;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestArrayBlockingQueue {

    @Test
    public void testArrayBlockingQueueAddOkay() {
        final var sut = new ArrayBlockingQueue<String>(5);
        Assert.assertTrue(sut.add("A"));
        Assert.assertTrue(sut.add("B"));
        Assert.assertTrue(sut.add("C"));
        Assert.assertTrue(sut.add("D"));
        Assert.assertTrue(sut.add("E"));
    }

    @Test
    public void testArrayBlockingQueueAddException() {
        final var sut = new ArrayBlockingQueue<String>(2);
        sut.add("A");
        sut.add("B");
        try {
            sut.add("C");
            Assert.fail("should have thrown an exception");
        } catch (IllegalStateException e) {
        }
    }

}