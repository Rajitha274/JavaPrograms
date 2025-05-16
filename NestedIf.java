class NestedIf
{
	public static void main(String[] args)
	{
		char ch = '8';
		if( (ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
		{
			if(ch>='A' && ch<='Z') 
			{
				if( ch == 'A' || ch== 'E' || ch =='I' || ch =='O' || ch=='U')
					System.out.println("capital letter vowel");
				else
					System.out.println("capital letter consonant");
			}
			else if(ch>='a' && ch<='z')
			{
				if(ch == 'a' || ch== 'e' || ch =='i' || ch =='o' || ch=='u')
					System.out.println("small letter vowel");
				else
					System.out.println("small letter consonant");
			}

		        				
		} 
		else
			System.out.println("Not an alphabet");
	}
} 