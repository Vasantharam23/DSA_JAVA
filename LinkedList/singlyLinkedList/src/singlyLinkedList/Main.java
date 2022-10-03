package singlyLinkedList;

public class Main {

	public static void main(String[] args) {

		SinglyLinkedList sLL = new SinglyLinkedList();
		sLL.insertInSinglyLinkedList(1, 0);
		sLL.insertInSinglyLinkedList(2, 1);
		sLL.insertInSinglyLinkedList(3, 2);
		sLL.insertInSinglyLinkedList(4, 3);
		sLL.insertInSinglyLinkedList(5, 4);
		sLL.insertInSinglyLinkedList(23, 0);

		sLL.traverseSinglyLinkedList();

		sLL.searchNodeInSinglyLinkedList(23);

		System.out.println("---------deleted 1 node---------");

		sLL.deleteionInSinglyLinkedList(9);

		sLL.traverseSinglyLinkedList();

		System.out.println("---------deleted All---------");

		sLL.deleteLinkedList();

		sLL.traverseSinglyLinkedList();

	}

}
