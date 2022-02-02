package class9;

public class GithubCreateRepoPojoHelper {
	
	public static GithubCreateRepoPojo getObj(String name,String description)
	{
		GithubCreateRepoPojo obj1 = new GithubCreateRepoPojo();
		obj1.setName(name);
		obj1.setDescription(description);
		return obj1;
		
	}
	
	public static GithubCreateRepoPojo getObj(String name,String description,boolean privateVal)
	{
		GithubCreateRepoPojo obj1 = new GithubCreateRepoPojo();
		obj1.setName(name);
		obj1.setDescription(description);
		obj1.setPrivateVal(privateVal);
		return obj1;
		
	}
	
	
}
