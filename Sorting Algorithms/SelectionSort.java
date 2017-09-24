package SortingAlgorithms;

public class SelectionSort<E extends Comparable <E>> {
	
	/**
	 * @author Yao-I Tseng
	 * date 22 September 2017
	 */
	
	Object[] list;
	public SelectionSort(Object[] unsorted){
		list = unsorted;
		
		for(int i = 0; i < list.length; i++){
			int tem = i;
			for(int j = i; j < list.length; j++){
				if(compare(list[tem], list[j]) >= 0){
					tem = j;
				}
			}
			swap(list, i, tem);
		}
	}
	
	//Print-----
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		if(list.length == 0){
			return sb.toString() + "]";
		}
		if(list.length >= 1){
			sb.append(list[0].toString());
		}
		if(list.length > 1){
			for(int i = 1; i < list.length; i++){
				sb.append(", " + list[i].toString());
			}
		}
		return sb.toString() + "]";
	}
	//----------
	
	//Action-----
	private void swap(Object[] list, int element1, int element2){
		Object tem = list[element1];
		list[element1] = list[element2];
		list[element2] = tem;
	}
	//----------
	//Comparing Method-----
	private int compare(Object element1, Object element2){
		return ((E)element1).compareTo((E)element2);
	}
	//----------
}
