// Java program for the above approach
import java.lang.*;
import java.util.*;

class GFG{

// Function to find a pair in the given
// array whose sum is equal to z
static boolean findPair(int a[], int n, int z)
{
	
	// Iterate through all the pairs
	for(int i = 0; i < n; i++)
		for(int j = 0; j < n; j++)
		
			// Check if the sum of the pair
			// (a[i], a[j]) is equal to z
			if (i != j && a[i] + a[j] == z)
				return true;

	return false;
}

// Driver code
public static void main(String[] args)
{
	
	// Given Input
	int a[] = { 1, -2, 1, 0, 5 };
	int z = 0;
	int n = a.length;
	
	// Function Call
	if (findPair(a, n, z))
		System.out.println("True");
	else
		System.out.println("False");
}
}

// This code is contributed by avijitmondal1998
