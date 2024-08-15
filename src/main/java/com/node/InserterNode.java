package com.node;

import java.util.List;

public class InserterNode implements DirectedNode {
    @Override
    public List<DirectedNode> getDependentNodes() {
        return List.of(new GearNode(), new CircuitNode());
    }
}
