package com.example.blog

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.HttpStatus
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity

@SpringBootTest
class BlogApplicationTests(val restTemplate: TestRestTemplate) {

	@Test
	fun contextLoads() {
		val entity = restTemplate.getForEntity<String>("/")
    	assertEquals(HttpStatus.OK, entity.statusCode)
	}

}