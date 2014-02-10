class KComplimentary
{
	/*Here is a O(n^2) algorithm for this problem*/
	public static int findPairs(int k, int A[])
	{
		int count = 0;

		for(int i=0 ; i < A.length; i++)
		{
			for(int j=0; j<A.length; j++)
			{
				if(A[i] + A[j] == k)
					count++;
			}
		}
		return count;
	}

	public static void main(String args[])
	{
		int k = 6;
		int A[]={1,8,-3,0,1,3,-2,4,5};

		System.out.println(KComplimentary.findPairs(6,A));
	}
}
