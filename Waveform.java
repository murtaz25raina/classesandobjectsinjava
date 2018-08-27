import java.util.*;
public class Waveform {

	public static void main(String[] args) {
     Scanner input =new Scanner(System.in);
     int arr[]=new int[10];
     for(int i=0;i<10;i++)
     {
    	 arr[i]=input.nextInt();
     }
     int temp;
     for(int i=0;i<10;i=i+2)
     {
    	 temp=arr[i];
    	 arr[i]=arr[i+1];
    	 arr[i+1]=temp;
     }
     for(int i=0;i<10;i++)
    	 System.out.print(arr[i]+" ");
	}


}
