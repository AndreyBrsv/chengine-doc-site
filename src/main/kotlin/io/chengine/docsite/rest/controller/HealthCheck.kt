package io.chengine.docsite.rest.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/health")
class HealthCheck {

    @RequestMapping("/check")
    fun healthCheck() = "It's ok!"
}