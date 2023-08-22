
public class GreaterNumber {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		int max=0;
		max = (a>b && a>c) ? a : (b>a && b>c) ? b : (c>a && c>b) ? c : 0;
		System.out.println("Greater Number Among the three Number is "+max);
		 
	}

}
