import java.io.PrintStream;
import java.util.*;

public class SortedLinkedListMultiset<T extends Comparable> extends Multiset<T> {

    /**
     * Reference to head of list.
     */
    protected Node mHead;
    /**
     * Reference to tail of list.
     */
    protected Node mTail;

    /**
     * Length of list.
     */
    protected int mLength;


    public SortedLinkedListMultiset() {

        mHead = null;
        mTail = null;
        mLength = 0;
    } // end of SortedLinkedListMultiset()


    public void add(T item) {

        Node newNode = new Node(item);
        Node existedNode = isExisted(item);

        //head is null -> new node is new List
        if (mHead == null) {
            mHead = newNode;
            mTail = newNode;
            mLength++;
            mHead.setNumber();
        } else {

            if (existedNode == null) {

                //handle special case if value<mhead.value
                if (newNode.getValue().compareTo(mHead.getValue()) < 0) {
                    newNode.setNext(mHead);
                    mHead.setPrev(newNode);
                    mHead = newNode;
                    newNode.setNumber();
                    mLength++;

                } else {

                    //search position in list
                    Node prevNode = mHead;
                    for (; prevNode.getNext() != null; prevNode = prevNode.getNext()) {
                        if (prevNode.getNext().getValue().compareTo(newNode.getValue()) > 0)
                            break;
                    }

                    //insert behind previous node
                    newNode.setNext(prevNode.getNext());
                    if (prevNode.getNext() != null) {
                        prevNode.getNext().setPrev(newNode);
                    }

                    prevNode.setNext(newNode);
                    newNode.setPrev(prevNode);

                    newNode.setNumber();
                    mLength++;

                }
            } else {
                existedNode.setNumber();

            }
        }

    } // end of add()

    public Node isExisted(T item) {

        Node currNode = mHead;

        for (int i = 0; i < mLength; i++) {
            if (currNode.getValue().equals(item)) {
                return currNode;
            }
            currNode = currNode.getNext();
        }
        return null;
    }


    public int search(T item) {

        Node currNode = mHead;

        for (int i = 0; i < mLength; i++) {
            if (currNode.getValue().equals(item)) {
                return currNode.getNumber();
            }
            currNode = currNode.getNext();
        }

        return 0;

    } // end of add()


    public void removeOne(T item) {

        Node existedNode = isExisted(item);

        if (mLength == 1) {
            mHead = null;
            mTail = null;
            existedNode = null;
            return;

        } else {

            if (existedNode != null) {
                if (existedNode.getNumber() > 1) {
                    existedNode.number--;
                } else {

                    if (existedNode == mHead) {
                        mHead = existedNode.getNext();
                        mHead.setPrev(null);
                        existedNode = null;

                    } else {

                        Node preNode = existedNode.getPrev();
                        preNode.setNext(existedNode.getNext());

                        if (existedNode.getNext() != null) {
                            existedNode.getNext().setPrev(preNode);
                        } else {
                            mTail = preNode;
                        }

                        existedNode = null;
                    }

                    mLength--;
                }
            }
        }
    }// end of removeOne()


    public void removeAll(T item) {

        Node existedNode = isExisted(item);

        if (mLength == 1) {
            mHead = null;
            mTail = null;
            existedNode = null;
            return;

        } else {

            if (existedNode != null) {

                    if (existedNode == mHead) {
                        mHead = existedNode.getNext();
                        mHead.setPrev(null);
                        existedNode = null;

                    } else {

                        Node preNode = existedNode.getPrev();
                        preNode.setNext(existedNode.getNext());

                        if (existedNode.getNext() != null) {
                            existedNode.getNext().setPrev(preNode);
                        } else {
                            mTail = preNode;
                        }

                        existedNode = null;
                    }

                    mLength--;
            }
        }
    } // end of removeAll()


    public void print(PrintStream out) {

        Node currNode = mHead;

        while (currNode != null) {

            out.println(currNode.getValue() + printDelim + currNode.getNumber());

            currNode = currNode.getNext();

        }

    } // end of print()

    public void printAllwithNumber() {

        Node currNode = mHead;

        while (currNode != null) {

            System.out.println(currNode.getValue() + printDelim + currNode.getNumber());

            currNode = currNode.getNext();

        }
    }

    /**
     * Node type, inner private class.
     */
    private class Node {
        /**
         * Stored value of node.
         */
        private T mValue;
        /**
         * Reference to next node.
         */
        private Node mNext;
        /**
         * Reference to previous node.
         */
        private Node mPrev;

        private int number;

        public Node(T value) {
            mValue = value;
            mNext = null;
            mPrev = null;
        }

        public T getValue() {
            return mValue;
        }

        public Node getNext() {
            return mNext;
        }

        public Node getPrev() {
            return mPrev;
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

        public void setNext(Node next) {
            mNext = next;
        }

        public void setPrev(Node prev) {
            mPrev = prev;
        }
    } // end of inner class Node

} // end of class SortedLinkedListMultiset