package org.ldv.sushiapi.model.entity

import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToMany

import jakarta.persistence.*

/**
 * Entité Box — correspond à la table 'boxes'
 * Colonnes : box_id, nom_image, nb_pieces, nom, prix
 */
@Entity
@Table(name = "boxes")
data class Box(
    @Id
    @Column(name = "box_id")
    val boxId: Int,

    @Column(name = "nom_image")
    val nomImage: String? = null,

    @Column(name = "nb_pieces")
    val nbPieces: Int? = null,

    @Column(name = "nom")
    val nom: String? = null,

    @Column(name = "prix")
    val prix: Double? = null,

    /**
     * Relation OneToMany vers aliments_boxes (AlimentBox)
     * mappedBy = "box" (champ dans AlimentBox)
     */
    @OneToMany(mappedBy = "box", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    val alimentsBoxes: List<AlimentBox> = emptyList(),

    /**
     * Relation ManyToMany vers saveurs via la table d'association 'saveurs_boxes'
     * Pas de classe associative (conformément au PDF)
     */
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "saveurs_boxes",
        joinColumns = [JoinColumn(name = "fk_box_id")],
        inverseJoinColumns = [JoinColumn(name = "fk_saveur_id")]
    )
    val saveurs: Set<Saveur> = emptySet()
)

