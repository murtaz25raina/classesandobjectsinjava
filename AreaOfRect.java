import java.util.*;
class Rectangle
{
	private float length,breadth,area;
	public void setData(float a,float b)
	{
		length=a;
		breadth=b;
	}
	public float getData()
	{
		area=length*breadth;
		return area;
	}
}

public class AreaOfRect {

	public static void main(String[] args) {
     Rectangle obj=new Rectangle();
     float length,breadth;
     Scanner input=new Scanner(System.in);
     length=input.nextInt();
     breadth=input.nextInt();
     obj.setData(length,breadth);
     System.out.println("Area is =" +obj.getData());
		input.close();
		
	}


}
