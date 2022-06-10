public class User
{
	protected Integer id;
	protected Integer pin;

	public User(Integer id)
	{
		this.id=id;
	}

	public void SetId(Integer _id)
	{
		id=_id;
	}

	public Integer GetId()
	{
		return id;
	}

	public void SetPin(Integer pin)
	{
		this.pin=pin;
	}

	public Integer GetPin()
	{
		return pin;
	}
};