

public class ArrayListInt {

	private int[] array;
	private int size;
	private final int INIT_SIZE =10;
	
	public ArrayListInt(){
		size = 0;
		array = new int[INIT_SIZE];
				
	}
	
	
	public void add(int value){
		if(size == array.length)
			resize();
		
		array[size] = value;
		size++;
		
	}


	private void resize() {
		int [] temp = new int[size*2];
		for(int i=0; i<size; i++){
			 temp[i] = array[i];
		}
		
		array = temp;
		
	}
	
	public int getSize(){
		return size;
	}
	
	
	public String toString(){
		String out = "[";
		for(int i=0; i<size; i++){
			if(i == size-1){
				out+= array[i];
				break;
			}
			out += array[i] + ", ";
		}
		return out +"]";
	}
	
	public void removeAt(int index){
	
		for( int i=index; i<size;i++){
		array[i]=array[i+1];
		
		}
		size--;
	}	
}
