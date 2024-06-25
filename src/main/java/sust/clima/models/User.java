package sust.clima.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @Column(unique = true)
    String username;

    @Column
    String password;

    @Column
    String name;

    @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date created;

    @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date updated;

    @PrePersist
    public void onCreated() {
        this.created = new Date();
    }

    @PreUpdate
    public void onUpdated() {
        this.updated = new Date();
    }

}
