import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements IUser,IAdmin
{
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
	public AdminUser(Integer id,String role)
	{
		super(id);
		this.role=role;
		this.securityIncidents=new ArrayList<String>();
	}

	public ArrayList<String> Report()
	{
		return securityIncidents;
	}

	public Boolean AssignPin(Integer pin)
	{
		if(pin<100000&&pin>999999)
		{
			System.out.println("Pin must be at least 6 digits.");
			return false;
		}
		return true;
	}

	public Boolean Authorize(Integer pin)
	{
		if(this.id==pin)
		{
			return true;
		}
		else
		{
			authIncident();
			return false;
		}
	}

    public void newIncident(String notes)
	{
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }

    public void authIncident()
	{
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
};