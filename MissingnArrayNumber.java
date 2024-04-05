package week1assignment;

public class MissingnArrayNumber {

	public static void main(String[] args) {
		int a[]= {1,4,3,2,8,6,7,};
		int sum1 =0;
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		//System.out.println("sum of range of elements in array :"+ sum1);
		int sum2=0;
		for(int i=1;i<=8;i++)
		{
			sum2=sum2+i;
		}
		//System.out.println("sum of range of elements in sum 2:"+ sum2);
		System.out.println("missing number is :"+ (sum2-sum1));
		
	}}
		
		
				