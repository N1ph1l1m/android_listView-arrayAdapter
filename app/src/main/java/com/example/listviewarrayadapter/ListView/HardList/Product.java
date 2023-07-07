package com.example.listviewarrayadapter.ListView.HardList;

public class Product {

    private String nameProd;
    private int count;
    private String unit;

    public Product(String name,String unit) {
        this.nameProd = name;
        this.count = 0;
        this.unit = unit;
    }

    public String getNameProd() {
        return nameProd;
    }

    public void setNameProd(String nameProd) {
        this.nameProd = nameProd;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
