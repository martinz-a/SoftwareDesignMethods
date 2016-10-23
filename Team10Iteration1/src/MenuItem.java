import java.util.HashMap;
import java.util.Map;

public class MenuItem 
{

	private Map <itemID, ProductDescription> descriptions = new HashMap()< itemID , ProductDescription >;
	
	public MenuItem()
	{
		itemID id1 = new itemID(100);
		itemID id2 = new itemID(200);
		Money price = new Money (3);
	
		ProductDescription desc;
		desc = new ProductDescription( id1, price, "product 1");
		descriptions.put(id1, desc);
		desc = new ProductDescription( id2, price, "product 2");
		descriptions.put(id2, desc);
	}
	
	public ProductDescription getProductDescription (itemID id)
	{
		return descriptions.get(id);
	}
	
}