package br.com.sithChallenge.model;




import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Authors extends AbstractEntity{

    private String name;
    private String birthDate;

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
