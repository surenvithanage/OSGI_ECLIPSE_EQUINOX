package warehousepublisher.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import inventorydatabase.model.Stock;
import inventorydatabase.service.InventoryService;
import inventorydatabase.serviceimpl.InventoryServiceImpl;
import warehousepublisher.service.WarehousePublisherService;

public class WarehousePublisherServiceImpl implements WarehousePublisherService {

	InventoryService servicedetails = new InventoryServiceImpl();

	@Override
	public void addStock(Stock stock) {
		servicedetails.addStock(stock);
	}

	@Override
	public void listStocks() {
		List<Stock> stock = new ArrayList<>();
		int i = 0;
		stock = servicedetails.listStocks();
		while (stock != null) {
			System.out.println("Stock Id : " + stock.get(i).getId());
			System.out.println("Stock Description : " + stock.get(i).getDescription());
			System.out.println("Stock Quantity : " + stock.get(i).getQuantity());
			System.out.println("Stock Price Per Item : " + stock.get(i).getPricePerStock());
			System.out.println("Stock Total Cost : " + stock.get(i).getTotalCost());
			i++;
		}
	}

	@Override
	public void findByStockId(String id) {
		Stock stock = new Stock();
		stock = servicedetails.findByStockId(id);
		if (stock != null) {
			System.out.println("Stock Id : " + stock.getId());
			System.out.println("Stock Description : " + stock.getDescription());
			System.out.println("Stock Quantity : " + stock.getQuantity());
			System.out.println("Stock Price Per Item : " + stock.getPricePerStock());
			System.out.println("Stock Total Cost : " + stock.getTotalCost());
		}
	}

	@Override
	public String deleteStock(String id) {
		return servicedetails.deleteStock(id);
	}

}
