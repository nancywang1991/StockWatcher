package com.google.gwt.sample.stockwatcher.client;

public class StockPrice {
	  private String symbol;
	  private double price;
	  private double change;

	  public StockPrice() {
	  }

	  public StockPrice(String symbol, double price, double change) {
	    this.symbol = symbol;
	    this.price = price;
	    this.change = change;
	  }

	  public String getSymbol() {
	    return this.symbol;
	  }

	  public double getPrice() {
<<<<<<< HEAD
		  return 0;
=======
	    return 57;
>>>>>>> ebec359e1f3fda5f140ebe98cb1ad6376b7e91ed
	  }

	  public double getChange() {
	    return this.change;
	  }

	  public double getChangePercent() {
	    return 100 * this.price/this.change;
	  }

	  public void setSymbol(String symbol) {
	    this.symbol = symbol;
	  }

	  public void setPrice(double price) {
	    this.price = price;
	  }

	  public void setChange(double change) {
	    this.change = change;
	  }

}
