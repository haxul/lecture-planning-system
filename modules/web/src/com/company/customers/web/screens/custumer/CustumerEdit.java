package com.company.customers.web.screens.custumer;

import com.haulmont.cuba.gui.screen.*;
import com.company.customers.entity.Custumer;

@UiController("customers_Custumer.edit")
@UiDescriptor("custumer-edit.xml")
@EditedEntityContainer("custumerDc")
@LoadDataBeforeShow
public class CustumerEdit extends StandardEditor<Custumer> {

}