class Result {

    /*
     * Complete the 'insertNodeAtPosition' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER data
     *  3. INTEGER position
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

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
    // Write your code here
        SinglyLinkedListNode curr = llist;
        SinglyLinkedListNode newnode = new SinglyLinkedListNode(data);
        if(position == 0){
            newnode.next = llist;
            llist = newnode;
        }
        for(int i=1;i<position;i++){
            curr =curr.next;
        }
        newnode.next = curr.next;
        curr.next = newnode;
        return llist;

    }

}
