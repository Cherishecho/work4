package work4;
import java.util.Scanner;

public class LinearEquation {
	private int a;
	private int b;
	private int c;
	private int d;
	private int e;
	private int f;
	public LinearEquation(int a,int b,int c,int d,int e,int f) {
    	this.a=a;
        this.b=b;
        this.c=c;
        this.a=d;
        this.b=e;
        this.c=f;
    }
	public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getC(){
        return c;
    }
    public int getD(){
        return d;
    }
    public int getE(){
        return e;
    }
    public int getF(){
        return f;
    }
    boolean isSolvable() {
    	if(a*d-b*c!=0)
    	return true;
    	else
    	return false;
    }
    int getX() {
    	return(e*d-b*f)/(a*d-b*c);
    }
    int getY() {
    	return(a*f-e*c)/(a*d-b*c);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input=new Scanner(System.in);
	     System.out.println("enter a,b,c,d,e,f:");
	     int a=input.nextInt();
	     int b=input.nextInt();
	     int c=input.nextInt();
	     int d=input.nextInt();
	     int e=input.nextInt();
	     int f=input.nextInt();
	     LinearEquation x=new LinearEquation(a,b,c,d,e,f);
	     if(a*d-b*c==0) {
	    	 System.out.println("The equation has no solution.");
	     }
	     else {
	    	 System.out.println("The equation solution is "+x.getX()+"and "+x.getY());
	     }
	}

}
