import java.util.*;
public class SecondLargest {

	public static void main(String[] args) {
     Scanner input =new Scanner(System.in);
	 int size=input.nextInt();
     int arr[]=new int[size];
     for(int i=0;i<size;i++)
     {
    	 arr[i]=input.nextInt();
     }
     int temp=0;
     for(int i=0;i<size-1;i++)
     {
      for(int j=i+1;j<size;j++)
     {
         if(arr[i]>arr[j])
		 {
			 temp=arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;
		 }
	 }	 
     }
     System.out.println("The second Largest number is ="+arr[size-2]);
		
	}


}