import java.sql.Timestamp;
import java.util.Date;


public class InsertSort {

	public static void insertionsort (long tablica[]) {
		long i, klucz;
		long j; 
		int iter = 0;
		
		Date czas = new Date();
		Timestamp date = new Timestamp(czas.getTime());
		System.out.println(iter+" "+date);
		

		for (i=1;i<tablica.length;i++){
		j=i;
		klucz=tablica[(int) i];
		while (j>0 && tablica[(int) (j-1)]>klucz){
		tablica[(int) j]=tablica[(int) (j-1)];
		j--;
		iter++;
		}
		tablica[(int) j]=klucz;
		}
		 
		
		
		
		//for (i=0; i<100000; i++){
			//System.out.println(i +" "+tablica[(int) i]);
	//	}
		Date czas2 = new Date();
		System.out.println(iter+" "+ new Timestamp(czas2.getTime()));
}
}
