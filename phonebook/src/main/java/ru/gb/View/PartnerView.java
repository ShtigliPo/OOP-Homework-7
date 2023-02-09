package ru.gb.View;

import ru.gb.Model.data.Partner;
import ru.gb.Model.service.UserService;

public class PartnerView extends UserView<Partner> {

    public PartnerView(UserService<Partner> model) {
        super(model);
    }

    @Override
    public void showContacts() {
        super.showContacts();
    }
    
}
