package oop;

import java.util.Scanner;

public class COM221_Act3_RIGOR {

	public static void main(String[] args) {
		Selection();

	}
	
	public static void Selection() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A for SQUARE" + "\n" + "B for LEFT HALF TRIANGLE" + "\n" + "C for INVERTED LEFT HALF TRIANGLE" + "\n" + "D for LEFT HOLLOW HALF TRIANGLE" 
		+ "\n" + "E for INVERTED LEFT HOLLOW HALF TRIANGLE" + "\n" + "F for RIGHT HALF TRIANGLE" + "\n" + "G for INVERTED RIGHT HALF TRIANGLE" + "\n" 
		+ "H for RIGHT HOLLOW HALF TRIANGLE" + "\n" + "I for INVERTED RIGHT HOLLOW HALF TRIANGLE" + "\n" + "J for FULL TRIANGLE" + "\n" + "K for INVERTED FULL TRIANGLE" 
		+ "\n" + "L for FULL HOLLOW TRIANGLE" + "\n" + "M for INVERTED FULL HOLLOW TRIANGLE" + "\n" + "N for HALF LEFT DIAMOND" + "\n" + "O for HALF RIGHT DIAMOND" + "\n");
		
		System.out.println("Enter figure to be displayed: ");
		String input = sc.nextLine().toUpperCase();
		
		System.out.print("Enter size of figure: ");
		int n = sc.nextInt();
		
			switch (input) {
				case "A": 
					System.out.println(Square(n));
					break;
				case "B":
					System.out.println(LeftHalfTriangle(n));
					break;
				case "C":
					System.out.println(InvertedLeftHalfTriangle(n));
					break;
				case "D":
					System.out.println(LeftHollowHalfTriangle(n));
					break;
				case "E":
					System.out.println(InvertedLeftHollowHalfTriangle(n));
					break;
				case "F":
					System.out.println(RightHalfTriangle(n));
					break;
				case "G":
					System.out.println(InvertedRightHalfTriangle(n));
					break;
				case "H":
					System.out.println(RightHollowHalfTriangle(n));
					break;
				case "I":
					System.out.println(InvertedRightHollowHalfTriangle(n));
					break;
				case "J":
					System.out.println(FullTriangle(n));
					break;
				case "K":
					System.out.println(InvertedFullTriangle(n));
					break;
				case "L":
					System.out.println(FullHollowTriangle(n));
					break;
				case "M":
					System.out.println(InvertedFullHollowTriangle(n));
					break;
				case "N":
					System.out.println(HalfLeftDiamond(n));
					break;
				case "O":
					System.out.println(HalfRightDiamond(n));
					break;
					
				}
				
	}
	
	public static String Square(int n) {
		 String figure = "";
	        for(int r=1; r<=n; r++){
	            for(int c=1; c<=n; ++c){
	            	 figure += "* ";
	            }
	            figure += "\n";
	        }
		return figure;
		
	}
	
	public static String LeftHalfTriangle(int n) {
		String figure = "";
		 for(int r=1; r<=n; r++){
	            for(int c=1; c<=r; ++c){
	                figure += "* ";
	            }
	            figure += "\n";
	        }
		return figure;
	}
	
	public static String InvertedLeftHalfTriangle(int n) {
		String figure = "";
			for(int r=n; r>=1; r--){
	           for(int c=1; c<=r; ++c){
	        	   figure += "* ";
	            }
	           figure += "\n";
	        }
		return figure;
	}
	
	public static String LeftHollowHalfTriangle(int n) {
		String figure = "";
		 for(int r=1; r<=n; r++){
	         for(int c=1; c<=r; ++c){
	             if(c==1 || r==n || c==r){
	            	 figure += "* ";
	             } else {
	            	 figure += "  ";
	             }
	         }
	         figure += "\n";
	       }
		return figure;
		
	}
	
	public static String InvertedLeftHollowHalfTriangle(int n) {
		String figure = "";
		 for(int r=n; r>=1; r--){
		       for(int c=1; c<=r; ++c){
		           if(c==1 || r==n || c==r){
		        	   figure += "* ";
		           } else {
		        	   figure += "  ";
		           }
		       }
		       figure += "\n";
		        }
		return figure;
	}
	
	public static String RightHalfTriangle(int n) {
		String figure = "";
			for(int r=1; r<=n; r++){
		       for(int s=n; s>=r; s-=1){
		           figure += "  ";
		       }
		       for(int o=1; o<=r; ++o){
		           figure += "* ";
		       }
		          figure += "\n";
		        }
		return figure;
	}
	
	public static String InvertedRightHalfTriangle(int n) {
		String figure = "";
			for(int r=n; r>=1; r--){
	           for(int s=n; s>=r; s-=1){
	        	   figure += "  ";
	           }
	           for(int o=1; o<=r; ++o){
	        	   figure += "* ";
	           }
	           figure += "\n";
	        }
			return figure;
	}
	
	public static String RightHollowHalfTriangle(int n) {
		String figure = "";
		for(int r=1; r<=n; r++){
            for(int s=n; s>=r; s-=1){
            	figure += "  ";
            }
            for(int o=1; o<=r; ++o){
                if(o==1 || r==n || o==r){
                	figure += "* ";
                } else {
                	figure += "  ";
                }
            }
            figure += "\n";
     }
		return figure;
		
	}
	
	public static String InvertedRightHollowHalfTriangle(int n) {
		String figure = "";
		 for(int r=n; r>=1; r--){
	            for(int s=n; s>=r; s-=1){
	            	figure += "  ";
	            }
	            for(int o=1; o<=r; ++o){
	                if(o==1 || r==n || o==r){
	                	figure += "* ";
	                } else {
	                	figure += "  ";
	                }
	            }
	            figure += "\n";
	        }
		return figure;
	}
	
	public static String FullTriangle(int n) {
		String figure = "";
		 for(int r=1; r<=n; r++){
	            for(int s=n; s>=r; s-=1){
	            	figure += "  ";
	            }
	            for(int o=1; o<=r*2-1; ++o){
	            	figure += "* ";
	            }
	            figure += "\n";
	        }
		return figure;
	}
	
	public static String InvertedFullTriangle(int n) {
		String figure = "";
		 for(int r=n; r>=1; r--){
	          for(int s=n; s>=r; s-=1){
	        	  figure += "  ";
	          }
	          for(int o=1; o<=r*2-1; ++o){
	        	  figure +="* ";
	          }
	          figure += "\n";
	      }
		return figure;
	}
	
	public static String FullHollowTriangle(int n) {
		String figure = "";
		for(int r=1; r<=n; r++){
		      for(int s=n; s>=r; s-=1){
		    	  figure += "  ";
		      }
		      for(int o=1; o<=r*2-1; ++o){
		          if(o==1 || r==n || o==r*2-1){
		        	  figure += "* ";
		          } else {
		        	  figure += "  ";
		          }
		      }
		      figure += "\n";
		  }
		return figure;
		
	}
	
	public static String InvertedFullHollowTriangle(int n) {
		String figure = "";
			for(int r=n; r>=1; r--){
		       for(int s=n; s>=r; s-=1){
		    	   figure += "  ";
		       }
		       for(int o=1; o<=r*2-1; ++o){
		           if(o==1 || r==n || o==r*2-1){
		        	   figure += "* ";
		           } else {
		        	   figure += "  ";
		           }
		       }
		       figure += "\n";
		  }
		return figure;
	}
	
	public static String HalfLeftDiamond(int n) {
		String figure = "";
		for(int r=1; r<=n/2; r++){
	        for(int o=1; o<=r; ++o){
	        	figure += "* ";
	        }
	        figure += "\n";
	    }
	    for(int r=n/2+1; r>=1; r--){
	        for(int o=1; o<=r; ++o){
	        	figure += "* ";
	        }
	        figure += "\n";
	     } 
		return figure;
	}
	
	public static String HalfRightDiamond(int n) {
		String figure = "";
		for(int r=1; r<=n/2; r++){
	        for(int s=n/2; s>=r; s-=1){
	        	figure += "  ";
	        }
	        for(int o=1; o<=r; ++o){
	        	figure += "* ";
	        }
	        figure += "\n";
	    }
	    for(int r=n/2+1; r>=1; r--){
	        for(int s=n/2; s>=r; s-=1){
	        	figure += "  ";
	        }
	        for(int o=1; o<=r; ++o){
	        	figure += "* ";
	        }
	        figure += "\n";
	    }
		return figure;
	}
	

}
