alter table CUSTOMERS_ORDER add constraint FK_CUSTOMERS_ORDER_ON_CUSTOMER foreign key (CUSTOMER_ID) references CUSTOMERS_CUSTUMER(ID);
create index IDX_CUSTOMERS_ORDER_ON_CUSTOMER on CUSTOMERS_ORDER (CUSTOMER_ID);
