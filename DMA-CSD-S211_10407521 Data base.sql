use [DMA-CSD-S211_10407521];
go


--Create tables

create table customer(
	fname varchar (20) not null,
	lname varchar (20),
	zipcode int,
	city varchar (20),
	phoneno varchar (20) not null,
	cid int identity(1,1) not null,
	address varchar(50),
	--streetname varchar(20),
	--streetnu int,
	isClupType BIT,
	primary key(cid)

);

create table saleOrder(
	dato nchar(25),
	deliveryStatus nchar(25), 
	deliveryDato nchar(25),
	discount decimal,
	saleorderid int identity(1,1) not null,
	customer_id int,
    paymentdate nchar(25),
	primary key(saleorderid),
	foreign key (customer_id) references customer(cid)
	);

create table supplier(
	supplierid int not null,
    name varchar(20) unique not null,
    adress varchar(20) ,
    country varchar(20) ,
    phone_number varchar(20) ,
    primary key (supplierid)
);


CREATE TABLE product (
    name varChar(255) unique,
    productID int not null,
    salesPrice float(4),
    countryofOrigin varChar(255),
    currentStock float(4),
    productType varChar(255),
    purchasePrice float(4),
    location_ID int not null,
    Supplier_ID int not null,
    PRIMARY KEY (productID) ,
    FOREIGN KEY (Supplier_ID) REFERENCES Supplier(supplierid)
);

create table salesOrderLine(
	order_id int not null,
	productt_ID int,
	quantity int not null,
	actuelSalsPrice decimal not null,
	primary key(order_id,productt_ID),
	foreign key (order_id) references saleOrder(saleorderid),
	FOREIGN KEY (productt_ID) REFERENCES Product(ProductID)
	);


CREATE TABLE warehouse(
	name varChar(255),
	warehouseid int not null,
    PRIMARY KEY (warehouseid)
);

create table stock (
    minStock int not null,
    stockquantity int not null,
    locationid varchar(20) unique,
    product_id int not null,
    warehouse_id int not null,
    foreign key (product_id) references product(productid),
    foreign key (warehouse_id) references warehouse(warehouseid),
    unique (product_id, warehouse_id),
    primary key (warehouse_id)
);




CREATE TABLE Clothing (
    ProductID int not null,
    size varChar(255),
    PRIMARY KEY (ProductID),
    FOREIGN KEY (ProductID) REFERENCES Product(ProductID)
);

 

CREATE TABLE Equipment (
    ProductID int not null,
    type varChar(255),
    description  varChar(255),
    PRIMARY KEY (ProductID),
    FOREIGN KEY (ProductID) REFERENCES Product(ProductID)
);

 

CREATE TABLE GunReplica (
    ProductID int not null,
    calibre varChar(255),
    material  varChar(255),
    PRIMARY KEY (ProductID),
    FOREIGN KEY (ProductID) REFERENCES Product(ProductID)
);




-- insert data

insert into customer values('James','Borg',9000,'Aalborg','004511223344','Teglgårdsvej','false');
insert into customer values('Franklin','Wong',9900,'Frederikshavn','004555667788','Toldstrupsgde','true');
insert into customer values('Jennifer','Wallace',9200,'Aalborg SV','004599001122','Sønderbro','false');
insert into customer values('Alicia','Zelaya',9240,'Nibe','004533445566','Danmarksgade','false');
insert into customer values('Ramesh','Narayalan',9220,'Aalborg Øst','004577889900','jernbanegade','true');
insert into customer values('John','Smith',6701,'Esbjerg','004511234567','Christinesvej','true');
insert into customer values('Joyce','Engli',5300,'Kerteminde','004588990021','Kastetvej','false');
insert into customer values('Ahmad','Jabbar',1301,'København K','004543566789','Østerbro','true');
insert into customer values('Ibra','KH',2770,'Kastrup','004545673289','Nyhavnsgade','false');

insert into supplier values(100,'The moon', 'Sweden','Stockholm','004645824531');
insert into supplier values(101,'Painter', 'Norway','Oslo','004745435281');
insert into supplier values(102,'Best', 'USA','New York','0040810945237');
insert into supplier values(103,'Designer', 'USA','Los Angeles','0040811276453');
insert into supplier values(104,'Stars', 'USA','Florida','0040812345678');


insert into product values('Cowboy',00011122,4000,'USA',57,'Clothing',5300,4,101);
insert into product values('Bags',00022211,4000,'USA',57,'Clothing',5300,3,100);
insert into product values('Cowboy boots',00033311,1500,'Norway',10,'Clothing',2100,2,102);
insert into product values('Denims ',00044422,3240,'Sweden',7,'Clothing',3999,1,104);
insert into product values('T-shirts',00055534,1990,'USA',23,'Clothing',2449,3,103);
insert into product values('Vests',00066612,2300,'USA',11,'Clothing',2999,2,101);
insert into product values('Leather Jackets ',00077732,4500,'Sweden',14,'Clothing',6100,1,104);
insert into product values('Skirts clothing',0008832,3050,'USA',8,'Clothing',3700,1,102);
insert into product values('Chaps ',00099912,2500,'Britain',9,'Clothing',3250,3,100);
insert into product values('Necklaces',00033378,1250,'USA',12,'Clothing',1650,2,101);


insert into saleOrder values('11/01/2022','Sendt','20/01/2022',null,2,'11/01/2022');
insert into saleOrder values('25/01/2022','Not Sendt','30/01/2022',null,2,'10/01/2022');
insert into saleOrder values('30/01/2022','Sendt','05/02/2022',null,2,'30/01/2022');
insert into saleOrder values('07/02/2022','Sendt','13/02/2022',null,2,'10/01/2022');
insert into saleOrder values('20/02/2022','Not Sendt','25/02/2022',null,2,'20/02/2022');
insert into saleOrder values('22/02/2022','Not Sendt','05/03/2022',null,2,'22/02/2022');
insert into saleOrder values('28/02/2022','Sendt','13/03/2022',null,2,'28/02/2022');
insert into saleOrder values('13/03/2022','Not Sendt','20/03/2022',null,2,'13/03/2022');
insert into saleOrder values('17/03/2022','Sendt','25/03/2022',null,2,'17/03/2022');
insert into saleOrder values('20/03/2022','Not Sendt','31/03/2022',null,2,'20/03/2022');
insert into saleOrder values('10/01/2022','Sendt','20/01/2022',null,3,'10/01/2022');
insert into saleOrder values('11/01/2022','Sendt','20/01/2022',null,1,'11/01/2022');
insert into saleOrder values('25/01/2022','Not Sendt','30/01/2022',null,3,'10/01/2022');
insert into saleOrder values('30/01/2022','Sendt','05/02/2022',null,4,'30/01/2022');
insert into saleOrder values('07/02/2022','Sendt','13/02/2022',null,5,'10/01/2022');
insert into saleOrder values('20/02/2022','Not Sendt','25/02/2022',null,6,'20/02/2022');
insert into saleOrder values('22/02/2022','Not Sendt','05/03/2022',null,7,'22/02/2022');
insert into saleOrder values('28/02/2022','Sendt','13/03/2022',null,8,'28/02/2022');
insert into saleOrder values('13/03/2022','Not Sendt','20/03/2022',null,1,'13/03/2022');
insert into saleOrder values('17/03/2022','Sendt','25/03/2022',null,2,'17/03/2022');
insert into saleOrder values('20/03/2022','Not Sendt','31/03/2022',null,5,'20/03/2022');



insert into salesOrderLine values(1,00011122,2,5300);
insert into salesOrderLine values(4,00033311,1,2100);
insert into salesOrderLine values(7,0008832,3,3700);
insert into salesOrderLine values(11,00033378,1,1650);
insert into salesOrderLine values(1,00044422,2,3999);
insert into salesOrderLine values(1,00066612,2,2999);





insert into warehouse values( 'Aalborg, ToldstrupsGade 18, St, Nr.5', 1);
insert into warehouse values( 'Frederikshavn, Teglgårdsvej 4, St', 2);


insert into stock values(5,20,'ToldstrupsGade 18',00033378,1);
insert into stock values(5,20,'Teglgårdsvej 4',00033378,2);


insert into Clothing values(00022211,'M');
insert into Clothing values(00066612,'L');
insert into Clothing values(00033378,'S');



insert into Equipment values(00022211,'Wide Cowboy','Made from the best quality fabrik');
insert into Equipment values(00066612,'Original stuff','Long and thick vests');
insert into Equipment values(00033378,'Original Necklaces', 'Made from precious stones');


insert into GunReplica values(00099912,null,null);
insert into GunReplica values(00022211,null,null);
insert into GunReplica values(00066612,null,null);
insert into GunReplica values(00055534,null,null);


-- display data

select * from customer;
select * from product;
select * from supplier;
select * from saleOrder;
select * from salesOrderLine;
select * from warehouse;
select * from stock;
select * from Clothing;
select * from Equipment;
select * from GunReplica;









