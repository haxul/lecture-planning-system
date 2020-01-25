package com.company.customers.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.customers.entity.Order;

@UiController("customers_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {
}