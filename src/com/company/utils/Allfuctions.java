package com.company.utils;

public final class Allfuctions {
    public  static void printLinkedList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(" Node:"+temp.data);
            temp=temp.next;
        }
    }
    public  static Node reverseLinkedList(Node head){
        Node temp=null;
        Node p1=head;
        while(p1!=null){
            Node reversenode=new Node(p1.data);
            reversenode.next=temp;
            temp=reversenode;
            p1=p1.next;
        }


        return temp;
    }
    public  static boolean compareLinkedList(Node list1,Node list2){
        while(list1!=null||list2!=null){
           try{if(list1.data!=list2.data){
               return false;

           }
           else{
               list1=list1.next;
               list2=list2.next;

           }}catch(NullPointerException e){
               return  false;
           }

        }
        return true;



    }
    public static final int getLinkedListSize(Node list1){
        int size=0;
        while(list1!=null){
            size++;
            list1=list1.next;
        }
        return size;
    }
}
