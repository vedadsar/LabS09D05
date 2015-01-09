
public class test {
	public static void main(String[] args) {
		ArrayListInt aList = new ArrayListInt();
		aList.add(5);
		aList.add(77);
		aList.add(12);
		aList.add(12);
		aList.add(78);
		aList.add(1);
		
		System.out.println(aList.toString());
		
		LinkedListInt lList = new LinkedListInt();
		lList.add(1);
		lList.add(2);
		lList.add(3);
		lList.add(4);
		lList.add(5);
		lList.add(6);
		lList.add(7);
		lList.add(8);
		lList.add(9);
		lList.add(10);
		lList.add(11);
		
		System.out.println(lList.toString());
			
		System.out.println(lList.getNtoLastValue(1));
	}
}
