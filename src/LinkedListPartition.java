import com.company.utils.Allfuctions;
import com.company.utils.Node;

import java.time.Duration;
import java.time.Instant;

public class LinkedListPartition {
    public static void main(String []args){
        Node head=new Node(3);
        head.next=new Node(5);
        head.next.next=new Node(8);
        head.next.next.next=new Node(5);
        head.next.next.next.next=new Node(10);
        head.next.next.next.next.next=new Node(2);
        head.next.next.next.next.next.next=new Node(1);


        Instant start= Instant.now();
        Allfuctions.printLinkedList(partionLinkedList(head,5));
        Instant end= Instant.now();

        Duration difference = Duration.between(start,end);
        System.out.println(difference.toNanos());



    }

    private static Node partionLinkedList(Node head, int i)
    {

        Node left=new Node(0);
        Node right=new Node(0);
        Node lefthead=left;
        Node righthead=right;

        while(head!=null)
        {
            if(head.data<i){
                left.next=new Node(head.data);

                left=left.next;
        }
        else{
                right.next=new Node(head.data);
                right=right.next;
        }
            head=head.next;

        }
        left.next=righthead.next;


        return lefthead.next;
    }
}
