import java.util.List;

public class pointersJava {
    public static void main(String[] args) {
        //int n = 10;
        byte x = 10;
        byte y = 20;
        byte z = (byte) (x+y);
//        byte p = n + 20; // error because no temporary variable used
        byte q = 10 + 20;
        /*
            int n = 10;
            int* p = &n;
            print *p; the *p will have the pointer to the actual address of the variable
            in the memory and not the actual address
            OS does explicitly allow to know the actual address
            & -> address of operator     * -> indirection operator
                 variable                     pointer
         JIT Just in time compiler when we run main.java -> exe created -> run
                        -> jvm runs for next byte code etc

        int[] a = new int[5]; // a is a reference -> indirect address
        a[0] = 10;

        String s = "hello";
        String b = "hello";
        System.out.println(s==b); //Pointing to the same object in the string pool
        String c = new String("hello"); // these String objects are stored in heaf memery with different address references
        String d = new String("hello");
        System.out.println(s==c);
        System.out.println(c==d);

         */
        ListNode a = new ListNode(8);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(9);
        ListNode d = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        ListNode head = a;

        Solutions s = new Solutions();
        //ListNode rev = s.reverse(head);
        //head = s.insertFirst(head, 90);
//        head = s.insertSecond(head,150);
//        head = s.removeFirst(head);// Update head after insertion
        //s.printlist(head);
//        s.printlist(rev);
        //head = s.convert(head,2753);
        s.printlist(head);
        int n = s.convert(head);
        System.out.println(n);
        //s.convert(head);
//        System.out.println(s.printlast(head));


    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}

class Solutions{

    public static void printlist(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.println(temp.val + " ");
            temp = temp.next;
        }
    }

    public ListNode insertFirst(ListNode head, int val){
        ListNode newnode = new ListNode(val);
        newnode.next = head;                    // 50
        return newnode;                         //    10 20 30 40 50
    }

    public ListNode removeFirst(ListNode head){
        return head.next;
    }
    public int printlast(ListNode head){
        while(head.next != null){
            head = head.next;
        }
        return head.val;
    }

    public ListNode insertSecond(ListNode head, int val){
        ListNode secNode = new ListNode(val); // Link the new node to the original second node// 10 70 20 30 40
        secNode.next = head.next;
        head.next = secNode;
        return head;
    }
    public ListNode reverse(ListNode head){
        ListNode rev = null;
        ListNode current = head;
        while (current != null) {            //                    p  nt
            ListNode newnode = current.next; // Save the next node 10 20 30 40
            current.next = rev;              // Reverse the link
            rev = current;                   // Move prev forward
            current = newnode;               // Move current forward
        }
        return rev;
    }
    public ListNode convert(ListNode head,int num){
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(num > 0){
            int rem = num % 10;
            ListNode newNode = new ListNode(rem);
            temp.next = newNode;
            temp = newNode;
            num = num/10;
        }
        return dummy.next;
    }
    public int[] reverse(int[] arr){
        int[] rev = new int[arr.length];
        int j = rev.length-1;
        for(int i=0;i<arr.length;i += 1){
            rev[j] = arr[i];
            j -= 1;
        }
        return rev;
    }
    public int convert(ListNode head){
        StringBuilder sb = new StringBuilder();
        ListNode temp = head;
        while(temp != null){
            sb.append(temp.val);
            temp = temp.next;
        }
        sb.reverse();
        return Integer.parseInt(sb.toString());
//        head = reverse(head);
//
//        int num = 0;
//        while(head != null){
//            num = num * 10 + head.val;     // 5 59 590 5918
//            head = head.next;
//        }
//        return num;
    }
    public int[] toArray(ListNode head){
        ListNode newnode = reverse(head);
        ListNode temp = newnode;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int[] arr = new int[count];
        temp = newnode;
        int i=0;
        while(temp != null){
            arr[i] = temp.val;
            temp = temp.next;
            i++;
        }
        return arr;
    }
}