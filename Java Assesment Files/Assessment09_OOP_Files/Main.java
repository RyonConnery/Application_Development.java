void main() {
    // Create an array that holds three Stock objects.
    Stock[] stockArray = new Stock[3];

    // Store a different Stock object in each array element.
    stockArray[0] = new Stock("MSFT", "Microsoft Corporation", 512.45, 505.20);
    stockArray[1] = new Stock("AAPL", "Apple Inc.", 229.15, 226.80);
    stockArray[2] = new Stock("AMZN", "Amazon.com, Inc.", 214.75, 218.40);

    // Create an ArrayList that stores Stock objects.
    java.util.ArrayList<Stock> stockList = new java.util.ArrayList<>();

    // Add three different Stock objects to the ArrayList.
    stockList.add(new Stock("GOOGL", "Alphabet Inc.", 201.90, 199.55));
    stockList.add(new Stock("NVDA", "NVIDIA Corporation", 181.25, 176.80));
    stockList.add(new Stock("META", "Meta Platforms, Inc.", 762.30, 770.10));

    // Use a standard for loop to print each Stock object in the array.
    System.out.println("Stocks Stored in the Array");
    System.out.println("==========================");

    for (int index = 0; index < stockArray.length; index++) {
        System.out.println(stockArray[index]);
        System.out.println();
    }

    // Use an enhanced for loop to print each Stock object in the ArrayList.
    System.out.println("Stocks Stored in the ArrayList");
    System.out.println("==============================");

    for (Stock stock : stockList) {
        System.out.println(stock);
        System.out.println();
    }
}
