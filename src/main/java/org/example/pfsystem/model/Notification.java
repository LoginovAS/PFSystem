package org.example.pfsystem.model;

public class Notification {

    private String presentType;
    private int quantity;

    public Notification() {

    }

    public Notification(String presentType, int quantity) {
        this.presentType = presentType;
        this.quantity = quantity;
    }

    public String getPresentType() {
        return presentType;
    }

    public void setPresentType(String presentType) {
        this.presentType = presentType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
