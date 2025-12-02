package org.ldv.sushiapi.model.entity

import jakarta.persistence.*

/**
 * Entité Aliment — correspond à la table 'aliments'
 * Colonnes : aliment_id, nom
 */
@Entity
@Table(name = "aliments")
data class Aliment(
    @Id
    @Column(name = "aliment_id")
    val alimentId: Int,

    @Column(name = "nom")
    val nom: String? = null,

    /**
     * Reverse relation optionnelle : les AlimentBox qui référencent cet aliment.
     * mappedBy = "aliment"
     */
    @OneToMany(mappedBy = "aliment", fetch = FetchType.LAZY)
    val alimentsBoxes: List<AlimentBox> = emptyList()
)