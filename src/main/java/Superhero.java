public class Superhero {

    public Superhero[] superheroes;

    private String superheltnavn;
    private String rigtigenavn;
    private String superkræft;
    private double powerlevel;
    private int opdagelsesår;

    public Superhero(String superheltnavn, String rigtigenavn, String superkræft, double powerlevel, int opdagelsesår) {

        this.superheltnavn = superheltnavn;
        this.rigtigenavn = rigtigenavn;
        this.superkræft = superkræft;
        this.powerlevel = powerlevel;
        this.opdagelsesår = opdagelsesår;

    }

    public String getSuperheltNavn() {
        return superheltnavn;
    }

    public void setSuperheltNavn(String superheltnavn) {
        this.superheltnavn = superheltnavn;
    }

    public String getRigtigenavn() {
        return rigtigenavn;
    }

    public void setRigtigeNavn(String rigtigenavn) {
        this.rigtigenavn = rigtigenavn;
    }

    public String getSuperkræft() {
        return superkræft;
    }

    public void setSuperkræft(String superkræft) {
        this.superkræft = superkræft;
    }

    public double getPowerlevel() {
        return powerlevel;
    }

    public void setPowerlevel(double powerlevel) {
        this.powerlevel = powerlevel;
    }

    public int getOpdagelsesår() {
        return opdagelsesår;
    }

    public void setOpdagelsesår(int opdagelsesår) {
        this.opdagelsesår = opdagelsesår;
    }

    public String toString() {
        return "Superheltens navn: " + superheltnavn +
                "Superheltens rigtige navn: " + rigtigenavn +
                "Superkræft : " + superkræft +
                "Powerlevel : " + powerlevel +
                "Opdagelsesår: " + opdagelsesår;
    }
}

