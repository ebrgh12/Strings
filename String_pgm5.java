/*Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.

hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false */

public boolean hasBad(String str) 
{
  int len = str.length();
  String str1,str2,str3;
  
  if(len<3)
  {
  return false;
  }
  else if(len>=3)
  {
   str1=str.substring(0,3);
   str2=str.substring(1,4);
   str3="bad";  
   
   if(str1.compareTo(str3)==0)
  {
    return true;
  }
  else if(str2.compareTo(str3)==0)
  {
  return true;
  }
  
}