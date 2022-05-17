package ru.xpendence.standardlayout.service.impl

import org.springframework.stereotype.Service
import ru.xpendence.standardlayout.entity.Contact
import ru.xpendence.standardlayout.service.ContactService
import java.util.*

/**
 * Описание класса: пару слов что это такое и для чего нужен.
 *
 * @since 17.05.2022
 * @author Вячеслав Чернышов
 */
@Service
class ContactServiceImpl : ContactService {

    override fun create(contact: Contact): Contact {
        TODO("Not yet implemented")
    }

    override fun update(contact: Contact): Contact {
        TODO("Not yet implemented")
    }

    override fun get(id: UUID): Contact {
        TODO("Not yet implemented")
    }

    override fun delete(id: UUID) {
        TODO("Not yet implemented")
    }
}