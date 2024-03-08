package Tugas5;

public class ListTest {
	    public static void main(String[] args) {
	        StrukturList list = new StrukturList();//Membuat objek baru dari kelas StrukturList bernama list
	        System.out.println("Latihan 3");
	        list.addHead(2);
	        list.addHead(9);
	        list.addHead(7);
	        list.displayElement();
	        list.removeHead();
	        list.displayElement();
	        list.removeHead();
	        list.displayElement();
	        list.removeHead();
	        System.out.println();
	  
	        System.out.println("Latihan 4");
	        StrukturList list4 = new StrukturList();
	        list4.removeMid(1);
	        System.out.println();
	        
	        System.out.println("Latihan 5-1");
	        StrukturList list2 = new StrukturList();//Membuat objek baru dari kelas StrukturList bernama list2
	        list2.addHead(4);
	        list2.addMid(3, 2);
	        list2.addMid(7, 3);
	        list2.addMid(8, 4);
	        list2.addMid(1, 5);
	        list2.addTail(9);
	        list2.displayElement();
	        list2.removeMid(8);
	        list2.displayElement();
	        list2.removeHead();
	        list2.displayElement();
	        System.out.println("");
	        
	        System.out.println("Latihan 5-2");
	        StrukturList list3 = new StrukturList();
	        list3.addHead(2);
	        list3.addMid(6, 2);
	        list3.addMid(3, 3);
	        list3.addMid(5, 4);
	        list3.addTail(1);
	        list3.displayElement();
	        list3.removeMid(3);
	        list3.displayElement();
	        list3.removeMid(6);
	        list3.displayElement();
	        list3.removeMid(5);
	        list3.displayElement();
	    }
	}