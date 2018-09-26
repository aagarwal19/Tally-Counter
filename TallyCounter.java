/**
 * 
 * @author Arun Agarwal Pd. 7
 *
 */
public class TallyCounter 
{
	// Instance variable
	
	private int count; 
	//Constructor: starting at 0; no return type and same name as class 
	
	public TallyCounter() 
	{ 
		count = 0;
	}
	//Constructor: starting at any number of choice 
	
	public TallyCounter(int startNum) 
	{ 
		count = startNum; 
	} 
	//Constructor: clicker 
	
	public void click() 
	{ 
		count = count + 1;
		// could also do count++
		//could also do count+=1
		//could also do count+=37
		//could also do count-- to subtract one
		//could also do count *5 to multiply count by 5
	}
	public void reset()
	{
		if(count>999)
		count=0;
	}
	public int getCount()
	{
		return count;
	}
	public void unclick()
	{
		count = count - 1;
		// could also write count--
	}
	public String toString()
	{
		return "count: " + count; 
	}
}
