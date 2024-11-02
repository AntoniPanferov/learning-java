public class AbstractHaendler {
    private AbstractHaendler next;

    public void setNext(AbstractHaendler haendler) {
        next = haendler;
    }

    private void druckeHinweis(Einkauf einkauf) {

    }

    protected void weiterleiten(Einkauf einkauf) {

    }
}
