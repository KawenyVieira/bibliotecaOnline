package br.com.bibOnline.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jdk.jfr.DataAmount;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RECORD")

public class Record {
    @Id
    @GeneratedValue(generator= "generateId", strategy = GenerationType.SEQUENCE) //gerar id sequencial automatico
    @SequenceGenerator(name="generateId",sequenceName = "recordSequence")
    @Column(name = "id", nullable = false)
    @JsonProperty("id")
    private Long id;

    @Column(name = "title", nullable = false)
    @JsonProperty("title")
    private String title;

    @Column(name = "author")
    @JsonProperty("author")
    private String author;

    @Column(name = "publishing_company")
    @JsonProperty("publishingCompany")
    private String publishingCompany;

    @Column( name = "date_publication")
    @JsonProperty("datePublication")
    private Date datePublication;


    @Column( name = "date_creation")
    @JsonProperty("dateCreation")
    private Date dateCreation;

    @Column( name = "date_updated")
    @JsonProperty("dateUpdated")
    private Date dateUpdated;

    @Column( name = "users_creation_id")
    @JsonProperty("usersCreationId")
    private Long creationUsersId;

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", title='" + title +'\'' +
                ", author='" + author + '\'' +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", datePublication='" + datePublication + '\'' +
                ", dateCreation='" + dateCreation + '\'' +
                ", dateUpdated='" + dateUpdated + '\'' +
                ", usersCreationId='" + creationUsersId + '\'' +
                '}';
    }
}
