
public class MergeSort {
	private int[] numbers;
    private int[] helper;

    private int number;

    public void sort(int[] values) {
        this.numbers = values;
        number = values.length;
        this.helper = new int[number];
        mergesort(0, number - 1);
    }

    private void mergesort(int low, int high) {
        // check if low is smaller than high, if not then the array is sorted
        if (low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            // Sort the left side of the array
            mergesort(low, middle);
            // Sort the right side of the array
            mergesort(middle + 1, high);
            // Combine them both
            merge(low, middle, high);
        }
        
    }
        private int[] mergesorting(int []B) {
        	int [] right;
        	int mid=B.length/2;
        	int [] left=new int[mid];
        	if(B.length%2==0)
        	{right=new int[mid];}
        	else{
        		right=new int[mid+1];
        	}
        	for(int i=0;i<mid;i++)
        	{
        		left[i]=B[i];
        		
        	}
       int x=0;
        	for(int j=mid;j<B.length;j++)
        	{
        		right[x]=B[j];
        		x++;
        	}
        	
        	left=mergesorting(left);
        	right=mergesorting(right);
        	int [] sortted=merg(left,right);
        	
        	
            // check if low is smaller than high, if not then the array is sorted
           
            
    }
        
        
        private int[] merge(int[]left, int[] right) {
        	
        	int L=0;
        	int R=0;
        	int indexRes=0;
        	int [] result = null;
        	while(L<left.length||R<right.length)
        	{	if(L<left.length&&R<right.length)
        	{
        	
        	if(left[L]<=right[R])
        	{
        		result[indexRes]=left[L];
        		L++;
        		indexRes++;
        	}
        	if(left[R]<=right[L])
        	{result[indexRes]=right[R];
        		R++;
        		indexRes++;
        	}
        	}
        	
        	if(L<left.length)
        	{
        		result[indexRes]=left[L];
        		L++;
        		indexRes++;
        	}
        	if(R<right.length)
        	{result[indexRes]=right[R];
        		R++;
        		indexRes++;
        	}
        	}
        }

    private void merge(int low, int middle, int high) {

        // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
        }
        // Since we are sorting in-place any leftover elements from the right side
        // are already at the right position.

    }
}