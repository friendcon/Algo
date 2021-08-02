package 자료구조.단일연결리스트;

public class OneListMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(new Node<Integer>(1));
        linkedList.addLast(new Node<Integer>(2));
        linkedList.addLast(new Node<Integer>(3));
        linkedList.addLast(new Node<Integer>(4));
        for (int i=0; i<linkedList.size(); i++){
            System.out.println(linkedList.get(i));
        }
    }
}
