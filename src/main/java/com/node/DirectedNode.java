package com.node;

import java.util.List;

public interface DirectedNode {
    List<DirectedNode> getDependentNodes();

    default String getNodeName() {
        return this.getClass().getSimpleName();
    }
}
