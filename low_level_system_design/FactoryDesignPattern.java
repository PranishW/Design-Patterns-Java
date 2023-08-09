package low_level_system_design;
// An example of Factory Design Pattern
interface Developer
{
	public void developerInfo();
}
class BlockChainDeveloper implements Developer
{
	@Override
	public void developerInfo() {
		// TODO Auto-generated method stub
		System.out.println("BlockChain Developer Salary : Rs 15.73 LPA");
	}
}
class WebDeveloper implements Developer
{
	@Override
	public void developerInfo() {
		// TODO Auto-generated method stub
		System.out.println("Web Developer Salary : Rs 12.73 LPA");
	}
}
class AndroidDeveloper implements Developer
{
	@Override
	public void developerInfo() {
		// TODO Auto-generated method stub
		System.out.println("Android Developer Salary : Rs 11.54 LPA");
	}
}
class FactoryDesign
{
	public static Developer getDeveloper(String developer)
	{
		if(developer.equalsIgnoreCase("Android Developer"))
			return new AndroidDeveloper();
		if(developer.equalsIgnoreCase("BlockChain Developer"))
			return new BlockChainDeveloper();
		if(developer.equalsIgnoreCase("Web Developer"))
			return new WebDeveloper();
		return null;
	}
}
public class FactoryDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer obj = FactoryDesign.getDeveloper("Android Developer");
		obj.developerInfo();
		obj = FactoryDesign.getDeveloper("BlockChain Developer");
		obj.developerInfo();
		obj = FactoryDesign.getDeveloper("Web Developer");
		obj.developerInfo();
	}

}
