package dumbsort;
public class Dumbsort {

	Dumbsort(int array[]) {
        
		shuffle(array);
        System.out.println("sorted array using bubble sort :");
        print(array);
    }
	
    private void shuffle(int[] array) {
    	int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
        	for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
        int temp;
        temp = array[i];
        array[i] = array[k];
        array[k] = temp;
      }
     }
    }
}
    private void print(int[] input) {
          
    	for(int x : input) {
			System.out.print(x + ", ");
		}
		System.out.println();
        
    }
   
    public static void main(String[] args) {
		int[] array = {5,6,6,4,3};
		System.out.println("before sorting elements are :   ");
		for(int value = 0; value< array.length; value++) {
		System.out.print(array[value] + " ,");
		}
		System.out.println();
		new Dumbsort(array);
	}

}