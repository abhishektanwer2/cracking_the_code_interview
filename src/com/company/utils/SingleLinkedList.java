package com.company.utils;

public class SingleLinkedList<T> {
    static class Node <T>{
        T val;
        Node next;

        Node(T v) {
            val = v;
            next = null;
        }
    }



    public Node head;
   public int size;


    public SingleLinkedList() {
        size = 0;
        head = new Node(0);
    }

    public Object get(int index) {
        if (index < 0 || index >= size) return null;

        Node curr = head;
        for (int i = 0; i < index + 1; ++i) curr = curr.next;
        return curr.val;
    }

    public void addAtHead(T val) {
        addAtIndex(0, val);
    }

    public void addAtTail(T val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, T val) {

        if (index > size) return;
        if (index < 0) index = 0;
        ++size;
        Node pred = head;
        for (int i = 0; i < index; ++i) pred = pred.next;
        Node toAdd = new Node(val);
        toAdd.next = pred.next;
        pred.next = toAdd;
    }

    public void deleteAtIndex(int index) {

        if (index < 0 || index >= size) return;
        size--;
        Node pred = head;
        for (int i = 0; i < index; ++i) pred = pred.next;
        pred.next = pred.next.next;
    }

    @Override
    public String toString() {
        String s="";
        for(int i=0;i<size;i++){
            s+=get(i)+" ";
        }
        return "SingleLinkedList{" +
                "head=" + s +
                ", size=" + size +
                '}';
    }
}
