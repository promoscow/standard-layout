package ru.xpendence.standardlayout.entity

import ru.xpendence.standardlayout.entity.type.ContactType

/**
 * Описание класса: пару слов что это такое и для чего нужен.
 *
 * @since 17.05.2022
 * @author Вячеслав Чернышов
 */
data class Contact(
    val type: ContactType,
    val value: String
)
