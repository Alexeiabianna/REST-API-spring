package com.alexei.springcloudmysql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Contact {
    @Id
    @GeneratedValue
    private Long id;

    //@Column(name="contact_name") caso o nome da coluna no banco seja diferente do atributo.
    private String name;
    private String email;
    private String phone;    
}
