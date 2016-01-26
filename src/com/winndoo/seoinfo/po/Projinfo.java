package com.winndoo.seoinfo.po;

import java.util.Date;

public class Projinfo {
    private Integer id;

    private Integer projtypeId;

    private Date updatetime;

    private String rateresult;

    private String pricedes;

    private String pricefilename;

    private String detaildes;

    private String detailfilename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjtypeId() {
        return projtypeId;
    }

    public void setProjtypeId(Integer projtypeId) {
        this.projtypeId = projtypeId;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getRateresult() {
        return rateresult;
    }

    public void setRateresult(String rateresult) {
        this.rateresult = rateresult == null ? null : rateresult.trim();
    }

    public String getPricedes() {
        return pricedes;
    }

    public void setPricedes(String pricedes) {
        this.pricedes = pricedes == null ? null : pricedes.trim();
    }

    public String getPricefilename() {
        return pricefilename;
    }

    public void setPricefilename(String pricefilename) {
        this.pricefilename = pricefilename == null ? null : pricefilename.trim();
    }

    public String getDetaildes() {
        return detaildes;
    }

    public void setDetaildes(String detaildes) {
        this.detaildes = detaildes == null ? null : detaildes.trim();
    }

    public String getDetailfilename() {
        return detailfilename;
    }

    public void setDetailfilename(String detailfilename) {
        this.detailfilename = detailfilename == null ? null : detailfilename.trim();
    }
}