public class point
{
	double x,y,z,r,t,a;
	//float r=Math.sqrt(x*x+y*y+z*z);
	public point(int x,int y,int z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
		r=Math.sqrt(x*x+y*y+z*z);
		t=Math.atan(Math.sqrt(x*x+y*y)/z);
		a=Math.atan(y/x);
	}
	public static void main(String args[])
	{
		point p=new point(1,2,3);
		System.out.println(p.r);
		System.out.println(Math.toDegrees(p.t));
		System.out.println(Math.toDegrees(p.a));
	}
}
