package stockers;

public class sortandsearch {
	
	
		public void sort(double[] stockprice, int left, int right) {
			if(left<right) {
				int mid=(left+(right-left))/2;
				sort(stockprice, left, mid);
				sort(stockprice, mid+1, right);
				mergesort(stockprice, left, mid, right);
						
			}
			
		}
	
		public void mergesort(double[] array, int left, int mid, int right) {
			int l1=mid-left+1;
			int l2=right-mid;
			
			double[] leftarray=new double[l1];
			double[] rightarray =new double[l2];
			
			for(int i=0;i<l1;i++)
				leftarray[i]=array[left+i];
			for(int j=0;j<l2;j++) 
				rightarray[j]=array[mid+1+j];
				
			
			int i=0;int j=0;
			int k=left;
		
			while(i < l1 && j < l2) {
				
				if(leftarray[i]<=rightarray[j]) {
					
					array[k]=array[i];
					i++;
				}
				else {
					
					array[k]=rightarray[j];
					j++;
				}
				k++;
			}
			
			while(i<l1) {
				
				array[k]=leftarray[i];
				i++;
				k++;
			}
		while(j<l2) {
			
			array[k]=rightarray[j];
			j++;k++;
		}
		
	}
		
	
		public void rising (double[] stockprice) {
			
			sortandsearch S1=new sortandsearch();
			S1.sort(stockprice, 0, stockprice.length-1);
			for( int i=0;i<stockprice.length; i++) {
				
				System.out.print(stockprice[i]+" ");
				System.out.println();
			}
			
		}
	
		public void falling (double[] stockprice) {
			
			sortandsearch S1=new sortandsearch();
			S1.sort(stockprice, 0, stockprice.length-1);
			for( int i=stockprice.length-1; i>=0;i--) {
				
				System.out.print(stockprice[i]+" ");
				System.out.println();
			}
			
		}
		
	
		public void searchstock (double[] array, int left, int right, double stockvalue) {
			
			sortandsearch S1=new sortandsearch();
			S1.sort(array, 0, array.length-1);
			
			if(left>right) 
			{
				System.out.println("Stock not found");
				return;
			}
				int mid=left+(right-left)/2;
			
			if(array[mid]==stockvalue) 
			{
				System.out.println("Stock of value "+ stockvalue+ " is present");
					
			}
			else if(array[mid]>stockvalue) 
			{
				searchstock(array, left, mid-1,stockvalue);
			}
			else if(array[mid]<stockvalue)
			{
				searchstock(array, mid+1, right, stockvalue);	
			}
			else 
			{
				System.out.println("Stock value not found");
			}
			}
			
		}


