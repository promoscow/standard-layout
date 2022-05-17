package ru.xpendence.standardlayout.service

import ru.xpendence.standardlayout.entity.User
import java.util.UUID

/**
 * Описание класса: пару слов что это такое и для чего нужен.
 *
 * @since 17.05.2022
 * @author Вячеслав Чернышов
 */
interface UserService {

    fun create(user: User): User

    fun update(user: User): User

    fun get(id: UUID): User

    fun delete(id: UUID)
}