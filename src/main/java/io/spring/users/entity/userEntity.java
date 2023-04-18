package io.spring.users.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name =  "t_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class userEntity {
    public userEntity(String string, String name2, String password2) {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "users", length = 200)
    private String name;

    @Column(name = "password", length = 200)
    private String password;


}
