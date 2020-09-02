package br.com.abs.firstkotlin

import org.springframework.boot.autoconfigure.AutoConfigurationPackage
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.ServletComponentScan

@SpringBootApplication
@AutoConfigurationPackage
class FirstKotlinApplication

fun main(args: Array<String>) {
	runApplication<FirstKotlinApplication>(*args)
}
