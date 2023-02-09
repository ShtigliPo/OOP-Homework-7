package ru.gb.Model.contactMethod;

import ru.gb.Model.contactMethod.address.Address;
import ru.gb.Model.contactMethod.email.Email;
import ru.gb.Model.contactMethod.phone.Phone;
import ru.gb.Model.contactMethod.telegram.Telegram;

public class UserListContactMethod implements Address, Email, Phone, Telegram {
    
    @Override
    public void addressMethod() {

    }

    @Override
    public void emailMethod() {

    }

    @Override
    public void phoneMethod() {

    }

    @Override
    public void telegramMethod() {
        
    }

}
