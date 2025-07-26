package org.example;

 enum Coffee {
     EXPPRESSO(100), LATTE(85), NESCAFE(70);
     private final double price;
     private double bill;

     Coffee(int i) {
         price = i;
     }

     public void order(int quantity) {
         bill = this.price * quantity;
     }

     public double getBill() {
         return bill;
     }
 }
