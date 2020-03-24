package assignment3;
//Linh Nguyen

import algs4.StdIn;
import algs4.StdOut;

public class VowelFrequencies {
	public static boolean isVowel(char c) {//checks char if vowel
		String vCheck = "aeiouàáâãäåèéêëìíîïòóôõöùúûüAEIOUÀÁÂÃÄÅÈÉÊËÌÍÎÏÒÓÔÕÖÙÚÛÜ";
			int vC = vCheck.indexOf(c);
			if(vC!=-1) {
				return true;
			}
		return false;
	}//isVowel
	
	
	public static double charVCount(String bT) {
		int cCount = 0;
		int vCount = 0;
		char[] bTarr = bT.toCharArray();
		for(int i = 0;i<bTarr.length;i++) {//count chars in bT string  
			boolean vc = isVowel(bTarr[i]);
			boolean lcheck = Character.isAlphabetic(bT.toCharArray()[i]);//checks char if letter
			if(lcheck==true) {
				cCount++;
				if(vc==true) {
					vCount++;
				}//vc
			}//lcheck
		}//for loop
		double vperc = (double)vCount/cCount*100;
		return vperc;
	}
	
	public static void main(String[] args) {
		StdIn.fromFile("data/EnglishNovel.txt");
		String estring=StdIn.readAll();
		
		StdIn.fromFile("data/FrenchNovel.txt");
		String fstring = StdIn.readAll();
		
		StdIn.fromFile("data/GermanNovel.txt");
		String gstring = StdIn.readAll();
		
		double vPerc = charVCount(estring);
		
		double vPerc2 = charVCount(fstring);
		
		double vPerc3=charVCount(gstring);
		
		StdOut.println("EnglishNovel.txt has "+vPerc+" % vowels in the file.\n");
		StdOut.println("FrenchNovel.txt has "+vPerc2+" % vowels in the file.\n");
		StdOut.println("GermanNovel.txt has "+vPerc3+"% vowels in the file.\n");
	}
}
