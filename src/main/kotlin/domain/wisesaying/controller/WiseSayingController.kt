package domain.wisesaying.controller

import com.think.global.Request
import domain.wisesaying.entity.WiseSaying

class WiseSayingController(
    var lastId: Int=0,
){
    val wiseSayings= mutableListOf<WiseSaying>()

    fun write(){
        print("명언 : ")
        val saying=readlnOrNull() ?: ""
        print("작가 : ")
        val author=readlnOrNull() ?: ""
        val id=++lastId
        println("${lastId}번 명언이 등록되었습니다.")
        println("[${saying} _ $author]")
        wiseSayings.add(WiseSaying(lastId, saying, author))
    }
    fun list() {
        println("번호 / 작가 / 명언")
        println("----------------------")
        wiseSayings.forEach{
            println("${it.id} / ${it.author} / ${it.author}")
        }
    }


    fun delete(rq: Request){

        val id = rq.getParam("id")?.toIntOrNull()

        if (id == null) {
            println("삭제할 명언의 번호를 입력해주세요.")
            return
        }

        val rst = wiseSayings.removeIf { saying -> saying.id == id }

        if(rst) {
            println("${id}번 명언을 삭제했습니다.")
        } else {
            println("${id}번 명언은 존재하지 않습니다.")
        }
    }

}