package powerPuff;

import java.util.*;

public class bubble 
{
/*	int[] list = {3,0,5,6,4,7,3};
	
	public int[] bubbleSort(int[] list)
	{
		int i,j,k =0;
		for(i = 0; i < list.length -1; i++)
		{
			for(j = 0; j < list.length - 1 - i; j++)
			{
				if(list[j] > list[j+1])
				{
					k = list[j];
					list[j] = list[j+1];
					list[j+1] = k;
				}
			}
		}
		return list;
		
	}
	
	public void Main(String[] args)
	{
		System.out.println(list);
	}

}
*/
	
		   public static void main(String[] args) {
		       ArrayList<Integer> list = new ArrayList<Integer>();
		       Random r = new Random();
		       for(int i=0; i<10; i++){
		           list.add(r.nextInt(100)+1); //generating random number between 1 and 100
		       }
		       System.out.println("Before sorting, list elements are: ");
		       System.out.println(list);
		       bubbleSort(list);
		       System.out.println("After sorting, list elements are: ");
		       System.out.println(list);
		      
		   }
		   public static void bubbleSort(ArrayList<Integer> list) {
		  
		int n = list.size();
		int temp = 0;

		for(int i=0; i < n; i++){
		for(int j=1; j < (n-i); j++){

		if(list.get(j-1) > list.get(j)){
		//swap the elements!
		temp = list.get(j-1);
		list.set(j-1 , list.get(j));
		list.set(j, temp);
		}

		}
		}

		}
		}
