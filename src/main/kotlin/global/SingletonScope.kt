package global

import domain.wisesaying.` repository`.WiseSayingRepository
import domain.wisesaying.controller.WiseSayingController
import domain.wisesaying.service.WiseSayingService
import domain.wisesaying.system.SystemController


object SingletonScope {
    val wiseSayingRepository = WiseSayingRepository()
    val wiseSayingService = WiseSayingService()
    val wiseSayingController = WiseSayingController()
    val systemController = SystemController()
}