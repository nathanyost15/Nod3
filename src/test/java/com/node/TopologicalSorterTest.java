package com.node;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class TopologicalSorterTest {
    private TopologicalSorter topologicalSorter;

    @Before
    public void setup() {
        topologicalSorter = new TopologicalSorter();
    }

    @Test
    public void shouldReturnBeltDependency() {
        LinkedList<DirectedNode> objectStack = topologicalSorter.sort(new BeltNode());
        Assert.assertNotNull(objectStack);
        Assert.assertEquals(2, objectStack.size());
        Assert.assertTrue(objectStack.pop() instanceof GearNode);
        Assert.assertTrue(objectStack.pop() instanceof BeltNode);
    }

    @Test
    public void shouldReturnInserterDependencies() {
        LinkedList<DirectedNode> objectStack = topologicalSorter.sort(new InserterNode());
        Assert.assertNotNull(objectStack);
        Assert.assertEquals(4, objectStack.size());
        Assert.assertTrue(objectStack.pop() instanceof WireNode);
        Assert.assertTrue(objectStack.pop() instanceof CircuitNode);
        Assert.assertTrue(objectStack.pop() instanceof GearNode);
        Assert.assertTrue(objectStack.pop() instanceof InserterNode);
    }

    @Test
    public void shouldReturnSolarPanelDependencies() {
        LinkedList<DirectedNode> objectStack = topologicalSorter.sort(new SolarPanelNode());
        Assert.assertNotNull(objectStack);
        Assert.assertEquals(7, objectStack.size());
        Assert.assertTrue(objectStack.pop() instanceof WireNode);
        Assert.assertTrue(objectStack.pop() instanceof CircuitNode);
        Assert.assertTrue(objectStack.pop() instanceof GearNode);
        Assert.assertTrue(objectStack.pop() instanceof InserterNode);
        Assert.assertTrue(objectStack.pop() instanceof GearNode);
        Assert.assertTrue(objectStack.pop() instanceof BeltNode);
        Assert.assertTrue(objectStack.pop() instanceof SolarPanelNode);
    }
}
