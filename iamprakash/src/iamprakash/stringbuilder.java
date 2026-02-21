package iamprakash;

public class stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="12345";
        
        StringBuilder s2=new StringBuilder();
        
        s2.append(s1);
        s2=s2.reverse();
        System.out.println(s1+"\nand\n"+s2);
        
        
	}

}
