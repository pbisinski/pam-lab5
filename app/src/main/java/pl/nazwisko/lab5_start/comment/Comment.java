package pl.nazwisko.lab5_start.comment;

/**
 * Model opisujący komentarz pobrany z Rest API.
 *
 * Created by Michał Ciołek.
 */
public class Comment {
    private int id;
    private String author;
    private String comment;

    public Comment(String aut,String com){
        this.author=aut;
        this.comment=com;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getComment() {
        return comment;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
