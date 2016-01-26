package com.winndoo.seoinfo.po;

public class Projdes {
    private Integer id;

    private Integer projtypeId;

    private String title;

    private String content;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}