public class Main {
    public static void main(String[] args) {
        BinaryTree<Ancestor> b1 = new BinaryTree<>(new Ancestor("Jacqueline", "Bouvier", Sex.FEMALE));
        BinaryTree<Ancestor> b2 = new BinaryTree<>(new Ancestor("Clancy", "Bouvier", Sex.MALE));
        BinaryTree<Ancestor> b3 = new BinaryTree<>(new Ancestor("Marge", "Simpson", Sex.FEMALE), b1, b2);
        BinaryTree<Ancestor> b4 = new BinaryTree<>(new Ancestor("Mona", "Simpson", Sex.FEMALE));
        BinaryTree<Ancestor> b5 = new BinaryTree<>(new Ancestor("Abraham", "Simpson", Sex.MALE));
        BinaryTree<Ancestor> b6 = new BinaryTree<>(new Ancestor("Homer", "Simpson", Sex.MALE), b4, b5);
        BinaryTree<Ancestor> familyTree = new BinaryTree<>(new Ancestor("Lisa", "Simpson", Sex.FEMALE), b3, b6);

        familyTree.orderAusgabe(Order.PREORDER, familyTree);

    }
}