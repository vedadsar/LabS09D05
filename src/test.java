
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
		lList.add(15);
		lList.add(15);
		lList.add(99);
		lList.add(1);
		lList.add(77);
		lList.add(12);
		lList.add(99);
		lList.add(1);
		lList.add(111);
		lList.add(111);
		lList.add(111);
		
		System.out.println(lList.toString());
		
		
		aList.removeAt(0);
		aList.removeAt(2);
		
		System.out.println("Array after removing " +aList.toString());
		
		lList.deDuplicate1();
		System.out.println("List after removing " +lList.toString());
	}
}
