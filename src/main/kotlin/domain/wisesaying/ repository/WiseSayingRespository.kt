package domain.wisesaying.` repository`

import domain.wisesaying.entity.WiseSaying

class WiseSayingRespository {
    var lastId: Int = 0
    val wiseSayings = mutableListOf<WiseSaying>()

    fun save(wiseSaying: WiseSaying):WiseSaying {

        if(wiseSaying.isNew()){
            val new = wiseSaying.copy(id=++lastId)
            wiseSayings.add(new)
            return new
        }

        wiseSayings.indexOfFirst{it.id == wiseSaying.id}.let{
            wiseSayings[it] = wiseSaying
        }

        return wiseSaying
    }

    fun findAll(): List<WiseSaying> {
        return wiseSayings.toList()
    }

    fun findById(id: Int): WiseSaying? {
        return wiseSayings.find { it.id == id }
    }

    fun delete(wiseSaying: WiseSaying) {
        wiseSayings.remove(wiseSaying)
    }


}