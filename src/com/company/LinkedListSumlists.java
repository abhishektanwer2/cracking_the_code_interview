package com.company;

import com.company.utils.Allfuctions;
import com.company.utils.Node;

import java.time.Duration;
import java.time.Instant;

public class LinkedListSumlists {
    public static void main(String []args){
        Node list1=new Node(7);
        list1.next=new Node(1);
        list1.next.next=new Node(6);
        Node list2=new Node(5);
        list2.next=new Node(9);
        list2.next.next=new Node(2);


        Instant start= Instant.now();
        Allfuctions.printLinkedList(sumLinkedlist(list1,list2,0));
        Instant end= Instant.now();

        Duration difference = Duration.between(start,end);
        System.out.println(difference.toNanos());



    }
    private static Node sumLinkedlist(Node list1, Node list2,int carry)
    {if(list1==null &&list2==null&&carry==0){
        return null;
    }
    Node result=new Node();
    int value=carry;
    if(list1!=null){
        value+= list1.data;
    }
        if(list2!=null){
            value+= list2.data;
        }
        result.data=value%10;
        if(list1!=null||list2!=null){
            Node more=sumLinkedlist((list1==null?null:list1.next),(list2==null?null:list2.next),value>=10?1:0);
            result.next=more;
        }


        return result;
    }

}
