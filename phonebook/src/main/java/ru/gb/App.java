package ru.gb;

import ru.gb.Model.data.Partner;
import ru.gb.Model.service.PartnerService;
import ru.gb.View.PartnerView;
import ru.gb.Controller.PartnerController;

/**
 * Напишите приложение, которое позволяет пользователю управлять своим списком контактов. 
 * Используйте наследование, полиморфизм, принципы SOLID.
 * Контрагент — это либо человек, либо компания.
 * У каждого контрагента есть список способов связаться: телефон, email, 
 * ник в telegram, адрес страницы VK, уличный адрес. 
 * Разрешается, что у одного контрагента сколько угодно способов связаться, 
 * например, несколько телефонов или несколько адресов.
 * Программа должна позволять следующие действия:
 * • Посмотреть список контрагентов
 * • Найти контрагента по названию. Посмотреть подробную информацию о нём
 * • Добавить контрагента
 * • Удалить контрагента
 * • Добавить новый способ связаться с контрагентом
 * • Удалить способ связаться с контрагентом 
 * Если задача кажется слишком простой, вы можете выбрать следующие необязательные усложнения:
 * • Используйте паттерн MVC или MVP для архитектуры приложения
 * • Решите задачу на языке, отличном от Java
 * • Возможность сохранять книгу контактов в файл, загружать из файла
 */
public class App 
{
    public static void main( String[] args )
    {
        PartnerService partnerService = new PartnerService();
        partnerService.addContact(new Partner(
            "Петров Петр Петрович",
            "физическое лицо",
            777777777,
            "Специалист широкого профиля",
            "г. Москва, ул. Липецкая, д.7, к. 1, кв. 678",
            "petrov@mail.ru",
            "+7 555 5555",
            "@petrovpp"));
            
        partnerService.save();
        
        PartnerView partView = new PartnerView(partnerService);
        partView.showContacts();

        PartnerController partnerController = new PartnerController(partnerService,partView);
                
        partnerController.showMenu();    
    }
}
