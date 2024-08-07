
public class Pizza {
    private int price;
    private boolean veg;
    private int basePizzaPrice;

    private int extraCheesePrice=100;
    private int extraToppingsPrice=150;
    private int backPack=20;
    private boolean cheese=false;
    private boolean toppings=false;
    private boolean takeaway=false;

    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg){
            this.price=300;
        }
        else{
            this.price=400;
        }
            basePizzaPrice = this.price;
    }
    
    public void addExtraCheese(){
        System.out.println("Extra cheese added");
        this.price+=extraCheesePrice;
        cheese=true;
    }
    public void addExtraToppings(){
        System.out.println("Extra toppings added");
        this.price+=extraToppingsPrice;
        toppings=true;
    }

    public void takeAway(){
        System.out.println("Take away opted along a bag!");
        this.price+=backPack;
        takeaway=true;
    }

    public void getBill(){
      System.out.printf("Pizza: %d\n",basePizzaPrice);
      if (cheese){System.out.println("Extra Cheese Added :"+extraCheesePrice);}
      if (toppings){System.out.println("Extra Toppings Added :"+extraToppingsPrice);}
      if (takeaway){System.out.println("Take Away :"+backPack);}
      System.out.println("Total Bill: "+this.price);
    }
    public void getPizzaPrice(){
        System.out.println("Pizza price: "+ this.price);
    }

}
