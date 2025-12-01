package org.ldv.sushiapi.model.entity

import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToMany

open class Box (
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    val boxId: Long,

    var nom: String,
    var nbPieces: Int,
    var prix: Double,
    var nomImage: String,

    // Ra
    @ManyToMany
    @JoinTAble(name = "saveurs_boxes", )








)