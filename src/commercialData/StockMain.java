package commercialData;

import java.util.ArrayList;
import java.util.Scanner;

public class StockMain {
    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<Stock> portfolio = new ArrayList();
        System.out.println("Enter the Number of stocks");
        StockAccountClass stockAccountClass = new StockAccountClass();
        Scanner scanner = new Scanner(System.in);
        int numOfStocks = scanner.nextInt();
        StockManagementClass stockManagementClass = new StockManagementClass(numOfStocks);
        portfolio = stockManagementClass.getValue();
while (flag){
    System.out.println("Enter the Option");
    System.out.println("1-Buy,2-Sell,3-Print,4-ValueOf,5-Exit");
    int num = scanner.nextInt();
    switch (num){
        case 1:
            System.out.println("Enter amount and symbol");
            int amount = scanner.nextInt();
            scanner.nextLine();
            String sym = scanner.nextLine();
            stockAccountClass.buy(amount,sym,portfolio);
            break;
        case 2:
            System.out.println("Enter amount and symbol");
            int amount2 = scanner.nextInt();
            scanner.nextLine();
            String sym2 = scanner.nextLine();
            stockAccountClass.sell(amount2,sym2,portfolio);
            break;
        case 3:
            stockAccountClass.printReport(portfolio);
            break;
        case 4:
        System.out.println(stockAccountClass.valueOf(portfolio));
            break;
        case 5:
            flag = false;
            System.out.println("Exit Successfully");
            break;
    }


}
//        for (int i = 0; i < portfolio.size(); i++) {
//            System.out.println("");
//            System.out.println("Company Name:" + portfolio.get(i).getShareName());
//            System.out.println("Number of Shares:" + portfolio.get(i).getNumberOfShare());
//            System.out.println("Share Prices: " + portfolio.get(i).getSharePrice());
//            System.out.println("Total Vale: " + portfolio.get(i).getTotalValue());
//        }
    }

}
