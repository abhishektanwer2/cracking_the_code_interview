package com.company;

import com.company.utils.Node;

import java.time.Duration;
import java.time.Instant;

public class LinkedlistKthtolast {
    public static void main(String []args){
        Node head=new Node(0);
        head.next=new Node(1);
        head.next.next=new Node(2);
        head.next.next.next=new Node(3);
        head.next.next.next.next=new Node(4);

        Instant start= Instant.now();
        int k=2;
     System.out.println(kthelementfromlastrecursive(head,k));
        Instant end= Instant.now();

        Duration difference = Duration.between(start,end);
        System.out.println(difference.toNanos());






    }

    private static int kthelementfromlast(Node head, int k) {
        int countelement=0,element=0;
        Node p1 =head;
        Node p2=head;
        if(head==null)return 0;
        while(p1!=null){
            if(k>countelement){
                countelement++;

            }
            else{

                p2=p2.next;

            }
            p1=p1.next;


        }
        element=p2.data;




        return element;

    }
    private static int kthelementfromlastrecursive(Node head, int k) {
        if(head==null)return 0;
        int count=kthelementfromlastrecursive(head.next,k)+1;
        if(count==k){
            System.out.println(head.data);
        }

        return count;

    }
}
