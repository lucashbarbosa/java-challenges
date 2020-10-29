package br.com.sithChallenge.model;


import javax.persistence.*;

@Entity
public class Books extends AbstractEntity{
    private String name;


    private String author_id;

    public String getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }
    @Transient
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "authors_id")
    private Authors  author;

//    public Authors getAuthor() {
//        return author;
//    }

    public void setAuthor(Authors author) {
        this.author = author;
    }



    private int EditionNumber;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getEditionNumber() {
        return EditionNumber;
    }

    public void setEditionNumber(int editionNumber) {
        EditionNumber = editionNumber;
    }
}
