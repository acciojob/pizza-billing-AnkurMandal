package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    int vegPizzaBasePrice=300;
    int nonVegPizzaBasePrice=400;
    int extraCheesePrice=80;
    int extraVegToppingPrice=70;

    int extraNonVegToppingPrice=120;
    int paperBagPrice=20;



    boolean isExtraCheeseAdded=false;
    boolean isExtraToppingAdded=false;
    boolean isPaperBagAdded=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        price=0;
        bill="";
        if(isVeg){
            price+=vegPizzaBasePrice;
        }
        else price+=nonVegPizzaBasePrice;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
       if(!isExtraCheeseAdded){
           isExtraCheeseAdded=true;
           price+=extraCheesePrice;
       }


    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingAdded){
            isExtraToppingAdded=true;
            if(isVeg) price+=extraVegToppingPrice;
            else price+=extraNonVegToppingPrice;
        }


    }

    public void addTakeaway(){
        // your code goes here
        if(!isPaperBagAdded){
            isPaperBagAdded=true;
            price+=paperBagPrice;
        }

    }

    public String getBill(){
        // your code goes here
        if(isVeg) bill="Base Price Of The Pizza: "+this.vegPizzaBasePrice+"\n";
        else bill="Base Price Of The Pizza: "+this.nonVegPizzaBasePrice+"\n";

        if(isExtraCheeseAdded) bill+="Extra Cheese Added: "+this.extraCheesePrice+"\n";

        if(isExtraToppingAdded){
            if(isVeg)bill+="Extra Toppings Added: "+this.extraVegToppingPrice+"\n";
            else bill+="Extra Toppings Added: "+this.extraNonVegToppingPrice+"\n";
        }

        if(isPaperBagAdded){
            bill+="Paperbag Added: "+this.paperBagPrice+"\n";
        }

        bill+="Total Price: "+this.price+"\n";

        return this.bill;
    }
}
