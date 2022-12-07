import java.util.ArrayList;
import java.util.List;

public class NicePerson implements NicePersonInterface 
{
	// create private variables 
	private Name name;
	private List<String> presents;
	// create constructor 
	public NicePerson()
	{
		presents = new ArrayList<>();
	}
	
	@Override
	public Name getName() 
	{
		return name;
	}

	@Override
	public List<String> getPresent() 
	{
		return presents;
	}

	@Override
	public void setName(Name n) 
	{
		
		name = n;
		
	}

	@Override
	public void setPresent(String gift) 
	{
		presents.add(gift);
	}
	
	@Override
	public String toString()
	{
		String output = "";
		output += name.toString();
		output += "\nPresents:\n";
		for (String str : presents)
		{
			output+= str + " ";
		}
		return output;
				
	}

	
}
