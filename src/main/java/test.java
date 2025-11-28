class test {
    static void main() {
        Node n1 = new Node(5, null);
        Node n0 = new Node(7,n1);

        System.out.println(n0.data);

        System.out.println("=========");

        LinkedList l = new LinkedList();
        l.prepend(5);
        l.prepend(2);
        l.prepend(1);

        System.out.println(l);

        System.out.println(l.indexOf(9));
        System.out.println(l.at(8));
    }
}