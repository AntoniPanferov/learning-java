public class Main {
    public static void main(String[] args) {
        Article a = new Article("a");
        Article b = new Article("b");
        Article c = new Article("c");

        ShoppingList shoppingList = new ShoppingList();
        shoppingList.newArticle(a);
        shoppingList.newArticle(b);
        shoppingList.newArticle(c);

        shoppingList.outputList();
    }
}