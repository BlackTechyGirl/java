package tdd.checkOrder;

import java.util.ArrayList;

public class Receipt {
    private ArrayList<CheckOrder> receipt = new ArrayList<>();
    public void add(CheckOrder order) {
        receipt.add(order);
    }

    public void display(){
        for(CheckOrder order : receipt){
            System.out.println(order);
        }
    }
}
