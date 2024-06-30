package LinkedList;

import java.util.Objects;

public class LinkedList {

    Node head, tail;

    public LinkedList(){
        this.head = this.tail = null;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void addNode(int data){
        Node tmp = new Node(data);
        if(head == null){
            head = tail = tmp;
        }else{
            tail.next = tmp;
            tail = tmp;
        }
    }

    public Node reverse(){

        Node prev = null;
        Node curr = this.head;

        while(curr != null){
            Node tmp = curr.next;
            curr.next = prev;
            prev= curr;
            curr= tmp;
        }
        this.head = prev;
        return this.head;
    }

    public void printList(){

        Node cur = this.head;
        while(cur != null){
            System.out.printf("%d", cur.data);
            cur = cur.next;
            if(cur != null)
                System.out.print("->");
        }
        System.out.println("\n");
    }

    public void deleteList(){
        while(this.head != null){
            Node tmp = this.head;
            this.head = this.head.next;
            tmp = null;
        }
        this.tail = null;
    }

    public Node getMiddleNode(){

        Node slowPtr, fastPtr;
        slowPtr= fastPtr = head;

        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public void deleteAlt(){

        Node cur = head;
        while(cur != null && cur.next != null){
            cur.next = cur.next.next;
            cur = cur.next;
        }
    }

    public void pairSwap(){

        Node cur = this.head;
        Node prev = null;
        boolean firstSwap = true;
        while(cur != null && cur.next != null){
            if(prev != null){
                prev.next = cur.next;
            }
            Node tmp = cur.next;
            if (firstSwap){
                firstSwap = false;
                this.head = tmp;
            }
            cur.next = cur.next.next;
            tmp.next = cur;
            prev = cur;
            cur = cur.next;
        }
        if(cur!= null)
            tail = cur;
        else
            tail = prev;
    }

    public void deleteKthNode(int k){

        Node prev = null;
        Node cur = head;
        int count =0;
        while(cur != null){
            ++count;
            if(count ==k){
                if(cur == this.head){
                    this.head = cur.next;
                }
                if(prev!=null){
                    prev.next = cur.next;
                }
                count =0;
                cur = cur.next;
            }else{
                prev = cur;
                cur = cur.next;
            }
        }
        this.tail = prev;
    }

    // sort the linked list which is already sorted on absolute values
    public void sortAbsoluteGiven(){

        Node cur = this.head;
        Node prev = null;
        while(cur!=null){
            if(cur.data <0 && cur != head){
                Node tmp = cur.next;
                if(prev != null){
                    prev.next = tmp;
                }
                cur.next = head;
                head = cur;
                cur = tmp;
            }else{
                prev = cur;
                cur = cur.next;
            }
        }
        this.tail = prev;
    }

    public void revGrpK(int k){

        Node cur = this.head;
        Node prevHead = this.head;
        Node prev = null;
        int revCount =0;
        boolean firstRev = true;
        Node nextHead = null;
        while(cur !=null){
            Node tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
            ++ revCount;
            if(revCount ==k){
                if(!firstRev) {
                     prevHead.next = prev;
                     prevHead = nextHead;
                     nextHead = cur;
                }else{
                    firstRev = false;
                    nextHead = cur;
                    this.head = prev;
                }
                prev=null;
                revCount =0;
            }
        }
        if(prevHead !=null && prev != null){
            prevHead.next = prev;
        }
        this.tail = prev;

    }

    public void rotateCounterClock(int k){

        int count =1;
        Node cur = this.head;
        while(cur.next != null){
            ++count;
            cur = cur.next;
        }
        if(k >= count)
            return;

        Node prev = cur;
        cur = this.head;
        count =0;
        while(count <k){
            ++count;
            Node tmp = cur.next;
            prev.next = cur;
            cur.next = null;
            prev= cur;
            cur = tmp;
        }
        this.head = cur;
        this.tail = prev;
    }

    private Node rotateBlockUtil(Node head, int k, int d){

        if(head == null || head.next == null){
            if(head != null)
                this.tail = head;
            return head;
        }
        // when d>k
        d %= k;
        // No rotation case
        if(d==0)
            return head;
        int nr;
        if(d<0){
         nr = -d;
        }else{
            nr = k-d;
        }

        Node kdth, kth;
        kth = kdth = null;
        int count =0;
        Node cur = head;
        Node prev = null;
        while(count <k && cur != null){
            ++count;
            if(count ==nr){
                kdth = cur;
            }
            if(count ==k){
                kth = cur;
                break;
            }
            prev = cur;
            cur = cur.next;
        }
        // block size is less than no of elements to be rotated i.e. nr
        if(count <nr){
            nr %= count;
            count =0;
            cur = head;
            prev = null;
            kth = kdth = null;
            while(count <k && cur != null){
                ++count;
                if(count ==nr){
                    kdth = cur;
                }
                if(count ==k){
                    kth = cur;
                    break;
                }
                prev = cur;
                cur = cur.next;
            }
        }// this will happen when block size is less than k but equal to number of rotations, hence no rotation is required
        else if (count==nr && count < k){
               return head;
        }
        // no of nodes in the block less than k
        if(kth == null){
            kth = prev;
        }
        //assert Objects.nonNull(kth);
        assert kth != null;
        Node nextBlockHead = kth.next;
        kth.next = head;
        assert kdth != null;
        kdth.next = rotateBlockUtil(nextBlockHead, k, d);
        if (nextBlockHead == null){
            this.tail = kdth;
        }
        //if(d>0)
        return kth;
        //return
    }

    public void  rotateBlock(int k, int d){
        this.head = rotateBlockUtil(this.head, k, d);

    }

}
