package root;

import java.util.List;

/*
First, I wanna know how much money I could have made yesterday if I'd been trading Apple stocks all day.

So I grabbed Apple's stock prices from yesterday and put them in a list called stock_prices, where:

The indices are the time (in minutes) past trade opening time, which was 9:30am local time.
The values are the price (in US dollars) of one share of Apple stock at that time.
So if the stock cost $500 at 10:30am, that means stock_prices[60] = 500.

Write an efficient function that takes stock_prices and returns the best profit
I could have made from one purchase and one sale of one share of Apple stock yesterday.

 */
public class MaxProfitWithStockPrices {

    public static int getMaxProfit(List<Integer> prices){
        int ptr1 = 0;
        int ptr2 = 0;
        int max = 0;

        for(int i = 0; i < prices.size(); i++){
            if(prices.get(i) < prices.get(ptr1))
                ptr1 = i;
            else if (prices.get(i) > prices.get(ptr2))
                ptr2 = i;

            if(ptr1 > ptr2)
                ptr2 = ptr1;

            max = Math.max(max, (prices.get(ptr2) - prices.get(ptr1)));
        }
        return max;
    }
}
