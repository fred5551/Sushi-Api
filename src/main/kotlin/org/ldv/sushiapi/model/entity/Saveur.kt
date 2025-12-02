package org.ldv.sushiapi.model.entity

import jakarta.persistence.*

@Entity
@Table(name = "saveurs")
data class Saveur(

    @Id
    @Column(name = "saveur_id")
    var saveurId: Int = 0,

    @Column(name = "nom")
    var nom: String? = null

) {
    // pas besoin d'une relation inverse ici si tu veux simplifier
}