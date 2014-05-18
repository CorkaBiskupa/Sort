import java.sql.Timestamp;
import java.util.Date;


public class MergeSort {  
	static int iter=0;
	static long[] numbers;
	   static int[] helper;

	   static int number;

	  public static void sort(long[] tab1) {
			Date czas = new Date();
			Timestamp date = new Timestamp(czas.getTime());
			System.out.println(iter +" "+date);
		  
		numbers = tab1;
	    number = tab1.length;
	    helper = new int[number];
	    mergesort(0, number - 1);
	    
		Date czas2 = new Date();
		Timestamp date2 = new Timestamp(czas2.getTime());
		System.out.println(iter+" "+date2);
		iter=0;
	  }

	  private static void mergesort(int low, int high) {
	
	    if (low < high) {

	      int middle = low + (high - low) / 2;
	      iter++;	    
	      mergesort(low, middle);
	      mergesort(middle + 1, high);
	      merge(low, middle, high);
	    }
	  }

	  private static void merge(int low, int middle, int high) {

	 
	    for (int i = low; i <= high; i++) {
	      helper[i] = (int) numbers[i];
	    }

	    int i = low;
	    int j = middle + 1;
	    int k = low;
	    
	    while (i <= middle && j <= high) {
	      if (helper[i] <= helper[j]) {
	    	  iter++;
	        numbers[k] = helper[i];
	        i++;
	      } else {
	        numbers[k] = helper[j];
	        j++;
	      }
	      k++;
	    }
	  
	    while (i <= middle) {
	      numbers[k] = helper[i];
	      k++;
	      i++;
	    }

	  }
	} 
	