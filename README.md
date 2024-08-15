# Nod3
 

Writing up a library to help with working with node tree structures of data. Currently I am working on building out a tree of nodes but some of those nodes depend on another one being built first. So I began looking into Topological Sorting (Depth first). This will give a list of nodes that need to be built in the order they need to be built.
So I was playing a game called Factorio, and realized its doing exactly this... I wanted to build a Solar panel and when you click to build that solar panel it will layout how its going to build all of it's dependencies in a particular order. The order is shown in below image, we really only care about what nodes need to be built as the base cases (Iron/Copper plates) are the rudimentary ingredients.
 ![What is this](FactorioExample.png)
