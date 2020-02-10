insert into brand values(1, 'Allen Solly');
insert into brand values(2, 'Peter England');
insert into brand values(3, 'Woodland');

insert into category values(1, 'Shirt');
insert into category values(2, 'Pant');
insert into category values(3, 'Shoes');

insert into Seller values(1, 'AAA');
insert into Seller values(2, 'BBB');
insert into Seller values(3, 'CCC');


insert into product(id,sku,color,size,brand_id,category_id,seller_id,prize) values(1, '112233EE', 'RED','M',1,2,1,500);
insert into product(id,sku,color,size,brand_id,category_id,seller_id,prize) values(2, '112233XE', 'WHITE','S',1,2,1,1000);
insert into product(id,sku,color,size,brand_id,category_id,seller_id,prize) values(3, '1332233XE', 'BLACK','XL',1,2,1,500);


insert into product(id,sku,color,size,brand_id,category_id,seller_id,prize) values(4, '112233EE', 'PINK','M',2,1,2,290);
insert into product(id,sku,color,size,brand_id,category_id,seller_id,prize) values(5, '116233XE', 'GREY','S',2,1,2,3333);
insert into product(id,sku,color,size,brand_id,category_id,seller_id,prize) values(6, '12233XE', 'ORANGE','XL',2,1,2,3222);


insert into product(id,sku,color,size,brand_id,category_id,seller_id,prize) values(7, '11223EE', 'CYAN','XXL',3,3,3,444);
insert into product(id,sku,color,size,brand_id,category_id,seller_id,prize) values(8, '11523E', 'PURPLE','L',3,3,3,777);
insert into product(id,sku,color,size,brand_id,category_id,seller_id,prize) values(9, '13833XE', 'BLACK','XS',3,3,3,888);