package ru.gb.Controller;

import java.lang.module.FindException;
import java.util.Scanner;
import ru.gb.Model.data.Partner;
import ru.gb.Model.service.PartnerService;
import ru.gb.View.PartnerView;

public class PartnerController implements ContactController {
    
    private PartnerService model;
    private PartnerView view;

    public PartnerController(PartnerService model, PartnerView view) {
        this.model = model;
        this.view = view;
    }
  
    Scanner scanner = new Scanner(System.in);

    private  void addContact (){
      System.out.println("Введите имя");
      String name = scanner.nextLine();
      
      
      System.out.println("Введите тип контрагента");
      String type = scanner.nextLine();
      
      

    //   model.addContact(new Partner(name,type);
    }


    @Override
    public void showMenu() {
        while (true) {

            System.out.println("Выберите действие");
            System.out.println("1. Загрузить контрагентов из файла");
            System.out.println("2. Добавить котрагента");
            System.out.println("3. Вывести на экран всех контрагентов");
            System.out.println("4. Сохранить контрагентов");
            System.out.println("5. Поиск контрагента");
            System.out.println("Любая другая клавиша для выхода");
        
            int index = scanner.nextInt();

            switch (index) {
                case 1:
                    model.load();
                    break;
                case 2:
                addContact();
                    // model.addContact(new Partner(scanner.next(), "юридическое лицо", 777777, "специалист широкого профиля", "Москва, ул. Новая, д. 5", "rfd@mail.ru", "+7 777 7777", "@rfd"));
                    break;
                case 3:
                    view.showContacts();
                    break;
                case 4:
                    model.save();
                    break;
                case 5:
                    model.load();
                    break;
                default:
                System.out.println("Выход");
                    return;
            }
            scanner.close();
        }
    }
}
