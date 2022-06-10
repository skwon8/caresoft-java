public class Program
{
	public static void main(String[] args)
	{
		Physician doctor10 = new Physician(1);
		AdminUser roseTyler = new AdminUser(2, "Companion");
		AdminUser donnaNoble = new AdminUser(3, "Companion");

		// Physician Implementation Tests
		System.out.println("\n==</span>======== Physician Tests ==========\n");
		String pinTest1 = doctor10.AssignPin(42)? "FAIL" : "PASS";
		System.out.printf("Physician pin assign test 1: %s\n", pinTest1);

		String pinTest2 = doctor10.AssignPin(4000)? "PASS" : "FAIL";
		System.out.printf("Physician pin assign test 2: %s\n", pinTest2);

		String authTest1 = doctor10.Authorize(1234)? "FAIL" : "PASS";
		System.out.printf("Physician auth test 1: %s\n", authTest1);

		String authTest2 = doctor10.Authorize(1)? "PASS" : "FAIL";
		System.out.printf("Physician auth test 2: %s\n", authTest2);

		// AdminUser Implementation Tests
		System.out.println("\n========== AdminUser Tests ==========\n");
		String pinTest3 = roseTyler.AssignPin(42)? "FAIL" : "PASS";
		System.out.printf("Admin pin assign test 1: %s\n", pinTest3);

		String pinTest4 = roseTyler.AssignPin(424242)? "PASS" : "FAIL";
		System.out.printf("Admin pin assign test 2: %s\n", pinTest4);

		String authTest3 = roseTyler.Authorize(1234)? "FAIL" : "PASS";
		System.out.printf("Admin auth test 1: %s\n", authTest3);

		String authTest4 = roseTyler.Authorize(1234)? "FAIL" : "PASS";
		System.out.printf("Admin auth test 1: %s\n", authTest4);

		String authTest5 = roseTyler.Authorize(2)? "PASS" : "FAIL";
		System.out.printf("Admin auth test 2: %s\n\n", authTest5);

		donnaNoble.Authorize(42);
		donnaNoble.Authorize(4321);
		donnaNoble.Authorize(7);
		donnaNoble.Authorize(28);

		System.out.println(donnaNoble.Report());

	}	
};