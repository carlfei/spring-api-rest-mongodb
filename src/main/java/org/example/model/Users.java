package org.example.model;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Data
@Document(collection = "users")
public class Users {
    @Id
    private int id;
    private String name;

    private String id_curso;
    private String password;

}