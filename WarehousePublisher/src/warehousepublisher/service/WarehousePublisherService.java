package warehousepublisher.service;

import java.util.List;

import inventorydatabase.model.Stock;

public interface WarehousePublisherService {
	public void addStock(Stock stock);

	public void listStocks();

	public void findByStockId(String id);

	public String deleteStock(String id);
}
