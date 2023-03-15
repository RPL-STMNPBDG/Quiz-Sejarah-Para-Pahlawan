package com.aulia.sejalan.model;

public class ItemListPahlawan {

    private final Integer imagePahlawan;
    private final String tvNamaPahlawan;
    private final String tvDeskripsi;

    public ItemListPahlawan(Integer imagePahlawan, String tvNamaPahlawan, String tvDeskripsi) {
        this.imagePahlawan = imagePahlawan;
        this.tvNamaPahlawan = tvNamaPahlawan;
        this.tvDeskripsi    = tvDeskripsi;
    }

    public Integer getIcon() {
        return imagePahlawan;
    }

    public String getName() {
        return tvNamaPahlawan;
    }

    public String getDeskripsi() {
        return tvDeskripsi;
    }
}
