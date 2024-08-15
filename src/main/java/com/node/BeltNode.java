package com.node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BeltNode implements DirectedNode {
    @Override
    public List<DirectedNode> getDependentNodes() {
        return List.of(new GearNode());
    }
}
