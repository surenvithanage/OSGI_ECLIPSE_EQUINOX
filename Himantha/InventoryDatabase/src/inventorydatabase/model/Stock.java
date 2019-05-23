package inventorydatabase.model;

public class Stock {
	String id;
	String description;
	String quantity;
	String pricePerStock;
	String totalCost;

	public Stock(String id, String description, String quantity, String pricePerStock, String totalCost) {
		super();
		this.id = id;
		this.description = description;
		this.quantity = quantity;
		this.pricePerStock = pricePerStock;
		this.totalCost = totalCost;
	}

	public Stock() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getPricePerStock() {
		return pricePerStock;
	}

	public void setPricePerStock(String pricePerStock) {
		this.pricePerStock = pricePerStock;
	}

	public String getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(String totalCost) {
		this.totalCost = totalCost;
	}

}
