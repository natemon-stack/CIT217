/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mo1404141_assignment1;

/**
 *
 * @author Nate
 */
public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;


    public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getChangePercent(){
        return((currentPrice - previousClosingPrice)/previousClosingPrice)*100;
    }

    @Override
    public String toString(){
        return"Stock: {Symbol:"+ symbol +
              "Name:"+ name +
              "Closing Price:"+ previousClosingPrice +
              "Current Price:"+ currentPrice +"}";
        
       
    }
}  

