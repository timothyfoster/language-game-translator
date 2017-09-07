import java.io.*;
import java.util.*;
import java.lang.*;

public class Main
{
    public static void main( String args[])
    {
		String input = readInput();
		
		PigLatinTranslator pl = new PigLatinTranslator();
		UbbiDubbiTranslator ud = new UbbiDubbiTranslator();
		CombinedTranslator ct = new CombinedTranslator(pl, ud);
		
		
		System.out.println( pl.translate( input));
		System.out.println( ud.translate( input));
		System.out.println( ct.translate( input));
    }
	
	public static String readInput()
	{
		System.out.println( "Please enter a simple sentence:");
		Scanner input = new Scanner( System.in);
		String sen = input.nextLine();
		return sen;
	}
}