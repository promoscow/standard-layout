package ru.xpendence.standardlayout.entity

import java.util.*

/**
 * Описание класса: пару слов что это такое и для чего нужен.
 *
 * @since 17.05.2022
 * @author Вячеслав Чернышов
 */
data class User(
    val id: UUID,
    val login: String,
    val password: String,
    val contacts: List<Contact>
)
