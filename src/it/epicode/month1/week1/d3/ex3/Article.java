package it.epicode.month1.week1.d3.ex3;

public class Article {

    int articleId;
    String articleDescription;
    double price;
    int stock;

    public Article(int articleId, String articleDescription, double price, int stock) {
        this.articleId          = articleId;
        this.articleDescription = articleDescription;
        this.price              = price;
        this.stock              = stock;
    }

    public int      getArticleId() {return this.articleId;};
    public String   getArticleDescription() {return this.articleDescription;};
    public double   getPrice() {return this.price;};
    public int      getStock() {return this.stock;};

    public void     setArticleId(int articleId) {this.articleId = articleId;};
    public void     setArticleDescription(String articleDescription) {this.articleDescription = articleDescription;};
    public void     setPrice(double price) {this.price = price;};
    public void     setStock(int stock) {this.stock = stock;};
}
