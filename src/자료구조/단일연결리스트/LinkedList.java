package 자료구조.단일연결리스트;

public class LinkedList<E> implements ListInterface<E> {

    private Node<E> head; // 노드 처음
    private Node<E> next; // 노드 꼬리
    private int size; // 리스트 길이

    public LinkedList(){
        this.head = null;
        this.next = null;
        this.size = 0;
    }

    // 맨 앞에 요소 추가
    @Override
    public void addFront(E value) {
        Node<E> node = new Node<E>(value);
        if(size == 0) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    // 마지막에 요소 추가
    @Override
    public void addLast(E value) {
        Node node = new Node(value);
        // 리스트가 비어있으면 head에 추가
        if(size == 0) {
            head = node;
        } else {
            next = node;
        }
        size++;
    }

    // 해당 인덱스에 요소 추가
    @Override
    public void add(int index, E value) {
        if(index > size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        if(index == 0){
            addFront(value);
        } else if(index == size){
            addLast(value);
        } else {
            Node<E> beforeNode = getNode(index-1);
            Node<E> afterNode = beforeNode.next;
            Node<E> newNode = new Node<E>(value);
            beforeNode.next = newNode;
            newNode.next = afterNode;
            size++;
        }
    }

    @Override
    public E remove(int index) {
        Node<E> beforeNode = getNode(index-1); // 삭제할 노드의 이전 노드
        Node<E> removeNode = beforeNode.next; // 삭제할 노드
        E element = removeNode.data;
        beforeNode.next = removeNode.next;
        size--;
        return element;
    }

    // 값을 가져옴
    @Override
    public E get(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        Node<E> node = head;
        for (int i=0; i<index; i++){
            node = node.next;
        }
        return node.data;
    }

    @Override
    public Node<E> getNode(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        Node<E> node = head;
        for (int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }

    // 값 수정
    @Override
    public void set(int index, E value) {
        Node<E> node = getNode(index);
        node.data = value;
    }

    @Override
    public boolean contains(E value) {
        Node<E> node = head;
        for (int i=0; i<size; i++){
            if(node.data == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(E value) {
        Node<E> node = head;

        for (int i=0; i<size; i++){
            if(node.data == value){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }
}
