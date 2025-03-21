package domain.wisesaying.service

import domain.wisesaying.` repository`.WiseSayingRespository
import domain.wisesaying.entity.WiseSaying

class WiseSayingService {

    val wiseSayingRespository=WiseSayingRespository()

    fun write(saying: String,author: String):WiseSaying {
        return wiseSayingRespository.save(WiseSaying(saying = saying,author = author))
    }

    fun getItems(): List<WiseSaying> {
        return wiseSayingRespository.findAll()
    }

    fun delete(wiseSaying: WiseSaying) {
        wiseSayingRespository.delete(wiseSaying)
    }

    fun getItem(id: Int): WiseSaying? {
        return wiseSayingRespository.findById(id)
    }

    fun modify(wiseSaying: WiseSaying, saying: String, author: String):WiseSaying {
        return wiseSayingRespository.save(wiseSaying.copy(saying = saying,author = author))
    }


}