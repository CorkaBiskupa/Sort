import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import org.apache.commons.lang3.ArrayUtils;


public class Main {

	public static void main(String[] args) {

		long tab[] = new long[100000];
		long tab1[] = new long[100000];
		long tab2[] = new long[100000];


		Random generator = new Random();
		
		for(int i=0; i<100; i++){
			tab[i]=generator.nextInt(1000);
			}
		tab1=tab2=tab;
		
	
		System.out.println("Sortowanie przez wstawianie: ");
		InsertSort.insertionsort(tab);
		InsertSort.insertionsort(tab);
		ArrayUtils.reverse(tab);
		InsertSort.insertionsort(tab);
		System.out.println("Sortowanie przez scalanie: ");
		MergeSort.sort(tab1);
		MergeSort.sort(tab1);
		ArrayUtils.reverse(tab1);
		MergeSort.sort(tab1);
		System.out.println("Sortowanie przez kopcowanie: ");
		HeapSort.sort(tab2);
		HeapSort.sort(tab2);
		ArrayUtils.reverse(tab2);
		HeapSort.sort(tab2);
		
		Date czas = new Date();
		System.out.println("Koniec sortowan: "+ new Timestamp(czas.getTime()));
		
	
		

	//System.out.println(date + " " +tab[2]);
	//System.out.print(tab[2] + " " +tab1[2] + " " +new Timestamp(czas.getTime()));
	
	}
	}


