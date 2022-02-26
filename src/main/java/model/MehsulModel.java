package model;

public class MehsulModel {

    private int kod;
    private String mehsuladi;
   // private String bitmetarixi;

    public MehsulModel(int kod, String mehsuladi){
        this.kod=kod;
        this.mehsuladi=mehsuladi;
        //this.bitmetarixi=bitmetarixi;

    }

    public MehsulModel() {
    }

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public String getMehsuladi() {
        return mehsuladi;
    }

    public void setMehsuladi(String mehsuladi) {
        this.mehsuladi = mehsuladi;
    }

   /* public String getBitmetarixi() {
        return bitmetarixi;
    }*/

/*   public void setBitmetarixi(String bitmetarixi) {
        this.bitmetarixi = bitmetarixi;
    }*/
}
