public class Reverse {
	public static void main(String[] args) {
		int i=1234;
		int sum=0;
		while(i>0) {
			int num=i%10;			
			sum=(sum*10)+num;		
			i=i/10;	
		}
		System.out.println(sum);
		System.out.println(i);
	}
}
