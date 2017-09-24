package SortingAlgorithms;

/**
 * @author Yao-I Tseng
 * date 22 September 2017
 */

public class InsertionSort<E extends Comparable <E>> {
	Object[] list;
	
	public InsertionSort(Object[] unsorted){
		list = unsorted;
		for(int i = 1; i < list.length; i++){
			Object tem = list[i];
			int j = i;
			while(j != 0){
				if(compare(list[j], list[j-1]) <= 0){
					swap(list, j, j-1);
					j--;
				}
				else{
					list[j] = tem;
					j = 0;
				}
			}
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
