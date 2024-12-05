// MessageRepository.kt
package com.example.firstspring

import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String>