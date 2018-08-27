import java.util.*;
class Complex
{
	private int real,imag;
	public void setData(int a,int b)
	{
		real=a;
		imag=b;
	}
	public void Display()
	{
		 System.out.println(real+"+"+imag+"i");	
	}
}

public class ComplexNumber {

	public static void main(String[] args) {
     Complex obj=new Complex();
     int real,imag;
     Scanner input=new Scanner(System.in);
     real=input.nextInt();
     imag=input.nextInt();
     obj.setData(real,imag);
     obj.Display();
		input.close();
		
	}


}
