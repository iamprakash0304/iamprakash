package iamprakash;
//import java.lang.Exception;(even with/without this program runs)
public class input{
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.out.print("Input : ");
        int i=System.in.read();
        System.out.println("Output : "+i);
	    for(int j=1;j<5;j++) {
        System.out.print("i-"+j+": ");
        System.out.println(i-j);	
	    }
	 }

}
