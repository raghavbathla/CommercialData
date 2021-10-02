package commercialData;

import java.util.ArrayList;
import java.util.Scanner;

public class StockAccountClass implements  StockAccount{

ArrayList<Operations> arrayList = new ArrayList<>();

    @Override
    public double valueOf( ArrayList<Stock> list) {
        System.out.println("Enter the name of company");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double value = 0;
        for (int i = 0; i < list.size(); i++) {
if(list.get(i).getShareName().equals(name)) {

    value = list.get(i).getTotalValue();
    break;
}
        }
        return  value;
    }

    @Override
    public void buy(int amount, String symbol, ArrayList<Stock> list) {

        System.out.println("Enter the name of company");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int price = 0;
        int totalShare = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getShareName().equals(name)) {
                totalShare = list.get(i).getNumberOfShare();
                price = list.get(i).getSharePrice();
                break;
            }
            int numShare = amount / price;
            int newshare = totalShare - numShare;

            for (i = 0; i < list.size(); i++) {
                if (list.get(i).getShareName().equals(name)) {
                    list.get(i).setNumberOfShare(newshare);
                    break;
                }


            }
            arrayList.add(new Operations(amount,symbol,numShare));
        System.out.println("Share Buyed Successfully");
        }
    }

    @Override
    public void sell(int amount, String symbol, ArrayList<Stock> list) {
        System.out.println("Enter the name of company");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int price = 0;
        int totalShare = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getShareName().equals(name)) {
                System.out.println("Delk");
                totalShare = list.get(i).getNumberOfShare();
                price = list.get(i).getSharePrice();
                break;
            }
            int numShare = amount / price;
            int newshare = totalShare + numShare;

            for (i = 0; i < list.size(); i++)
            {
                if (list.get(i).getShareName().equals(name)) {
                    list.get(i).setNumberOfShare(newshare);
                    break;
                }


            }

          System.out.println("Sold Successfully");
        }
    }


    @Override
    public void printReport(ArrayList<Stock> stocks) {
                for (int i = 0; i < stocks.size(); i++) {
            System.out.println("");
            System.out.println("Company Name:" + stocks.get(i).getShareName());
            System.out.println("Number of Shares:" + stocks.get(i).getNumberOfShare());
            System.out.println("Share Prices: " + stocks.get(i).getSharePrice());
            System.out.println("Total Vale: " + stocks.get(i).getTotalValue());
        }

    }
}
