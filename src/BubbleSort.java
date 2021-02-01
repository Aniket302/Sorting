import java.util.*;
public class BubbleSort 
{
	void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[j] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 
  
    /* Prints the array */
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
	
	public static void main(String[] args) 
	{
		BubbleSort ob = new BubbleSort(); 
		int n;
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the size of the array: ");
		n = sc.nextInt();
		System.out.println("Enter the elements of the array: ");
		int[] arr = new int[n];  
		for(int i=0; i<n; i++)  
		{    
			arr[i]=sc.nextInt();  
		}  
        
        ob.bubbleSort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 

	}

}
