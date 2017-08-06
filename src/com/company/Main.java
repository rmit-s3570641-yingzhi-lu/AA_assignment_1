package com.company;

public class Main {



    public static void main(String[] args) {
	// write your code here
    }

    public void initializeMultiSet(){
        System.out.println("Initialize a multiSet with duplicate elements");
    }

    public void printOperation(){
        System.out.println("here is the printout operation without ordering");
        System.out.println("output format: <element> | <number of instances in the multiset>");
    }

    public void searchElement(){

        System.out.println("search an element from multiset and print out the number");
        System.out.println("input format: S <element>");
        System.out.println("output format: <element> <number of instances in the multiset>");
    }

    public void addAnElement(){

        System.out.println("add element into the multiset");
        System.out.println("input format: A <element>");
    }

    public void deleteAllInstance(){

        System.out.println("delete all instances of element from the multiset");
        System.out.println("input format: RA <element>");
    }

    public void deleteOneInstance(){

        System.out.println("delete one instances of element from the multiset");
        System.out.println("input format: RO <element>");
    }

}
