package iamprakash;

class Demo{
	int a;
	int b;
	int c;
	int sum() {
		return a+b+c;
	}
	
} 
public class meth1{
	public static void main(String args[]) {
		Demo ob=new Demo();
		int sum;
		ob.a=10;
		ob.b=20;
		ob.c=30;
		sum=ob.sum();
		System.out.println(sum);
		
		
	}
}
