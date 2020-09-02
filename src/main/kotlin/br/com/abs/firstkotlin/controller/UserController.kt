package br.com.abs.firstkotlin.controller;

import br.com.abs.firstkotlin.dto.User
import br.com.abs.firstkotlin.model.Greeting
import br.com.abs.firstkotlin.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.concurrent.atomic.AtomicLong
import javax.websocket.server.PathParam

@RestController
@RequestMapping("user")
class UserController(val userService: UserService) {


@GetMapping("{userId}")
@ResponseStatus(HttpStatus.OK)
fun findById(@PathVariable(value = "userId") userId: String) =
        userService.findById(userId)

@GetMapping()
@ResponseStatus(HttpStatus.OK)
fun findAll() = userService.findAll()

@PostMapping
@ResponseStatus(HttpStatus.CREATED)
fun create(@RequestBody user: User)= userService.create(user)


@PutMapping("{userId}")
@ResponseStatus(HttpStatus.OK)
fun update(@PathVariable(value = "userId") userId: String, @RequestBody user: User) =
        userService.update(userId,user)

@DeleteMapping("{userId}")
@ResponseStatus(HttpStatus.OK)
fun delete(@PathVariable(value = "userId") userId: String) =
        userService.delete(userId)




}