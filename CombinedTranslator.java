import java.io.*;
import java.util.*;
import java.lang.*;

public class CombinedTranslator extends SillyLanguageTranslator
{
	public CombinedTranslator()
	{
		translator1 = new SillyLanguageTranslator();
		translator2 = new SillyLanguageTranslator();
	}
	
	public CombinedTranslator(SillyLanguageTranslator s1, SillyLanguageTranslator s2)
	{
		translator1 = s1;
		translator2 = s2;
	}
	
	public String translate(String s)
	{
		String step1 = translator2.translate(s);
		String step2 = translator1.translate(step1);
		return step2;
	}
	
	private SillyLanguageTranslator translator1;
	private SillyLanguageTranslator translator2;
}
