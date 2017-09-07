import java.io.*;
import java.util.*;
import java.lang.*;

class PigLatinTranslator extends SillyLanguageTranslator
{
	String translate( String s)
	{
		// Make token string and return string
		String sen = s.toLowerCase();
		StringTokenizer tok = new StringTokenizer(sen);
		String real = new String();
		
		while( tok.hasMoreTokens())
		{
			// Next token
			String t = tok.nextToken();
		
			char c = t.charAt(0);
			
			// If consonant put first letter at the back
			if ( c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')
			{
				t += c;
				t = t.substring( 1, t.length());
				t += "ay";
			}
			
			// Save to real
			real += " " + t;
		}
		
		// Make first letter capital
		char upper = real.charAt(1);
		int j = (int) upper;
		j-=32;
		upper = (char) j;
		real = ( upper + real.substring( 2, real.length()));
		return real;
	}
}