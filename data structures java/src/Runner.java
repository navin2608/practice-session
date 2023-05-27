public class Runner {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.insert(36);
		list.insert(90);
		list.insert(90);
		list.insert(89);
		list.insertStart(26);
		list.insertAt(0,8);
		list.insertAt(0, 7);
		list.deleteAt(3);
		list.show();
	}

}
