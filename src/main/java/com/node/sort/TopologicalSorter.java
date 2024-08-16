package com.node.sort;

import com.node.models.DirectedNode;

import java.util.*;

public class TopologicalSorter {
    public LinkedList<DirectedNode> sort(DirectedNode directedNode) {
        LinkedList<DirectedNode> directedNodes = new LinkedList<>();
        directedNodes.push(directedNode);
        if(directedNode.getDependentNodes() != null) {
            for(DirectedNode node : directedNode.getDependentNodes()) {
                LinkedList<DirectedNode> sortedDependencyNodes = sort(node);
                Collections.reverse(sortedDependencyNodes);
                directedNodes.addAll(sortedDependencyNodes);
            }
        }
        Collections.reverse(directedNodes);
        return directedNodes;
    }

    public void pushAll(Stack<DirectedNode> nodeStack, List<DirectedNode> directedNodes) {
        for(DirectedNode node : directedNodes) {
            nodeStack.push(node);
        }
    }
}
