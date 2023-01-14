package root;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

class StockPrice {

	private HashMap<Integer, Integer> timestampRecords;
	private TreeSet<Integer> sortedValues;
	private int currentTimestamp;

	public StockPrice() {
		timestampRecords = new HashMap<>();
		sortedValues = new TreeSet<>();
	}

	public void update(int timestamp, int price) {
		Integer oldValue = timestampRecords.get(timestamp);
		Integer newValue = price;

		currentTimestamp = Integer.max(currentTimestamp, timestamp);

		if(sortedValues.size() > 0 && (sortedValues.last().equals(oldValue) || sortedValues.first().equals(oldValue))){
			sortedValues.remove(oldValue);
		}

		sortedValues.add(newValue);
		timestampRecords.put(timestamp, newValue);
	}

	public int current() {
		return timestampRecords.get(currentTimestamp);
	}

	public int maximum() {
		return sortedValues.last();
	}

	public int minimum() {
		return sortedValues.first();
	}

}

/**
 * Your StockPrice object will be instantiated and called as such:
 * StockPrice obj = new StockPrice();
 * obj.update(timestamp,price);
 * int param_2 = obj.current();
 * int param_3 = obj.maximum();
 * int param_4 = obj.minimum();
 */
