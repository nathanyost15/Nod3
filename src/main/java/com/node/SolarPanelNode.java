package com.node;

import java.util.List;

public class SolarPanelNode implements DirectedNode {
    @Override
    public List<DirectedNode> getDependentNodes() {
        return List.of(new BeltNode(), new InserterNode());
    }
}
