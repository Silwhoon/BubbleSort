package com.sparta.sort.binary;

public class NodeTree {
    private final Node root;

    public NodeTree(int[] inputArray) {
        this.root = new Node(inputArray[0]);

        // Iterate over the remaining numbers in the array and place in tree
        for (int i = 1; i < inputArray.length; i++) {
            Node nextElement = new Node(inputArray[i]);
            this.addNode(nextElement);
        }
    }

    public Node getRoot() {
        return root;
    }

    public void addNode(Node nodeToPlace) {
        addNode(root, nodeToPlace);
    }

    public void addNode(Node currentNode, Node nodeToPlace) {
        if (nodeToPlace.getValue() < currentNode.getValue()) {
            if (currentNode.getLeft() != null) {
                // recursively call this method with the new "currentNode"
                addNode(currentNode.getLeft(), nodeToPlace);
            } else {
                // Left node is null, place the node here
                currentNode.setLeft(nodeToPlace);
            }
        } else {
            if (currentNode.getRight() != null) {
                // recursively call this method with the new "currentNode"
                addNode(currentNode.getRight(), nodeToPlace);
            } else {
                // Right node is null, place the node here
                currentNode.setRight(nodeToPlace);
            }
        }
    }
}
