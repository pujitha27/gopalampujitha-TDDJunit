package com.epam.TDD_JUNIT;

public class RemoveAJunit{

	public String remove(String str) {
		// TODO Auto-generated method stub
String result=str;
		
if(str.equals("A")||str.equals("AA")||str.equals(""))
{
	result="";
}

else{
    
    
    if(str.charAt(0)=='A'&& str.charAt(1)=='A') {
    	   result=str.substring(2,str.length());
       }
   
    
      else if(str.charAt(0)=='A') {
	          result=str.substring(1,str.length());
        }
 
       else if(str.charAt(1)=='A'){
    	   result=str.charAt(0)+str.substring(2);
       }
      
 
}
		
		return result;
	}

}
