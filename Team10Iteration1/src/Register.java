
public class Register {

	private MenuItem menuItem;
	private Sale currentSale;
	
	public Register ( MenuItem menuItem)
	{
		this.menuItem = menuItem;
	}
	
	public void endSale()
	{
		currentSale.becomeComplete();	
	}
	
	public void enterItem( itemID id, int quantity)
	{
		ProductDescription desc = menuItem.getProductDescription (id);
		currentSale.makeLineItem ( desc,quantity);
	}
	
	public void makePayment (Money cashTendered)
	{
		currentSale.makePayment (cashTendered);
	}
	
}
