import java.util.ArrayList;

public interface IAdmin
{
	public ArrayList<String> Report();

	public default void Log()
	{
		System.out.println(Report());
	}

	public default Boolean Test(ArrayList<String> expectedIncidents)
	{
        if (Report().equals(expectedIncidents)) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }
        return Report().equals(expectedIncidents);
	}
};
