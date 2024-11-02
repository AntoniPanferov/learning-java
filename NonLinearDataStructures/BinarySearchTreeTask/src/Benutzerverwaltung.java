
public class Benutzerverwaltung {
    private BinarySearchTree<Benutzerprofil> benutzerBaum;

    public Benutzerverwaltung() {
        this.benutzerBaum = new BinarySearchTree<>();
    }

    public void neuenNutzerAnlegen(String pBenutzername, String pPw) {
        this.benutzerBaum.insert(new Benutzerprofil(pBenutzername, pPw));
    }


    public void nutzerLoeschen(String pBenutzername, String pPw) {
        this.benutzerBaum.remove(new Benutzerprofil(pBenutzername, pPw));
    }


    public boolean profilVorhanden(String pBenutzername) {
        return true;
    }

    public void ausgabe() {
        besucheLO(benutzerBaum);
    }

    public void besucheLO(BinarySearchTree<Benutzerprofil> b) {
        if(b.getContent()!=null)
        {
            System.out.print(b.getContent().getBenutzername() +" ");
        }
        if(b.getLeftTree() != null)
        {
            System.out.println(b.getLeftTree().getContent().getBenutzername() +" ");
        }
        if(b.getRightTree() != null)
        {
            System.out.println(b.getRightTree().getContent().getBenutzername() +" ");
        }


        if(b.getLeftTree() != null)
        {
            besucheLO(b.getLeftTree());
        }
        if(b.getRightTree() != null)
        {
            besucheLO(b.getRightTree());
        }


        /*
        if(b.getContent()!=null)
        {
            System.out.print(b.getContent().getBenutzername() +" ");
        }
        if(b.getLeftTree() != null)
        {
            besucheLO(b.getLeftTree());
        }
        if(b.getRightTree() != null)
        {
            besucheLO(b.getRightTree());
        }
         */
    }


}
