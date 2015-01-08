import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class PalindromeChecker extends PApplet {

public void setup()
{
  String lines[] = loadStrings("palindromes.txt");
  println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      println(lines[i] + " IS a palidrome.");
    }
    else
    {
      println(lines[i] + " is NOT a palidrome.");
    }
  }
}
public boolean palindrome(String word)
{
  //your code here
  //print(word+": ");
  word = word.toLowerCase();
  for(int i = 0;i<word.length();i++)
  {
  	if(word.charAt(i)==' ')
  	{
  		word = word.substring(0,i) + word.substring(i+1);
  		i--;
  	}
  	else if(word.substring(i,i+1).equals(","))
  	{
  		word = word.substring(0,i) + word.substring(i+1);
  		i--;
  	}
  	else if(word.charAt(i)=='!')
  	{
  		word = word.substring(0,i) + word.substring(i+1);
  		i--;
  	}
  	else if(word.charAt(i)=='.')
  	{
  		word = word.substring(0,i) + word.substring(i+1);
  		i--;
  	}
  	else if(word.substring(i,i+1).equals("'"))
  	{
  		word = word.substring(0,i) + word.substring(i+1);
  		i--;
  	}
  }
  //println(word);
  String test = "";
  for(int i = word.length()-1;i>=0;i--)
  {
  	test = test + word.substring(i,i+1);
  }
  if(test.equals(word))
  {
  	return true;
  }
  else
  {
  	return false;
  }
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "PalindromeChecker" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
