package com.Data;

public class Student {

    private String jszh;
    private String xm;
    private String zym;
    private String xb;
    private String cssj;
    private String jss;
    private String zp;
    public String getJszh() {
        return jszh;
    }

    public void setJszh(String jszh) {
        this.jszh = jszh;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    public String getJss() {
        return jss;
    }

    public void setJss(String jss) {
        this.jss = jss;
    }

    public String getZp() {
        return zp;
    }

    public void setZp(String zp) {
        this.zp = zp;
    }


    public String getZym() {
        return zym;
    }

    public void setZym(String zym) {
        this.zym = zym;
    }

    public String getCssj() {
        return cssj;
    }

    public void setCssj(String cssj) {
        this.cssj = cssj;
    }

    public String toString(){
        return "Student : jszh= " + jszh + " xm= " + xm + " zym= " + zym +
        " xb= " + xb + " cssj= " + cssj + " jss= " + jss + " zp= " + zp;
    }
}
