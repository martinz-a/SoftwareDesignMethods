
public class CoronaryCastleRestaurant {

	private MenuItem menuItem = new MenuItem();
	private Register register = new Register (menuItem);
	
	public Register getRegister()
	{
		return register;
	}
}
