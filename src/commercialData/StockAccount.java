package commercialData;

import java.util.ArrayList;

public interface StockAccount {
    double valueOf( ArrayList<Stock> list);
   void buy(int amount, String symbol,ArrayList<Stock> list);
   void sell(int amount, String symbol,ArrayList<Stock> list);
   void printReport(ArrayList<Stock> stocks);
}
