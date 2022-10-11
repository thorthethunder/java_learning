public class Test {
   public static void main(String[] args) {
	   int[] a1 = {1,3,5,6}; int[] a2 = {2,4,5,7};
	   
	  
	   for(int i=0;i<a1.length;i++) {
		   for(int j=0;j<a2.length;j++) {
			   if(a1[i]==a2[j]) {
				    System.out.println("Common Elements"+a1[i]);
			   }
		   }
	   }
   }

}
