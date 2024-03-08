package Tugas5;

public class Node {
		private int data;//Menyimpan data bertipe double dalam node.
		Node next;//menyimpan referensi ke node berikutnya dalam linked list.
		
		public Node(int data) {
			this.data = data;
		}
		//setter dan getter
		public void setData(int data) {
			this.data = data;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public int getData() {
			return data; 
		}
		public Node getNext() {
			return next;
		}
	}