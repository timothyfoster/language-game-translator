import java.io.*;
import java.util.*;
import java.lang.*;

public class UbbiDubbiTranslator extends SillyLanguageTranslator
{
	public static boolean isVowel( char c)
	{
		if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			return true;
		else return false;
	}

	public String translate( String s)
	{
		// Make token string and return string
		String sen = s.toLowerCase();
		StringTokenizer tok = new StringTokenizer(sen);
		String real = new String();
		String temp = new String();
		
		while( tok.hasMoreTokens())
		{
			// Get the next token
			String t = tok.nextToken();
		
			// If the first letter is not a vowel
			for( int i=0; i<t.length(); i++)
			{
				// If the first letter is a vowel just add ub to the front of the word
				char letter = t.charAt(i);
				
				if( isVowel( letter) && i==0)
						real += "ub" + letter;
				else
				{		
					// Add ub before the letter which may be in the middle of the word
					if( isVowel( letter) && !isVowel( t.charAt(i-1)))
						real += "ub" + letter;
				}

				if ( !(isVowel( letter) && i==0) && !(isVowel( letter) && !isVowel( t.charAt(i-1))))
					real += letter;
			}
			// Append space to real
			real += " ";
		}
		
		// Make first letter capital
		char upper = real.charAt(0);
		int j = (int) upper;
		j-=32;
		upper = (char) j;
		real = ( upper + real.substring( 1, real.length()));
		return real;
	}
}