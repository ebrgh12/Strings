/*  Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.

atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@" */

public String atFirst(String str)
{String s="";
 int len=str.length();
if(len<1){
   str=str+"@"+"@";
 }
else if(len<2){
   str=str+"@";
 }
  
 str=str.substring(0,2);
 return str;
}
