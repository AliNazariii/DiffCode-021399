using System;
					
public class Program
{
	public static void Main()
	{
		int n = Convert.ToInt32(Console.ReadLine());
		string[] nums = Console.ReadLine().Split();		
		for (int i = 0; i < n; i++) 
		{
			for (int j = i + 1; j < n; j++) 
			{
				if (Convert.ToInt32(nums[i]) > Convert.ToInt32(nums[j]))
				{
					string t = nums[j];
					nums[j] = nums[i];
					nums[i] = t;
				}
			}
		}
		string[] res = new string[n];
		for (int i = 0; i < n; i++) 
		{
			if (i % 2 == 0)
			{
				res[i] = nums[n - 1 - (i / 2)];
			}
			else 
			{
				res[i] = nums[(i - 1) / 2];
			}
		}
		Console.WriteLine(string.Join(" ", res));
	}
}
