package com.company.utils;

public class Test {
    public static void main(String[] args) {

        SingleLinkedList list = new SingleLinkedList();

       list.addAtTail(1);
       list.addAtTail( 2);
       list.addAtTail( 3);
         list.addAtTail(4);
         list.addAtTail(5);
         list.addAtTail(6);
       list.addAtTail( 7);
         list.addAtTail( 8);
         System.out.println(list.toString());
    }
}
