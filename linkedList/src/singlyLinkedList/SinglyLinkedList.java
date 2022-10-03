package singlyLinkedList;

public class SinglyLinkedList {

	public Node headNode;
	public Node tailNode;
	public int sizeOfLinkedList;

	public Node createSinglyLinkedList(int nodeValue) {
		headNode = new Node();
		Node node = new Node();
		node.value = nodeValue;
		node.nextNode = null;
		headNode = node;
		tailNode = node;
		sizeOfLinkedList = 1;
		return headNode;
	}

	public void insertInSinglyLinkedList(int nodeValue, int location) {
		Node node = new Node();
		node.value = nodeValue;

		if (headNode == null) {
			createSinglyLinkedList(nodeValue);
			return;
		} else if (location == 0) {
			node.nextNode = headNode;
			headNode = node;
		} else if (location >= sizeOfLinkedList) {
			node.nextNode = null;
			tailNode.nextNode = node;
			tailNode = node;
		} else {
			Node tempNode = headNode;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.nextNode;
				index++;
			}
			Node nextNode = tempNode.nextNode;
			tempNode.nextNode = node;
			node.nextNode = nextNode;
		}
		sizeOfLinkedList++;
	}

	public void traverseSinglyLinkedList() {
		if (headNode == null) {
			System.out.println("There is no datas in linked list to traverse");
		} else {
			Node tempNode = headNode;
			for (int i = 0; i < sizeOfLinkedList; i++) {
				System.out.print(tempNode.value);
				if (i != sizeOfLinkedList - 1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.nextNode;
			}
		}
		System.out.println("\n");
	}

	public boolean searchNodeInSinglyLinkedList(int nodeValueToBeSearched) {
		if (headNode == null) {
			System.out.println("No datas available in the list to perform search");
		} else {
			Node tempNode = headNode;
			for (int i = 0; i < sizeOfLinkedList; i++) {
				if (tempNode.value == nodeValueToBeSearched) {
					System.out.println("Node " + nodeValueToBeSearched + " is found at the location : " + i);
					return true;
				}
				tempNode = tempNode.nextNode;
			}
		}
		System.out.println("Node " + nodeValueToBeSearched + " is not in the LinkedList");
		return false;
	}

	public void deleteionInSinglyLinkedList(int location) {

		if (headNode == null) {
			System.out.println("The linkedList is Empty");
		} else if (location == 0) {
			headNode = headNode.nextNode;
			sizeOfLinkedList--;
			if (sizeOfLinkedList == 0) {
				tailNode = null;
			}
		} else if (location >= sizeOfLinkedList) {
			Node tempNode = headNode;
			for (int i = 0; i < sizeOfLinkedList - 1; i++) {
				tempNode = tempNode.nextNode;
			}
			if (tempNode == headNode) {
				headNode = tailNode = null;
				sizeOfLinkedList--;
				return;
			}
			tempNode.nextNode = null;
			tailNode = tempNode;
			sizeOfLinkedList--;
		} else {
			Node tempNode = headNode;
			for (int i = 0; i < location - 1; i++) {
				tempNode = tempNode.nextNode;
			}
			tempNode.nextNode = tempNode.nextNode.nextNode;
			sizeOfLinkedList--;
		}
	}
	
	public void deleteLinkedList() {
		headNode = null;
		tailNode = null;
	}

	@Override
	public String toString() {
		return "SinglyLinkedList [headNode=" + headNode + ", tailNode=" + tailNode + ", sizeOfLinkedList="
				+ sizeOfLinkedList + "]";
	}
}
