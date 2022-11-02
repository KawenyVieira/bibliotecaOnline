package br.com.bibOnline.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "USERS")
public class Users {
    @Id
    @GeneratedValue (generator= "generateId", strategy = GenerationType.SEQUENCE) //gerar id sequencial automatico
    @SequenceGenerator(name="generateId",sequenceName = "usersSequence")
    @Column(name = "ID", nullable = false)
    @JsonProperty("id")
    private Long id;

    @Column(name = "FIRST_NAME", length = 50, nullable = false)
    @JsonProperty("firstName")
    private String firstName;

    @Column(name = "BIRTH")
    @JsonProperty("birth")
    private Date birth;

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + firstName + '\'' +
                ", birth='" + birth + '\'' +
                '}';
    }

}
