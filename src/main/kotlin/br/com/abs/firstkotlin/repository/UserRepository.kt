package br.com.abs.firstkotlin.repository

import br.com.abs.firstkotlin.dto.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository : MongoRepository<User,String>
