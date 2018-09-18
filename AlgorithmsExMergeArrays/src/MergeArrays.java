
public class MergeArrays {

	
	
	public static void main(String[] args) {
		//inputs
		int[]A=new int[] {0,1,2,3,4,5};
		int[]B=new int[] {1,2,3,4,5};
		
		//printing out the input arrays
		System.out.println("A array is ");
		for(int j=0;j<A.length;j++) {
			System.out.print(A[j]+" : ");
		}
		System.out.println("");
		
		System.out.println("B array is ");
		for(int j=0;j<B.length;j++) {
			System.out.print(B[j]+" : ");
		}
		System.out.println("");
		
		//create variables
		int counterA=0;
		int counterB=0;
		//System.out.println("Creating new array");
		int[]C=new int[A.length+B.length];
		
		//create and initialise oversize array
		int[]D;
		if(A.length<B.length) {
			D=new int[B.length];
		}else {
			D=new int[A.length];
		}
		for(int k=0;k<D.length;k++) {
			D[k]=Integer.MAX_VALUE;
		}
		//System.out.println("Looping through");
		
		//looping through C to fill it
		for(int i=0;i<C.length;i++) {

			//if A token is less than B token
			if(A[counterA]<B[counterB]) {
				//save A token into C
				C[i]=A[counterA];
				
				//if still inside array
				if(counterA<A.length-1) {
					//increase counter
					counterA++;
				}else {
					//otherwise point to oversize array
					A=D;
				}
			} else {
				//otherwise save B token to C
				C[i]=B[counterB];
				
				//if still inside array
				if(counterB<B.length-1) {
					//increase counter
					counterB++;
				}else {
					//otherwise, point to oversize array
					B=D;
				}
			}		
		}
		
		//print out new array C
		System.out.println("New Array is ");
		for(int j=0;j<C.length;j++) {
			System.out.print(C[j]+" : ");
		}
		
	}
		
		
}
	
	

