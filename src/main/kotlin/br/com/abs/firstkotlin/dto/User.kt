package br.com.abs.firstkotlin.dto

import org.springframework.data.annotation.Id

data class User(@Id val id: String? = null, val name: String, val document: String)
