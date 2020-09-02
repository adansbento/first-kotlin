package br.com.abs.firstkotlin.service

import br.com.abs.firstkotlin.dto.User
import br.com.abs.firstkotlin.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(val userRepository: UserRepository ) {

    fun create(user: User) = userRepository.insert(user)

    fun update(userId: String, user: User):User {
        val userDb: User = findById(userId)
        val userToSave: User = userDb.copy(name = user.name, document = user.document)
       return userRepository.save(userToSave)
    }

    fun findById(userId: String)=
        userRepository.findById(userId).orElseThrow{RuntimeException("User with userId: $userId not found")}

    fun findAll() = userRepository.findAll()

    fun delete(userId: String) = userRepository.delete(findById(userId))



}