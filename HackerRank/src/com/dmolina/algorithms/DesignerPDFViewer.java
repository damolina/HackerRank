package com.dmolina.algorithms;

public class DesignerPDFViewer {

	public static void main(String[] args) {
		int[] h = {1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
		String word = "abc";
		int mm2 = designerPdfViewer(h, word);
		System.out.println("mm2: " + mm2);
	}
	
   static int designerPdfViewer(int[] h, String word) {
	   int mm2 = -1;
	   String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	   String[] s = word.split("");
	   
	   for(int i =0;i<s.length;i++) {
		   for(int j =0;j<alphabet.length;j++) {
			   if(s[i].equalsIgnoreCase(alphabet[j])) {
				   if(h[j] > mm2) {
					   mm2 = h[j];
				   }
			   }
		   }
	   }
	   return word.length()*mm2;
    }

}
