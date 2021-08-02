package 자료구조.단일연결리스트;

public class Node<E> {
    public E data;
    public Node<E> next;

    public Node(E data) {
        this.data = data;
        next = null;
    }
}
