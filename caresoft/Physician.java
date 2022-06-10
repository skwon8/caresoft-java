public class Physician extends User implements IUser
{
	public Physician(Integer id)
	{
		super(id);
	}
	
	public Boolean AssignPin(Integer pin)
	{
		if(pin<1000&&pin>9999)
		{
			System.out.println("Pin must be at least 4 digits.");
			return false;
		}
		this.pin=pin;
		return true;
	}

	public Boolean Authorize(Integer pin)
	{
		return this.pin==pin;
	}
};