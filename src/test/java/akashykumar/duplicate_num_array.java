package akashykumar;

import java.util.HashSet;
import java.util.Set;

public class duplicate_num_array {

	public static void main(String[] args) {
//		int a[] = {2,5,2,8,3,5,};
//		//System.out.println(a.length);
//		for(int i=0;i<a.length-1;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j] && (i!=j)) {
//					System.out.println(a[j]+" ");
//				}
//			}
//		}
		
		int p[]= {7,0,9,6,7,9};
		
		//System.out.println(p.length);
		for(int i=0;i<p.length-1;i++) {
			for(int j=i+1;j<p.length;j++) {
				if(p[i]==p[j]&& (i!=j)) {
					System.out.println(p[j]);
				}
			}
		}

		
		}

}
