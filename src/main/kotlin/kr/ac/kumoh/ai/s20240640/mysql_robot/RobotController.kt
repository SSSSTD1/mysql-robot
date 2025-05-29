package kr.ac.kumoh.ai.s20240640.mysql_robot

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/robots")
class RobotController(val service: RobotService) {
    @GetMapping
    //fun getAllRobots() = service.getAllRobots()
    fun getAllRobots(): ResponseEntity<List<Robot>> {
        val robots = service.getAllRobots()
        return ResponseEntity.ok(robots)
    }
}