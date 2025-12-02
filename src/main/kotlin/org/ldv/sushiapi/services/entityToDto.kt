package org.ldv.sushiapi.services

import org.ldv.sushiapi.dto.AlimentBoxDtoApi
import org.ldv.sushiapi.dto.BoxDtoApi
import org.ldv.sushiapi.model.entity.Box

fun boxToBoxDtoApi(box: Box): BoxDtoApi {
    return BoxDtoApi(
        id = box.boxId,
        nom = box.nom ?: "",
        pieces = box.nbPieces ?: 0,
        prix = box.prix ?: 0.0,
        image = "/api/image/${box.nomImage}.png",
        saveurs = box.saveurs.map { it.nom ?: "" },
        aliments = box.alimentsBoxes.map { alimentBox ->
            AlimentBoxDtoApi(
                nom = alimentBox.aliment?.nom ?: "",
                quantite = alimentBox.quantite
            )
        }
    )
}