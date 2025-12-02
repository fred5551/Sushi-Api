package org.ldv.sushiapi.model.entity

import jakarta.persistence.*

@Entity
@Table(name = "aliments_boxes")
data class AlimentBox(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0,

    @Column(name = "quantite")
    var quantite: Int = 0

) {
    @field:ManyToOne(fetch = FetchType.EAGER)
    @field:JoinColumn(name = "fk_aliment_id", referencedColumnName = "aliment_id")
    var aliment: Aliment? = null

    @field:ManyToOne(fetch = FetchType.EAGER)
    @field:JoinColumn(name = "fk_box_id", referencedColumnName = "box_id")
    var box: Box? = null
}
