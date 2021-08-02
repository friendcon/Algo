package 자료구조.단일연결리스트;

// 단일 연결리스트, 이중 연결리스트에서 사용될 인터페이스
public interface ListInterface<E> {
    // 리스트 맨앞에 요소 추가
    void addFront(E value);
    // 리스트 마지막에 요소 추가
    void addLast(E value);
    // 해당 인덱스에 요소 추가
    void add(int index, E value);
    // 해당 위치의 요소 삭제
    E remove(int index);
    // 해당 위치의 요소 반환
    E get(int index);
    // 해당 위치의 노드 반환
    Node<E> getNode(int index);
    // 해당 위치의 요소대신 새 요소 대체
    void set(int index, E value);
    // 해당 요소가 리스트에 있는지 확인
    boolean contains(E value);
    // 해당 요소의 위치 반환
    int indexOf(E value);
    // 리스트 요소 갯수 반환
    int size();
}
