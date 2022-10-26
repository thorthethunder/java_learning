
public class Pattern_Ineuron {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n= 7;
		for (int i =0; i< n; i++) {
			
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == (n - 1) / 2 || i == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int a = 0; a < n; a++) {
				if (i == a || a == 0 || a == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int k = 0; k < n; k++) {
				if (i == 0 || k == 0 || i == n - 1 || i == (n - 1) / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

    	  for(int m =0 ; m< n ;m++) {
    		  if((i == n-1 && m > 0 && m < n-1)|| (m== 0 && i < n-1) || (m == n-1 && i < n-1)) {
    			  System.out.print("*");
    		  }else {
    			  System.out.print(" ");
    		  }
      }
    	  for(int p =0 ; p< n ;p++) {
    		  if( (p == 0 && i > 0) || (i == 0 && p > 0 && p < n-1) || (i == p)&& i> (n-1)/2 && p > (n-1)/2 || (i == (n-1)/2 && p < n-1 ) ||  (p == n-1  && i > 0 && i < (n-1)/2) ) {
    			  System.out.print("*");
    		  }else {
    			  System.out.print(" ");
    		  }
      }
    	  for(int r =0 ; r< n ;r++) {
    		  if((i == n-1 && r > 0 && r < n-1)|| (r== 0 && i < n-1 && i> 0) || (r == n-1 && i < n-1 && i > 0) || (i == 0 && r > 0 && r < n-1)) {
    			  System.out.print("*");
    		  }else {
    			  System.out.print(" ");
    		  }
      }
    	  for (int s = 0; s < n; s++) {
				if (i == s || s == 0 || s == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
    	  System.out.println(" ");
	}
	}
}
