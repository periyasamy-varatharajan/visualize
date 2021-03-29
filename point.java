package visualize;
import java.awt.*;
import java.awt.image.*;
/**
*point class stores all the information of points and in all coordinates
*/
public class point
{
	double x,y,z,r,t,a;
	//float r=Math.sqrt(x*x+y*y+z*z);
/**
*constructor with three points ie.cartesian coordinates
*@param x it is a integer x in cartesian coordinates
*@param y it is a integer y in cartesian coordinates
*@param z it is a integer z in cartesian coordinates
*/
	public point(int x,int y,int z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
		r=Math.sqrt(x*x+y*y+z*z);
		if(z==0)
		{
			t=1.5708;
		}
		else
		{
			t=Math.atan(Math.sqrt(x*x+y*y)/z);
		}
		if(x==0)
		{
			a=1.5708;
		}
		else
		{
			a=Math.atan(y/x);
		}
	}
	/**
	*draw a point object on the buffered image object given to it 
	*@param bi it is the image that holds the point 
	*place where the point to be drawn
	*/
	public void drawpoint(BufferedImage bi)
	{
		//Graphics g=bi.createGraphics();
		//g.drawString("point added",(int)x,(int)y);
		bi.setRGB((int)this.x,(int)this.y,-1);
	}
	public static void main(String args[])
	{
		point p=new point(1,0,0);
		System.out.println(p.r);
		System.out.println(Math.toDegrees(p.t));
		System.out.println(Math.toDegrees(p.a));
	}
}
