import java.io.File;
class fil
{
	public static void main(String[]args)
	{
		try
		{
			File r=new File("C:\\Users\\mass tamilan\\Desktop\\java\\loop\\Arun.txt");
			if(r.createNewFile())
			{
				System.out.println("fil create");
			}
			else
			{
				System.out.println("fil already exist");
		}}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
}		