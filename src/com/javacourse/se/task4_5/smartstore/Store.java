package com.javacourse.se.task4.smartstore;

import com.javacourse.se.task4.smartinterface.Smart;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Store<T extends Smart> {

  private T item;
  private double cash;
  private T[] products;
  private int count;

  public Store(T[] products) {
    cash = (int) (Math.random() * 1000 + 1000);
    this.products = products;
    count = products.length;
  }

  public void printProducts() {
    if (products != null) {
      for (int i = 0; i < count; i++) {
        System.out.println(i + ". " + products[i]);
        item = products[i];
      }
    } else {
      System.out.println("The store is empty");
    }
  }

  public boolean purchase(double amountOfMoney) {
    Scanner scanner = new Scanner(System.in);
    int numberOfProduct;
    do {
      System.out.println("Select a product to buy: ");
      numberOfProduct = scanner.nextInt();
    } while (numberOfProduct < 0 || numberOfProduct > count - 1);
    item = products[numberOfProduct];
    if (amountOfMoney >= item.getPrice()) {
      deleteProduct(numberOfProduct);
      cash += item.getPrice();
      return true;
    }
    return false;
  }

  public boolean sell(T item) {
    Scanner scanner = new Scanner(System.in);
    int sellingPrice;
    do {
      System.out.println("Offer a selling price: ");
      sellingPrice = scanner.nextInt();
      if (cash < sellingPrice) {
        System.out.println("Not enough money");
      }
    } while (sellingPrice > item.getPrice() || sellingPrice > cash);
    addProduct(item);
    cash -= sellingPrice;
    return true;
  }

  private int deleteProduct(int numberOfProduct) {
    for (int i = numberOfProduct; i < count - 1; i++) {
      products[i] = products[i + 1];
    }
    return count--;
  }

  private int addProduct(T item) {
    products[count] = item;
    return count++;
  }

  public void setCash(double cash) {
    this.cash = cash;
  }

  public double getCash() {
    return cash;
  }

  public T[] getProducts() {
    return products;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Store<?> store = (Store<?>) o;
    return Double.compare(store.cash, cash) == 0 && count == store.count
        && Objects.equals(item, store.item) && Arrays
        .equals(products, store.products);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(item, cash, count);
    result = 31 * result + Arrays.hashCode(products);
    return result;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Store{");
    sb.append("item=").append(item);
    sb.append(", cash=").append(cash);
    sb.append(", products=")
        .append(products == null ? "null" : Arrays.asList(products).toString());
    sb.append(", count=").append(count);
    sb.append('}');
    return sb.toString();
  }
}


