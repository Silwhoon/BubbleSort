package com.sparta.sorters;

import com.sparta.sorters.binarytree.Node;
import com.sparta.sorters.binarytree.NodeTree;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class BinarySorter implements Sorter {

    private static final Logger logger = LogManager.getLogger(BinarySorter.class.getName());

    @Override
    public String toString() {
        return "BinarySorter";
    }

    @Override
    public int[] sortArray(int[] inputArray) {
        logger.info("Started sorting..");
        // First check if the array length is 1 or less
        if (inputArray.length <= 1) {
            return inputArray;
        }

        NodeTree tree = new NodeTree(inputArray);

        // Once nodes have been placed within tree
        int[] ret = inorderArray(tree);
        logger.info("Finished sorting!");
        return ret;
    }

    private int[] inorderArray(NodeTree tree) {
        ArrayList<Integer> ret = new ArrayList<>();
        inorderNode(tree.getRoot(), ret);

        return ret.stream().mapToInt(Integer::intValue).toArray();
    }

    private void inorderNode(Node node, ArrayList<Integer> list) {
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
