package persistence.entity;

import model.MehsulModel;

import javax.persistence.*;

@Entity
@Table(name = "mehsullar")
public class Mehsullar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer kod;

    //    @Column(name = "mehsuladi")
    private String mehsuladi;
    //    @Column(name = "bitmetarixi")
   // private String bitmetarixi;

    public void getMehsullar(MehsulModel model){
        mehsuladi=model.getMehsuladi();
     //   bitmetarixi=novu.getBitmetarixi();
    }

    public Mehsullar() {
    }

    public Integer getKod() {
        return kod;
    }

    public void setKod(Integer kod) {
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

   /* public void setBitmetarixi(String bitmetarixi) {
        this.bitmetarixi = bitmetarixi;*/
    }





