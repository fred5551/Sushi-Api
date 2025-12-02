package org.ldv.sushiapi.model.entity

import jakarta.persistence.*

@Entity
@Table(name = "aliments_boxes")
data class AlimentBox(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,

    @Column(name = "quantite")
    val quantite: Int = 0

) {
    @field:ManyToOne(fetch = FetchType.EAGER)
    @field:JoinColumn(name = "fk_aliment_id", referencedColumnName = "aliment_id")
    val aliment: Aliment? = null

    @field:ManyToOne(fetch = FetchType.EAGER)
    @field:JoinColumn(name = "fk_box_id", referencedColumnName = "box_id")
    val box: Box? = null
}
