package com.sai.CrudMongo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "student")
public class Student {
    @Id
    private Long id;
    private String name;
    private String email;
    private int age;
    private String major;

}
