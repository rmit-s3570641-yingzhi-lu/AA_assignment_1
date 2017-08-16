import sun.nio.cs.ext.MacHebrew;

import java.io.PrintStream;
import java.util.*;

public class LinkedListMultiset<T> extends Multiset<T> {

    //python assign1TestScript.py -v   Assign1-s1234    hash     tests/test1.in    tests/test2.in

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


    public LinkedListMultiset() {

        mHead = null;
        mTail = null;
        mLength = 0;

    } // end of LinkedListMultiset()


    public void add(T item) {

        Node newNode = new Node(item);

        Node existedNode = isExisted(item);

        // If head is empty, then list is empty and head and tail references need to be initialised.
        if (mHead == null) {
            mHead = newNode;
            mTail = newNode;
            mLength++;
        }
        // otherwise, add node to the head of list.
        else {

            if (existedNode == null) {
                newNode.setNext(mHead);
                mHead.setPrev(newNode);
                mHead = newNode;
                mLength++;

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

        if (existedNode != null) {
            if (existedNode.getNumber() > 1) {
                existedNode.number--;
            }else{

                if(existedNode==mHead){
                    mHead=existedNode.getNext();
                    mHead.setPrev(null);

                    existedNode=null;
                }else{
                    Node preNode= existedNode.getPrev();
                    preNode.setNext(existedNode.getNext());

                    if (existedNode.getNext() != null) {
                        existedNode.getNext().setPrev(preNode);
                    } else {
                        mTail = preNode;
                    }

                    existedNode=null;
                }

                mLength--;
            }
        }

    } // end of removeOne()


    public void removeAll(T item) {

        Node existedNode = isExisted(item);

        if (existedNode != null) {

                if(existedNode==mHead){
                    mHead=existedNode.getNext();
                    mHead.setPrev(null);
                    existedNode=null;

                }else{

                    Node preNode= existedNode.getPrev();
                    preNode.setNext(existedNode.getNext());

                    if (existedNode.getNext() != null) {
                        existedNode.getNext().setPrev(preNode);
                    } else {
                        mTail = preNode;
                    }

                    existedNode=null;
                }

                mLength--;
            }

    } // end of removeAll()


    public void print(PrintStream out) {
        Node currNode = mTail;

        while (currNode != null) {

            out.println(currNode.getValue() + printDelim + currNode.getNumber());

            currNode = currNode.getPrev();

        }

    } // end of print()


    public void printAllwithNumber() {

        Node currNode = mTail;

        while (currNode != null) {

            System.out.println(currNode.getValue() + printDelim + currNode.getNumber());

            currNode = currNode.getPrev();

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
            number = 1;
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


} // end of class LinkedListMultiset
