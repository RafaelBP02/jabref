package org.jabref.logic.xmp;

public class XmpFuncMeta {
    String title;
    String author;
    String subject;
    String date;

    public XmpFuncMeta(String title, String author, String subject, String date) {
        this.title = title;
        this.author = author;
        this.subject = subject;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "XMPFuncMeta{" +
                "title='" + title + "'" +
        ", author='" + author + "'" +
        ", subject='" + subject + "'" +
        ", date='" + date + "'" +
        '}';
    }
}
