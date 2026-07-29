class LinkedList {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head;
    Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public int get(int index) {

        Node curr = head;

        while (curr != null && index > 0) {
            curr = curr.next;
            index--;
        }

        if (curr == null)
            return -1;

        return curr.val;
    }

    public void insertHead(int val) {

        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertTail(int val) {

        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public boolean remove(int index) {

        if (head == null)
            return false;

        if (index == 0) {
            head = head.next;

            if (head == null)
                tail = null;

            return true;
        }

        Node prev = head;

        while (prev != null && index > 1) {
            prev = prev.next;
            index--;
        }

        if (prev == null || prev.next == null)
            return false;

        if (prev.next == tail)
            tail = prev;

        prev.next = prev.next.next;

        return true;
    }

    public ArrayList<Integer> getValues() {

        ArrayList<Integer> ans = new ArrayList<>();

        Node curr = head;

        while (curr != null) {
            ans.add(curr.val);
            curr = curr.next;
        }

        return ans;
    }
}