package improvedJAVA;

import org.eclipse.jdt.annotation.NonNull;

public class nonNull 
{
	public static void main(String[] s)
	{
		new nonNull();
	}
	
	public nonNull(){
		String[] s = null;
		printString(s);
	};
	
	public void printString(@NonNull String[] s){
		System.out.println(s[0].toLowerCase());
	}
	
}
