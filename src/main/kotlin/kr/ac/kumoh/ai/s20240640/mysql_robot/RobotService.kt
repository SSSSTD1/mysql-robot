package kr.ac.kumoh.ai.s20240640.mysql_robot

import org.springframework.stereotype.Service

@Service
class RobotService(val repository: RobotRepository) {
    fun getAllRobots() = repository.findAll()

}