package com.proyecto.encuesta.domain.enties;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class SurveyJson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Embedded
    Audit audit = new Audit();
    @ManyToOne
    @JoinColumn(name = "survey_id")
    private Survey survey;

    @Column(columnDefinition = "JSON", nullable = false)
    private String payloadString = "";
}
