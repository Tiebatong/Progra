class LinkedList {

    private Node head = null;

    void prepend(int value) {
       Node newHead = new Node(value, head);
       this.head = newHead;
    }

    int indexOf(int needle) {

        if (head == null) {
            return -1;
        }
        int index = 0;
        Node current = head;
        while(current.data != needle) {
            current = current.next;
            if (current == null) {
                return -1;
            }
            index++;
        }
        return index;
    }

    int at(int i) {
        Node current = head;
        int index = 0;
        while (i > index) {
            index++;
            current = current.next;
            if (current == null) {
                IndexOutOfBoundsException e = new IndexOutOfBoundsException();
                throw  e;
            }
        }
        return current.data;
    }

    @Override
    public String toString() {
        String result = "";
        Node currentElement = head;
        while(currentElement != null) {
            result += currentElement.data + " ->";
            currentElement = currentElement.next;
        }
        return result;
    }
}
