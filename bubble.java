package powerPuff;

public class bubble 
{
	int[] list = {3,0,5,6,4,7,3};
	
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

