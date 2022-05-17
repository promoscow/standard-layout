package ru.xpendence.standardlayout.service

import ru.xpendence.standardlayout.entity.Contact
import java.util.UUID

/**
 * Описание класса: пару слов что это такое и для чего нужен.
 *
 * @since 17.05.2022
 * @author Вячеслав Чернышов
 */
interface ContactService {

    fun create(contact: Contact): Contact

    fun update(contact: Contact): Contact

    fun get(id: UUID): Contact

    fun delete(id: UUID)
}