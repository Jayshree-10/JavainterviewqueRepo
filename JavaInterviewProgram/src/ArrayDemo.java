import java.util.Arrays;

public class ArrayDemo {

	public ArrayDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]= {12,6,3,9,1,17,5};
		System.out.println("Before swapping ");
		System.out.println(Arrays.toString(num));
		for(int i=0; i<num.length; i++)
		{
			for(int j=i+1; j<num.length; j++)
			{
				if(num[i]>num[j])
				{
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("after swapping ");
		System.out.println(Arrays.toString(num));
	}

}
