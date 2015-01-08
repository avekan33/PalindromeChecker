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

