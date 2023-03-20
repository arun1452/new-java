class lov
{
	public static void  main(String[]args)
	{
		StringBuffer sb=new StringBuffer("arun");
		StringBuffer s=new StringBuffer("");
		int n=sb.length();
		for(int i=n-1;i>=0;i--)
		{
			s=s.append(sb.charAt(i));
		}
		System.err.println(s);
}}
		