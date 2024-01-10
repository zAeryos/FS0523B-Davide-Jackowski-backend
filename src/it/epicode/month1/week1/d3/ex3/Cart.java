package it.epicode.month1.week1.d3.ex3;

public class Cart {

    int clientId;
    String[] articlesList;
    int totalArticleCost;

    public Cart(int clientId) {
        this.clientId = clientId;
        this.articlesList = new String [0];
        this.totalArticleCost = 0;
    }
}