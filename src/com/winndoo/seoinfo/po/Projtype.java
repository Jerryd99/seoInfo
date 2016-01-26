package com.winndoo.seoinfo.po;

public class Projtype {
    private Integer id;

    private String projname;

    private Integer tabletypeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjname() {
        return projname;
    }

    public void setProjname(String projname) {
        this.projname = projname == null ? null : projname.trim();
    }

    public Integer getTabletypeId() {
        return tabletypeId;
    }

    public void setTabletypeId(Integer tabletypeId) {
        this.tabletypeId = tabletypeId;
    }
}