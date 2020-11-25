package com.company;

import com.company.utils.Node;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.HashSet;

public class RemovedupsLinkedlist {
public static void main(String []args){
Node head=new Node(0);
head.next=new Node(1);
head.next.next=new Node(1);
head.next.next.next=new Node(3);
    head.next.next.next.next=new Node(1);

    Instant start= Instant.now();

    removeDuplicatesother(head);
    Instant end= Instant.now();

    Duration difference = Duration.between(start,end);
    System.out.println(difference.toNanos());




Node t1=head;
while(t1!=null){
    System.out.println(t1.data);
    t1=t1.next;
}

}

    private static void removeDuplicates(Node temp) {
        Node pre=null;
        HashSet<Integer>set =new HashSet<>();
      int i=0;

        while(temp!=null){
            if(set.contains( temp.data)){
                pre.next=temp.next;
            }else{
                set.add(temp.data);
                pre=temp;
            }
            temp=temp.next;
        }

    }
    private static void removeDuplicatesother(Node head){
    Node current=head;
    while(current!=null){
        Node p2=current;
        while(p2.next!=null){
            if(p2.next.data==current.data){
                p2.next=p2.next.next;
            }
            else{
                p2=p2.next;

            }

        }
        current=current.next;
    }

    }

}
