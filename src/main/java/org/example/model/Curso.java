package org.example.model;


import jakarta.validation.constraints.NotBlank;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "cursos")
public class Curso {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @NotBlank(message = "Name is mandatory")
    private String curso;
    @NotBlank(message = "Name is mandatory")
    private String tema;

    private boolean ok;


}
