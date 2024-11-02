public class Benutzerprofil implements ComparableContent<Benutzerprofil> {
    private String benutzername;
    private String pw;

    public Benutzerprofil(String benutzername, String pw) {
        this.benutzername = benutzername;
        this.pw = pw;
    }

    public String getBenutzername() {
        return benutzername;
    }

    @Override
    public boolean isGreater(Benutzerprofil pProfil) {
        if (this.benutzername.compareTo(pProfil.getBenutzername()) < 0) return false;
        return true;
    }

    @Override
    public boolean isEqual(Benutzerprofil pProfil) {
        if (this.benutzername.compareTo(pProfil.getBenutzername()) == 0) return true;
        return false;
    }

    @Override
    public boolean isLess(Benutzerprofil pProfil) {
        if (this.benutzername.compareTo(pProfil.getBenutzername()) < 0) return true;
        return false;
    }
}
