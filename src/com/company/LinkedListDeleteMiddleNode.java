package com.company;

import com.company.utils.Node;

import java.time.Duration;
import java.time.Instant;

public class LinkedListDeleteMiddleNode {
    public static void main(String []args){
        Node head=new Node(0);
        head.next=new Node(1);
        head.next.next=new Node(2);
        head.next.next.next=new Node(3);
        head.next.next.next.next=new Node(4);

        Instant start= Instant.now();
        int k=2;
       deleteMiddleNode(head);
        Instant end= Instant.now();

        Duration difference = Duration.between(start,end);
        System.out.println(difference.toNanos());






    }

    private static Node deleteMiddleNode(Node head) {



        return head;
    }
}
