import java.util.List;
import java.util.ArrayList;
public class ShoppingList {
    private List<Article> shoppingList;

    ShoppingList() {
        shoppingList = new ArrayList<>();
    }

    public void newArticle(Article article) {
        shoppingList.add(article);
    }

    public boolean searchArticle(String articleName) {
        for(Article article : shoppingList) {
            if (article.getName().equals(articleName)) return true;
        }
        return false;
    }

    public void delete(String articleName) {
        shoppingList.removeIf(article -> article.getName().equals(articleName));
    }

    public void outputList() {
        for(Article article : shoppingList) {
            System.out.println(article.getName());
        }
    }
}
