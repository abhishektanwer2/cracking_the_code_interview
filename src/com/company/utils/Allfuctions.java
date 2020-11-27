package com.company.utils;

public final class Allfuctions {
    public static void printLinkedList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(" Node:"+temp.data);
            temp=temp.next;
        }
    }
}
