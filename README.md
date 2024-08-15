# Nod3
 

Writing up a library to help with working with node tree structures of data. Currently I am working on building out a tree of nodes but some of those nodes depend on another one being built first. So I began looking into Topological Sorting (Depth first). This will give a list of nodes that need to be built in the order they need to be built.
So I was playing a game called **Factorio**, and realized its doing exactly this... I wanted to build a Solar panel and when you click to build that solar panel it will layout how its going to build all of it's dependencies in a particular order. The order is shown in below image, we really only care about what nodes need to be built as the base cases (Iron/Copper plates) are the rudimentary ingredients.
 ![What is this](FactorioExample.png)

<h1>TopologicalSorter</h1>
This sort will take in an intial DirectedNode, and then recursively find the leaves and build upward towards the root (or beginning node that you initially inputted).
Along the way we reverse the ordering before adding the nodes to the main list, as well as the final step when we add all the nodes to the initial root node. This will essentially give us an upside down tree of original starting from each of the leaf nodes.

This current implementation has a slight nuance in that if two seperate nodes, lets say A and B, require the same dependencies it can be duplicated within the final list returned. In the example image above if we try to build SolarPanels it will return GearNode twice, because its required by BeltNode AND InserterNode.
