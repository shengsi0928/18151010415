package com.Data;

import org.springframework.jdbc.core.RowCallbackHandler;

public class Book {
    private String isbn;
    private String sm;
    private String zz;
    private String cbs;
    private String jg;
    private String fbl;
    private String kcl;

    public Book(){

    }
    public Book(String isbn, String sm, String zz, String cbs){
        this.isbn = isbn;
        this.sm = sm;
        this.zz = zz;
        this.cbs = cbs;
    }

    public Book(String isbn, String sm, String zz, String cbs, String jg, String fbl, String kcl){

    }
    public Book(String isbn){
        this.isbn = isbn;
    }

    public Book(String isbn, String sm){
        this.isbn = isbn;
        this.sm = sm;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getSm() {
        return sm;
    }

    public void setSm(String sm) {
        this.sm = sm;
    }

    public String getZz() {
        return zz;
    }

    public void setZz(String zz) {
        this.zz = zz;
    }

    public String getCbs() {
        return cbs;
    }

    public void setCbs(String cbs) {
        this.cbs = cbs;
    }

    public String getJg() {
        return jg;
    }

    public void setJg(String jg) {
        this.jg = jg;
    }

    public String getFbl() {
        return fbl;
    }

    public void setFbl(String fbl) {
        this.fbl = fbl;
    }

    public String getKcl() {
        return kcl;
    }

    public void setKcl(String kcl) {
        this.kcl = kcl;
    }

    public String GetInf(){
        return "Book : isbn= " + isbn + " sm= " + sm + " cbs= " + cbs + " jg= " + jg +
                " fbl= " + fbl + " Kcl= " + kcl ;
    }
}
