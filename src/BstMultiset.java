import java.io.PrintStream;
import java.util.*;

public class BstMultiset<T extends Comparable> extends Multiset<T> {

    /**
     * Reference to root of bst.
     */
    protected TreeNode mRoot;

    /**
     * Length of Bst.
     */
    protected int mLength;

    public BstMultiset() {

        mRoot = null;
        mLength = 0;

    } // end of BstMultiset()

    public TreeNode isExisted(TreeNode node, T item) {

        if (node == null) {
            return node;
        }

        if (node.getValue().compareTo(item) == 0) {
            return node;
        } else if (node.getValue().compareTo(item) > 0) {
            return isExisted(node.getLeft(), item);
        } else {
            return isExisted(node.getRight(), item);
        }

    }

    public void add(T item) {
        TreeNode newNode = new TreeNode(item);
        add(this, newNode);
    } // end of add()

    public void add(BstMultiset<T> bstMultiset, TreeNode newNode) {
        TreeNode currNode = bstMultiset.mRoot;
        // if the root is null ,add root
        if (currNode == null) {
            bstMultiset.mRoot = newNode;
            mLength++;
        }

        //if the root is not null
        while (currNode != null) {
            if (currNode.getValue().compareTo(newNode.getValue()) > 0) { // add to left child

                if (currNode.getLeft() == null) {
                    currNode.setLeft(newNode);
                    newNode.setParent(currNode);
                    mLength++;
                    break;
                } else {
                    currNode = currNode.getLeft();
                }

            } else if (currNode.getValue().compareTo(newNode.getValue()) < 0) {//add to right child

                if (currNode.getRight() == null) {
                    currNode.setRight(newNode);
                    newNode.setParent(currNode);
                    mLength++;
                    break;
                } else {
                    currNode = currNode.getRight();
                }
            } else {

                currNode.setNumber();
                break;
            }
        }

    }


    public int search(T item) {
        TreeNode node = isExisted(mRoot, item);
        if (node == null) {
            return 0;
        } else {
            return node.getNumber();
        }
    } // end of add()


    public void removeOne(T item) {
        if(mLength==1){
            mRoot=null;
            return;

        }else {
            TreeNode node = isExisted(mRoot, item);
            if (search(item) > 1) {
                node.number--;
            } else {
                removeAll(item);
            }
        }
    } // end of removeOne()


    public void removeAll(T item) {
        if (mLength == 1) {
            mRoot = null;
            return;

        } else {

            TreeNode node = isExisted(mRoot, item);
            if (node == null) {
                return;
            } else {
                remove(node);
            }
        }

    } // end of removeAll()

    public void remove(TreeNode node) {
        if (node == null) {
            return;
        }

        if (node == mRoot) {

            TreeNode predecessorNode = predecessor(node);
            remove(predecessorNode);
            node.setValue(predecessorNode.getValue());
            node.number = predecessorNode.getNumber();
            mLength--;

        } else {

            //the deleted node do not have any child
            if (node.getLeft() == null && node.getRight() == null) {
                if (node.getParent().getLeft() == node) {

                    node.getParent().setLeft(null);
                } else {
                    node.getParent().setRight(null);
                }
                mLength--;
                return;
            }

            //if the left child of deleted node is null and right child is not null
            if (node.getLeft() == null && node.getRight() != null) {
                if (node.getParent().getLeft() == node) {

                    node.getParent().setLeft(node.getRight());
                    node.getRight().setParent(node.getParent());

                } else {
                    node.getParent().setRight(node.getRight());
                    node.getRight().setParent(node.getParent());
                }
                mLength--;
                return;
            }

            //if the right child of deleted node is null and left child is not null
            if (node.getLeft() != null && node.getRight() == null) {
                if (node.getParent().getLeft() == node) {

                    node.getParent().setLeft(node.getLeft());
                    node.getLeft().setParent(node.getParent());

                } else {
                    node.getParent().setRight(node.getLeft());
                    node.getLeft().setParent(node.getParent());
                }
                mLength--;
                return;
            }

            //if the deleted node has both left and right child, find their successor node
            TreeNode successorNode = successor(node);
            remove(successorNode);
            node.setValue(successorNode.getValue());
            mLength--;
        }

    }

    // find out the predecessor which is the largest in left tree
    public TreeNode predecessor(TreeNode node) {
        if (node.getLeft() != null) {
            TreeNode temp = node.getLeft();
            while (temp.getRight() != null) {
                temp = temp.getRight();
            }
            return temp;
        }

        TreeNode parent = node.getParent();
        while ((parent != null) && (node == parent.getLeft())) {
            node = parent;
            parent = parent.getParent();
        }

        return parent;
    }

    //find out the successor , used in the delete function
    private TreeNode successor(TreeNode node) {

        if (node.getRight() != null) {
            TreeNode temp = node.getRight();
            while (temp.getLeft() != null) {
                temp = temp.getLeft();
            }
            return temp;
        }

        TreeNode parent = node.getParent();
        while ((parent != null) && (node == parent.getRight())) {
            node = parent;
            parent = parent.getParent();
        }

        return parent;

    }


    public void print(PrintStream out) {

        Stack<TreeNode> treeNodeStack = new Stack<TreeNode>();
        TreeNode node = mRoot;

        while (node != null || !treeNodeStack.isEmpty()) {
            while (node != null) {
                out.println(node.getValue() + printDelim + node.getNumber());
                treeNodeStack.push(node);
                node = node.getLeft();
            }
            if (!treeNodeStack.isEmpty()) {
                node = treeNodeStack.pop();
                node = node.getRight();
            }
        }

    } // end of print()

    //pre order traverse

    public void print() {

        Stack<TreeNode> treeNodeStack = new Stack<TreeNode>();
        TreeNode node = mRoot;

        while (node != null || !treeNodeStack.isEmpty()) {
            while (node != null) {
                System.out.println(node.getValue() + printDelim + node.getNumber());
                treeNodeStack.push(node);
                node = node.getLeft();
            }
            if (!treeNodeStack.isEmpty()) {
                node = treeNodeStack.pop();
                node = node.getRight();
            }
        }

    } // end of print()

    /**
     * Node type, inner private class.
     */
    private class TreeNode {
        /**
         * Stored value of node.
         */
        private T mValue;
        /**
         * Reference to left child node.
         */
        private TreeNode mLeft;
        /**
         * Reference to right child node.
         */
        private TreeNode mRight;
        /**
         * Reference to parent node
         */
        private TreeNode mParent;

        private int number;

        public TreeNode(T value) {
            mValue = value;
            mLeft = null;
            mRight = null;
            mParent = null;
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

        public TreeNode getParent() {
            return mParent;
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

        public void setRight(TreeNode right) {
            mRight = right;
        }

        public void setParent(TreeNode parent) {
            mParent = parent;
        }
    } // end of inner class Node


} // end of class BstMultiset
