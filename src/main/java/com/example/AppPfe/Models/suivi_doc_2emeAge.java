package com.example.AppPfe.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Data
@ToString
@NoArgsConstructor
@Table
@AllArgsConstructor
public class suivi_doc_2emeAge implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String limite_de_conservation_1ere_age;
    private int Numero_document;
    private String Chapitre_comptable ;
    private int Nombre_De_pages;
    private Date Date_De_creation_Du_Document;
    private Date Date_d_entree_Du_Document;
    private int Nombre_De_documents ;
    private int codedocument;
    private int emplacement_physique;
    private int numero_d_ordre;
    @ManyToOne
    @JoinColumn(name ="designation_Nomenclature",referencedColumnName = "designation_Nomenclature")
    private Nomenclature designation_Nomenclature;

    @ManyToOne
    @JoinColumn(name ="code_centre",referencedColumnName = "code_centre")
    private centre_pre_archivage code_centre;

    @OneToOne
    @JsonIgnore
    @JoinColumn(name ="libelleDirection",referencedColumnName = "libelleDirection")
    private suivi_doc_1ereAge libelleDirection;

}

