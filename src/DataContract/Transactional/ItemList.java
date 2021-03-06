package maxiPago.DataContract.Transactional;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class ItemList {
	
	@XStreamAsAttribute 
	private int itemCount;
		
    @XStreamImplicit
	private List<Item> item;
	
	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	

	

	
	
}
