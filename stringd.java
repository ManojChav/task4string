package com.stringdemo.task4;

public class stringd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is a java class";
		System.out.println("number of words in given string :"+s.split(" ").length);
		System.out.println("length of given string :"+s.length());
		
		int NumofSingleCharInStrng =0;
		String revwrd ="";
	    String revstrng ="";
	    String StrChar[]=s.split(" ");
	    for(String str : s.split(" ")){
	    	
	    if(!revwrd.equals("")){
	    revwrd += " ";
	    }
	    if(str.length() ==1){
	    	NumofSingleCharInStrng++;
	    }
	    char cr[]=str.toCharArray();
	    String strr = "";
	    for(int j= str.length()-1;j>=0;j--){
	    	strr +=cr[j];
	    }
	    revwrd += strr;
	    }
	    System.out.println("number of words with single characters :" +NumofSingleCharInStrng);
	    System.out.println("reverse each word is: "+revwrd);
	    for(int i=StrChar.length-1;i>=0;i--){
	    	if(!revstrng.equals("")){
	    		revstrng+= " ";
	    	}
	    	char ch[] =StrChar[i].toCharArray();
	    	String strng="";
	    	for(int j=StrChar[i].length()-1;j>=0;j--){
	    		strng+= ch[j];
	    	}
	    	revstrng+=strng;
	    }
	   System.out.println("entire string reverse is :"+revstrng); 
	   System.out.println("replacing java with SQL: "+s.replace("java", "SQL"));
	   System.out.println("letter at center :"+s.charAt(s.length()/2));
	   System.out.println("index of letter j :" +s.indexOf("j"));
	  
	   char cha[]=s.toCharArray();
	   char letr[]= new char[cha.length];
	   int cnt[]= new int [cha.length];
	   int nxtindcnt =0;
	   for(int i=0;i<cha.length;i++){
		   int letrcnt =1;
		   for(int j=i+1;j<cha.length;j++){
			   if (cha[i]==cha[j]){
				   letrcnt++;
			   }
		   }
		   String sta = new String(letr);
		   if(cha[i]!=' '&&!sta.contains(String.valueOf(cha[i]))){
			   letr[nxtindcnt]=cha[i];
			   cnt[nxtindcnt]=letrcnt;
			   nxtindcnt++;   
		   }
	   }
	   System.out.println("number of times each letter in string repeated :");
	   for(int i=0;i<nxtindcnt;i++){
		   System.out.println("number of times " +letr[i]+ " repeated is "+cnt[i]);
	   }
	   System.out.println("letters which are not repeated in the given string: ");
	   for(int i=0;i<nxtindcnt;i++){
		   if(cnt[i]==1){
			   System.out.println(letr[i]);
		   }
	   }
	   System.out.println("index of each word :");
	   int ind =0;
	   for (String strg:s.split(" ")){
		   System.out.println("index of " +strg + " is " +s.indexOf(strg,ind));
		   ind += strg.length();
	   }
	   System.out.println("convering to upper case :" +s.toUpperCase());
	}

}
