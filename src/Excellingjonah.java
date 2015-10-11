
public class Excellingjonah {
	
		public int multiply (int a,int b)
		{
			int sum;
			sum=a*b;
			return(sum);
			}
		public double multiply (double a,double b)
		{
			double sum;
			sum=a*b;
			return(sum);
			}
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Excellingjonah hand1=new Excellingjonah();
		int res=hand1.multiply(4,5);
		double res1=hand1.multiply(4.5,5.6);
		System.out.println("\n Normal method values"+res+"  "+res1);
	}

}
