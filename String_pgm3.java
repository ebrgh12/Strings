/*
Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.

nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce"
*/
public String nTwice(String str, int n) {
  int len= str.length();
  String str1=str.substring(0,n);
  String str2=str.substring(len-n,len);
  str=str1+str2;
  return str;
}
