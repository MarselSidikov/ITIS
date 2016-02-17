package ru.itis.inform;

public class LinkedList<T> implements List<T> {
    private Node<T> first;

    private int count;

    public LinkedList() {
        this.first = null;
        this.count = 0;
    }

    // Когда добавляете, учтите, что еще есть previous
    public void add(T element) {
        Node newNode = new Node<T>(element);
        newNode.setPrevious(null);
        if (first == null) {
            this.first = newNode;
        } else {
            newNode.setNext(this.first);
            first.setPrevious(newNode);
            first = newNode;
        }
        this.count++;
    }

    @Override
    public void remove(T element) {

    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIteratorImpl<T>(this.first);
    }
}
