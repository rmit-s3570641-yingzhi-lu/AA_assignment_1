import apple.laf.JRSUIUtils;

import java.io.PrintStream;
import java.util.*;

public class BstMultiset<T extends Comparable> extends Multiset<T>
{

    /**
     * Reference to root of bst.
     */
    protected TreeNode root;

    protected TreeNode lChild;
    protected TreeNode rChild;

    /**
     * Length of Bst.
     */
    protected int mLength;

	public BstMultiset() {

        root=null;
		mLength=0;

	} // end of BstMultiset()

	public TreeNode isExisted(T item) {

		TreeNode currNode = root;

		for (int i = 0; i < mLength; i++) {
			if (currNode.getValue().equals(item)) {
				return currNode;
			}
			currNode = currNode.getNext();
		}
		return null;

	}

	public void add(T item) {
		// Implement me!
	} // end of add()


	public int search(T item) {

        TreeNode currRoot=root;
        if(currRoot==null) return 0;

        int cmp = item.compareTo(currRoot.getValue());
        if(cmp>0){
            return search()
        }

		return 0;
	} // end of add()


	public void removeOne(T item) {
		// Implement me!
	} // end of removeOne()
	
	
	public void removeAll(T item) {
		// Implement me!
	} // end of removeAll()


	public void print(PrintStream out) {

        Node currNode = mTail;

        while (currNode != null) {

            out.println(currNode.getValue() + printDelim + currNode.getNumber());

            currNode = currNode.getPrev();

        }
	} // end of print()

    //pre order traverse

    public void preOrderTraverseWithNumber(TreeNode root) {

        if(root ==null) return;
        System.out.println(root.getValue() + printDelim + root.getNumber());
        preOrderTraverseWithNumber(root.getLeft());
        preOrderTraverseWithNumber(root.getRight());

    }

    /**
     * Node type, inner private class.
     */
    private class TreeNode {
        /**
         * Stored value of node.
         */
        private T mValue;
        /**
         * Reference to next node.
         */
        private TreeNode mLeft;
        /**
         * Reference to previous node.
         */

        private TreeNode mRight;

        private int number;

        public TreeNode(T value) {
            mValue = value;
            mLeft = null;
            mRight = null;
            number = 1;
        }

        public T getValue() {
            return mValue;
        }

        public TreeNode getLeft() {
            return mLeft;
        }

        public TreeNode getRight() {
            return mRight;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber() {
            number++;
        }

        public void setValue(T value) {
            mValue = value;
        }

        public void setLeft(TreeNode left) {
            mLeft = left;
        }

        public void setPrev(TreeNode right) {
            mRight = right;
        }
    } // end of inner class Node



} // end of class BstMultiset
