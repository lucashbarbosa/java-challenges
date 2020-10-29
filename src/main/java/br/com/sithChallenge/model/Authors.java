package br.com.sithChallenge.model;




import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity

public class Authors extends AbstractEntity{

    private String name;
    private String birthDate;


    private Books book;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
