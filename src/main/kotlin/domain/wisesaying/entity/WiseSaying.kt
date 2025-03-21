package domain.wisesaying.entity

data class WiseSaying(
    val id:Int=0,
    val saying:String,
    val author:String
) {
    fun isNew():Boolean{
        return id==0
    }
}