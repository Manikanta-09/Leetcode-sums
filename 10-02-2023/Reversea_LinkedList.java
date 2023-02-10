class Result {

    /*
     * Complete the 'reverse' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts INTEGER_SINGLY_LINKED_LIST llist as parameter.
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;

     * }
     *
     */

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
    // Write your code here
        SinglyLinkedListNode p = llist;
        SinglyLinkedListNode q = p.next;
        SinglyLinkedListNode r = q.next;
        p.next = null;
        while(q!=null){
            q.next = p;
            p =q;
            q = r;
            if(r.next!=null){
                r =r.next;
            }
        }
        return llist;

    }

}
