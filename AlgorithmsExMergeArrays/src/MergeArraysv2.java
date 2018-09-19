
public class MergeArraysv2 {
	
	public static void main(String[] args) {
		//inputs
		int arraysize=50000;
		int[]A=new int[arraysize];
		int[]B=new int[arraysize];
		//int[]A=new int[] {0,1,2,3,4,5};
		//int[]B=new int[] {1,2,3,4,5,6,7,8,9,10};
		for(int x=0;x<arraysize;x++) {
			A[x]=x;
			B[x]=x;
		}
		
		//printing out the input arrays
		System.out.println("A array is ");
		//printArray(A);		
		System.out.println("B array is ");
		//printArray(B);
				
		//System.out.println("Looping through");
		long startTime = System.currentTimeMillis();
		int[] C=combineArrays(A,B);
		long endTime = System.currentTimeMillis();
		//print out new array C
		System.out.println("C array is ");
		//printArray(C);
		System.out.println("Time taken ms "+(endTime-startTime));
	}
		
	public static int[] combineArrays(int[]A, int[]B) {
		//create variables
		int counterA=0;
		int counterB=0;
		//System.out.println("Creating new array");
		int[]C=new int[A.length+B.length];
		
//		//create and initialise oversize array
//		int[]D;
//		if(A.length<B.length) {
//			D=new int[B.length];
//		}else {
//			D=new int[A.length];
//		}
//		for(int k=0;k<D.length;k++) {
//			D[k]=Integer.MAX_VALUE;
//		}
		
		//looping through C to fill it
		for(int i=0;i<C.length;i++) {
			if(counterA<=A.length-1 && counterB<=B.length-1) {
				//if A token is less than B token
				if(A[counterA]<B[counterB]) {
					//save A token into C
					C[i]=A[counterA];				
					counterA++;					
				} else { //A token < B token
					//otherwise save B token to C
					C[i]=B[counterB];					
						counterB++;					
					}
			}else if(counterA>A.length-1) {			
					C[i]=B[counterB];
					counterB++;
			} else {
					C[i]=A[counterA];
					counterA++;
			}
		
		}
		return C;
}
	
	
	public static void printArray(int[]A) {
		for(int j=0;j<A.length;j++) {
			System.out.print(A[j]+" : ");
		}
		System.out.println();
	}
		
}
	
	



