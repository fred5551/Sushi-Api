package org.ldv.sushiapi.controller

import org.springframework.core.io.ClassPathResource
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/image")
class ImageController {

    @GetMapping("/{imageName}")
    fun getImage(@PathVariable imageName: String): ResponseEntity<ByteArray> {
        return try {
            val resource = ClassPathResource("static/images/$imageName")
            val bytes = resource.inputStream.readBytes()
            ResponseEntity.ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(bytes)
        } catch (e: Exception) {
            ResponseEntity.notFound().build()
        }
    }
}