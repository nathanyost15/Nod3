package com.node;

import java.util.List;

public class CircuitNode implements DirectedNode{
    @Override
    public List<DirectedNode> getDependentNodes() {
        return List.of(new WireNode());
    }
}
