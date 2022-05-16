package com.sparta.sort.binary;

import java.util.ArrayList;

public class BinarySorter {

    public static int[] sortArray(int[] inputArray, TraversalMethod method) {
        // First check if the array length is 1 or less
        if (inputArray.length <= 1) {
            return inputArray;
        }

        // input array: 45, 10, 7, 90, 12, 50, 13, 39, 57
        NodeTree tree = new NodeTree(inputArray);

        // Once nodes have been placed within tree, sort them via the stated method and return a new array
        return switch (method) {
            case INORDER -> inorderArray(tree);
            case PREORDER -> null; //TODO: preorderArray(tree);
            case POSTORDER -> null; //TODO: postorderArray(tree);
        };
    }

    private static int[] inorderArray(NodeTree tree) {
        ArrayList<Integer> ret = new ArrayList<>();
        inorderNode(tree.getRoot(), ret);

        return ret.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void inorderNode(Node node, ArrayList<Integer> list) {
        if (node == null) {
            return;
        }

        // Call this method recursively if the currently checked node has a left value
        if (node.getLeft() != null) {
            inorderNode(node.getLeft(), list);
        }

        // After adding all the left values, add the root value
        list.add(node.getValue());

        // After adding all values except the ones on the right, call this method recursively if the currently checked
        // node has a right value
        if (node.getRight() != null) {
            inorderNode(node.getRight(), list);
        }
    }
}
