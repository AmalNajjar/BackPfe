package com.example.AppPfe.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class compteUtilisateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer matricule;
    private String nom;
    private String prenom;
    private String  password;
    @Column(unique =true)
    private String email;

    //@OneToMany(mappedBy = "libelleDirection")
    //@JsonIgnore
    //private List<TypeDirection> typeDirections=new ArrayList<>();
}


