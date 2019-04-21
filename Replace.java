
public class Replace {
	
	public void find(String msg, String lookfor, String replace)
	{
		int i;
		
		i = 0;
		
		String newString = "";
		
		for (; i < msg.length(); )
		{
			if (msg.substring(i, i + 1).equals(lookfor.substring(0, 1)) && (i + lookfor.length()) <= msg.length()) //first letter match
			{
				if (msg.substring(i, i + lookfor.length()).equals(lookfor)) //word match
				{			
					newString = newString + replace;
					
					i = i + lookfor.length();
				}
				else
				{
					newString = newString + msg.substring(i, i + 1);
					i++;
				}
			}
			else
			{
				newString = newString + msg.substring(i, i + 1);
				i++;
			}
			
			
			
			
			
			
			
			
		}
		
		System.out.println(newString);
	}

}
