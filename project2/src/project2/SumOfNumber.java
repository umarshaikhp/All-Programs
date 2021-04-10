package project2;

public class SumOfNumber {
	public static Long calc() {
		char[] ch= {'0','1','2','3','4','5','6'};
		long sum=0L;
		for(int i=ch.length-1;i>=0;i--) {
			int x=ch[i];
			sum=sum+x;
			
		}
		return sum;
			
			
		}
		
	public static void main(String[] args) {
		Long r=calc();
		System.out.println(r);
		
	}

}
