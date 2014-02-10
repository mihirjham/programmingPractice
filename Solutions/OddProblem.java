import java.util.Arrays;

class OddProblem
{
	/*O(nlogn) Time Solution
	 * O(n) Space
	 * I know you were looking for a int[] list, which will affect the Space complexity(or not),
	 * I'll tend to that after I finish the other ones.*/
	public static int[] oddCompute(int A[])
	{
		Arrays.sort(A);

		for(int i=0; i<A.length; i++)
		{
			int j = i+1;
			int count = 1;
			if(j==A.length)
			{
				System.out.println(A[j-1]);
				break;
			}
			while(A[i] == A[j])
			{
				count++;
				j++;
				if(j==A.length)
					break;
			}
			
			if(count % 2 == 1)
				System.out.println(A[i]);
			i = j-1;
		}
		
		return A;	
	}

	public static void main(String args[])
	{
		int array[] = {1, 2, 3, 4, 4, 1, 2, 2, 4, 5};
		int Array[] = {1, 2, 3, 2, 3, 1, 3};
		int integers[] = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
		OddProblem.oddCompute(integers);

		
	}
}
