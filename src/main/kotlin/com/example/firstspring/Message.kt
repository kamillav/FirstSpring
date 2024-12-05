// Message.kt
package com.example.firstspring

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

//data classes:
// - copy
// - equals
// - hashCode
// - toString
// - componentN functions
// - destructuring declarations
// - no-arg constructor
// - properties for all constructor parameters

// id of type nullable string, text of type string
@Table("MESSAGES")
data class Message(val text: String, @Id val id: String? = null)