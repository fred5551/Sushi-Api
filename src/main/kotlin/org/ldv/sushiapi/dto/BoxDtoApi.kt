package org.ldv.sushiapi.dto

data class BoxDtoApi(
    val id: Int,
    val nom: String,
    val pieces: Int,
    val prix: Double,
    val image: String,
    val saveurs: List<String>,
    val aliments: List<AlimentBoxDtoApi>
)