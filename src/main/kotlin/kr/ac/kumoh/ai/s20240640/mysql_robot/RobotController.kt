package kr.ac.kumoh.ai.s20240640.mysql_robot

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RobotController {
    @GetMapping("/")
    fun welcome(): String {
        return "Welcome to Robot Server"
    }
}