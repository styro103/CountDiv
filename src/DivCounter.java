/*
 * The class that solves for the number of divisors of the denominator. It Assumes 0<=A<=B<=2,000,000,000, 
 * 		and 1<=K<=2,000,000,000 
 * This runs in O(1).
 */
class DivCounter
{
	public int getCount(int A, int B, int K)
	{
		//Edge Cases
        if (A==B) //If No Range, Only One Number
        {
			if (A%K==0) //If Number is Divisible by K 
				return 1; //return 1
			    
			return 0; //Else Return 0
        }
		else if (K==1) //If K is One
		    return B-A+1; //Return Count for Simple Case
		
		int count = ((B-A)/K)+1; //Get Count of Integers Divisible by K for General Case
		boolean lbA = (A&1)==1; //Check Last Bit, True if A is Odd, False if Even
		boolean lbB = (B&1)==1; //Check Last Bit, True if B is Odd, False if Even
		boolean lbK = (K&1)==1; //Check Last Bit, True if K is Odd, False if Even
		
		if (lbA && lbB && !lbK) //Check for Special Case, A and B are Odd, K is Even
		    count--; //Decrement Count If So
		
		return count; //Return Count Value
	}
}