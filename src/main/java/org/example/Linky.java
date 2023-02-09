package org.example;

public class Linky {
    Node first;
    Node last;

    private static class Node {
        Person person;
        Node next;

        public Node(Person person, Node next) {
            this.person = person;
            this.next = next;
        }

        public String getName() {
            return person.getName();
        }
    }

    public void add(Person person) {
        Node n = new Node(person, null);
        if (first == null) first = n; //Listan är tom
        if (last != null) last.next = n; // tidigare sista elementets next pekar på den nya noden
        last = n;
    }

}
