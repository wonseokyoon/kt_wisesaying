package global

import domain.wisesaying.repository.WiseSayingMemRepository
import domain.wisesaying.controller.WiseSayingController
import domain.wisesaying.repository.WiseSayingFileRepository
import domain.wisesaying.service.WiseSayingService
import domain.wisesaying.system.SystemController


object SingletonScope {
    val wiseSayingRepository by lazy { WiseSayingFileRepository() }
    val wiseSayingService by lazy { WiseSayingService() }
    val wiseSayingController by lazy { WiseSayingController() }
    val systemController by lazy { SystemController() }
}