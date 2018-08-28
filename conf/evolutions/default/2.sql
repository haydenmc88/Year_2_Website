# --- Sample dataset

# --- !Ups

insert into category (id,name) values ( 1,'Audio' );
insert into category (id,name) values ( 2,'Books' );
insert into category (id,name) values ( 3,'Computer' );
insert into category (id,name) values ( 4,'Furniture' );
insert into category (id,name) values ( 5,'Kitchen' );
insert into category (id,name) values ( 6,'Laundry' );
insert into category (id,name) values ( 7,'Mobile Phone' );
insert into category (id,name) values ( 8,'Television' );

insert into product (id,category_id,name,description,stock,price) values ( 1,5,'Kettle','Steel Electric Kettle',100,55.00 );
insert into product (id,category_id,name,description,stock,price) values ( 2,5,'Fridge freezer','Fridge + freezer large',45,799.00 );
insert into product (id,category_id,name,description,stock,price) values ( 3,1,'Portable Music Player','250GB music player (MP3,MP4,WMA,WAV)',5,99.00 );
insert into product (id,category_id,name,description,stock,price) values ( 4,3,'13inch Laptop','HP laptop,8GB RAM,250GB SSD',45,799.00 );
insert into product (id,category_id,name,description,stock,price) values ( 5,3,'8inch Tablet','Android 5.1 Tablet,32GB storage,8inch screen',5,99.00 );
insert into product (id,category_id,name,description,stock,price) values ( 6,8,'60inch TV','Sony 4K,OLED,Smart TV',12,5799.00 );
insert into product (id,category_id,name,description,stock,price) values ( 7,6,'Washing Machine','1600rpm spin,A+++ rated,10KG',50,699.00 );
insert into product (id,category_id,name,description,stock,price) values ( 8,7,'Phone','Windows 10,5.2inch OLED,3GB RAM,64GB Storage',45,799.00 );
insert into product (id,category_id,name,description,stock,price) values ( 9,3,'10inch Tablet','Windows 10,128GB storage,8inch screen',5,299.00 );
insert into product (id,category_id,name,description,stock,price) values ( 10,5,'Oven','Oven + Grill,Stainless Steel',10,399.00 );
insert into product (id,category_id,name,description,stock,price) values ( 11,4,'Bed','Super King size,super comfort mattress',5,899.00 );
insert into product (id,category_id,name,description,stock,price) values ( 12,2,'Learning JavaScript','Become a JavaScript expert in 2 hours!',50,29.00 );