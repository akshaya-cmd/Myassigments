package week1.day1;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=8, f1=0, f2=1;
		
		for (int i = 1; i <=num; ++i) {
			
		int nextnum= f1+f2;
		
		f1=f2;
		f2=nextnum;
		System.out.println(f1+",");
			

	}
	}
}
