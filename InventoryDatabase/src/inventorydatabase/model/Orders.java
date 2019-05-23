package inventorydatabase.model;

public class Orders {
	private String id;
	private String itemcode;
	private String description;
	private String quantity;
	private String priceperitem;

	public Orders(String id, String itemcode, String description, String quantity, String priceperitem) {
		super();
		this.id = id;
		this.itemcode = itemcode;
		this.description = description;
		this.quantity = quantity;
		this.priceperitem = priceperitem;
	}

	public Orders() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getItemcode() {
		return itemcode;
	}

	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getPriceperitem() {
		return priceperitem;
	}

	public void setPriceperitem(String priceperitem) {
		this.priceperitem = priceperitem;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", itemcode=" + itemcode + ", description=" + description + ", quantity=" + quantity
				+ ", priceperitem=" + priceperitem + "]";
	}

}
