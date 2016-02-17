package ru.itis.inform;

class LinkedListIteratorImpl<T> implements Iterator<T> {

    Node<T> current;

    public LinkedListIteratorImpl(Node<T> first) {
        this.current = first;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        T value = current.getValue();
        current = current.getNext();
        return value;
    }

    @Override
    public T previous() {
        // добавить проверку, что вообще перед ним что-то есть!!!!!
        return current.getPrevious().getValue();
    }

    @Override
    public void insert(T element) {

    }
}
