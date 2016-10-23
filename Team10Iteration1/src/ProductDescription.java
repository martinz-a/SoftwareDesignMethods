
public class ProductDescription {

	private itemID id;
	private Money price;
	private String description;
	
	public ProductDescription( itemID id , Money price, String description)
	{
		this.id = id;
		this.price = price;
		this.description = description;
		
	}
	
	public itemID getItemID()
	{
		return id;
	}
	
	public Money getPrice()
	{
		return price;
	}
	
	
	public String getDescription()
	{
		return description;
	}
}
