package org.ldv.sushiapi.controller

import org.ldv.sushiapi.dao.BoxDao
import org.ldv.sushiapi.dto.BoxDtoApi
import org.ldv.sushiapi.services.boxToBoxDtoApi
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = ["*"])
class BoxController(private val boxDao: BoxDao) {

    @GetMapping("/boxes")
    fun allBoxes(): List<BoxDtoApi> {
        val boxes = boxDao.findAll()
        return boxes.map { box -> boxToBoxDtoApi(box) }
    }
}