package com.company;

import com.company.utils.Allfuctions;
import com.company.utils.Node;

import java.time.Duration;
import java.time.Instant;
import java.util.Stack;

public class LinkedListPallindrome {
    public static void main(String []args){
        Node list1=new Node(0);
        list1.next=new Node(1);
        list1.next.next=new Node(1);

        Instant start= Instant.now();
        System.out.println(isPalindrome(list1));
        System.out.println(isPalindromestack(list1));
   System.out.println(Allfuctions.getLinkedListSize(list1));
        Instant end= Instant.now();

        Duration difference = Duration.between(start,end);
        System.out.println(difference.toNanos());



    }

    private static boolean isPalindrome(Node list) {
            Node reverse=Allfuctions.reverseLinkedList(list);


        return Allfuctions.compareLinkedList(list,reverse);
    }

    private static boolean isPalindromestack(Node list){
        Stack<Integer>stack=new Stack<>();
        Node slow=list;
        Node fast=list;
        Node p1=list;
        while(fast!=null&&fast.next!=null){
            stack.push(slow.data);
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null){
            slow=slow.next;
        }
        while(slow!=null){
            int ele= stack.pop();
            if(slow.data!=ele){
                return false;
            }
            slow=slow.next;
        }
        return true;

    }
    private static boolean isPalindromerecursive(Node list){


return true;

    }
}
