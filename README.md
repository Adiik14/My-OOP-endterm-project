# My-OOP-endterm-project
Abdykaparov Daniyar, Aidar Zhunussov, Adil Tazhi Cs-2008
create table account(
user_id int primary key,
login varchar,
password varchar,
fname varchar,
lname varchar,
balance float);

INSERT INTO public.account(
	user_id, login, password, fname, lname, balance)
	VALUES (4,'areekie3@unicef.org','obsPP58PME','Abey','Reekie',559017.67),
(5,'ckenrick4@blogs.com','AP0ugCzgORAW','Claudine','Kenrick',151811.66),
(6,'mfearnall5@clickbank.net','Vz4kOdM8fW','Mari','Fearnall',651861.49),
(7,'fphillott6@gmpg.org','fqX9zWAK','Frazer','Phillott',420390.86),
(8,'hsurgood7@timesonline.co.uk','Q9swVR','Harcourt','Surgood',960790.02),
(9,'drivelon8@so-net.ne.jp','4TWs7X','Daria','Rivelon',221319.15),
(10,'kiwanicki9@parallels.com','KG0mdSZ3on','Kim','Iwanicki',680475.19),
(11,'tcouttharta@telegraph.co.uk','U7TrJvO','Thayne','Coutthart',297803.91),
(12,'glowdeaneb@ifeng.com','rMn8nr','Gunther','Lowdeane',924203.67),
(13,'mlovemanc@ucla.edu','UxbHMRjf9b9l','Molly','Loveman',989911.58),
(14,'sclaringboldd@lycos.com','IfRPvyApwQi','See','Claringbold',966132.26),
(15,'epachecoe@google.com.au','0LUCdB58A','Elisha','Pacheco',661695.89),
(16,'doxherdf@geocities.com','9QNVpZzAo','Duffie','Oxherd',182496.02),
(17,'nmarriotg@answers.com','O3pEMtvs','Nessa','Marriot',771469.19),
(18,'jstoggellh@icq.com','esYGg5PP','Jeana','Stoggell',525072.98),
(19,'aperini@networksolutions.com','zwW6WZyq6','Augie','Perin',695063.92),
(20,'cmacmechanj@chicagotribune.com','yGqsdABt5pm','Carly','MacMechan',874011.74),
(21,'mmacveyk@census.gov','4nycxSPJLJ','Minda','Macvey',881732.62);
 
create table cars(
car_id int primary key,
car_brand varchar,
car_model varchar,
car_price float,
car_description varchar,
car_photo varchar,
car_privod varchar,
car_color varchar,
car_fuel varchar,
car_type varchar,
car_volume float,
car_mileage int,
car_city varchar,
car_year int);

INSERT INTO public.cars(
  car_id, car_brand, car_model, car_price,  car_description, car_privod, car_color, car_fuel, car_type, car_volume, car_mileage, car_city,car_year)
  VALUES (1, 'toyota', 'camri', 12540.25, 'обмен', 'FWD', 'white', 'diesel', 'sedan', 1.7, 123000, 'Moskow', 2019),
  (2, 'toyota', 'corolla', 13740.25, 'без торга', 'FWD', 'red', 'petrol', 'sedan', 2.6, 122560, 'Pekin', 2018),
  (3, 'toyota', 'land-cruiser', 955632.75, 'договарная цена', '4WD', 'black', 'diesel', 'SUV', 3.3, 456000, 'New-Yourk',2020),
  (4, 'lexus', 'LX570', 12540.45, 'обмен с доплатой', '4WD', 'green', 'petrol', 'SUV', 4.9, 152640, 'Almaty',2020),
  (5, 'lexus', 'RX350', 17440.25,  'окончательная цена', 'AWD', 'grey', 'diesel', 'crossover', 2.8, 230154, 'Berlin',2021),
  (6, 'lexus', 'ES250', 325870.25,  'без торга', 'FWD', 'blue', 'petrol', 'sedan', 1.9, 124000, 'France',2018),
  (7, 'mercedes-benz', 'E200', 156940.25, 'обмен', 'RWD', 'grey', 'diesel', 'sedan', 2.1, 132000, 'Astana',2017),
  (8, 'mercedes-benz', 'S500', 12590.25,  'договорная цена',  'RWD', 'white', 'diesel', 'sedan', 4.2, 123990, 'Kostanay',2018),
  (9, 'mercedes-benz', 'G63', 23540.25,  'окончательная цена',  '4WD', 'green', 'petrol', 'SUV', 2.6, 326000, 'Taldykorgan',2021),
  (10, 'BMW', 'X5', 96540.25,  'без торга', '4WD', 'black', 'petrol', 'crossover', 3.4, 123000, 'Semei',2020),
    (11, 'BMW', 'M3', 36540.25,  'договорная цена', 'RWD', 'white', 'diesel', 'sedan', 4.4, 632000, 'Taraz',2017),
  (12, 'BMW', '540i', 86540.25,  'окончательная цена', 'RWD', 'red', 'diesel', 'sedan', 5.4, 196300, 'Alakol',2017),
  (13, 'Audi', 'R8', 56540.25,  'обмен', '4WD', 'blue', 'petrol', 'sedan', 1.4, 193000, 'Aktobe',2018),
  (14, 'Audi', 'Q7', 96340.25, 'без торга', '4WD', 'black', 'petrol', 'crossover', 2.9, 132500, 'Aktau',2021),
  (15, 'Audi', 'A5', 89040.25, 'договорная цена',  'FWD', 'grey', 'diesel', 'sedan',3.0 , 783000, 'Alatau',2019),
  (16, 'LADA', '2114', 789540.25,  'окончательная цена',  'FWD', 'green', 'diesel', 'hatchback', 4.7, 163400, 'Almaty',2020),
  (17, 'LADA', '2107', 899540.25, 'обмен',  'RWD', 'white', 'petrol', 'sedan', 5.7, 965470, 'Astana',2017),
  (18, 'LADA', 'Granta', 965145.25,  'без торга', 'FWD', 'black', 'diesel', 'hatchback', 5.3, 985610, 'Zhambyl',2019),
  (19, 'Subaru', 'Forester', 145267.25,  'обмен с доплатой',  'AWD', 'grey', 'petrol', 'crossover', 4.8, 985400, 'Karatau',2020),
  (20, 'Subaru', 'WRX STI', 879545.25,  'окончательная цена','RWD', 'white', 'diesel', 'sedan', 3.9, 456200, 'Karaganda',2019),
  (21, 'Subaru', 'OutBack', 652140.25,  'обмен с доплатой',  'FWD', 'black', 'diesel', 'crossever', 4.8, 654400, 'Karatal',2021);
  
  
create table Offers(
offer_id  int primary key,
Car_id int,
Account_id int,
publishing_date int,
foreign key(Car_id) references cars (car_id),
foreign key (Account_id)references account(user_id));

INSERT INTO public.offers(
  offer_id, car_id, account_id, publishing_date)
  VALUES(1,1,1,12/10/2020),
(2,2,2,4/10/2020),
(6,5,5,10/31/2020),
(3,3,3,1/29/2021),
(4,4,4,12/1/2020),
(7,7,7,7/11/2020),
(8,8,8,10/19/2020),
(5,6,6,3/25/2020),
(9,9,9,4/8/2020),
(10,10,10,5/6/2020),
(11,11,11,7/3/2020),
(12,12,12,9/18/2020),
(13,13,13,11/12/2020),
(14,14,14,7/27/2020),
(15,15,15,8/7/2020),
(16,16,16,12/30/2020),
(17,17,17,1/10/2021),
(18,18,18,8/11/2020),
(19,19,19,5/18/2020),
(20,20,20,10/28/2020),
(21,21,21,9/16/2020);

create table FavoriteOffers(
Favorites_id int primary key,
Acount_id int,
Offers_id int,
foreign key (Acount_id) references account(user_id),
foreign key (offers_id) references offers(offer_id));

INSERT INTO public.favoriteoffers(
  favorites_id, acount_id, offers_id)
  VALUES (1,1,15),
(2,2,14),
(3,3,13),
(4,4,12),
(5,5,11),
(6,6,10),
(7,7,9),
(8,8,7),
(9,9,8),
(10,10,6),
(11,11,5),
(12,12,4),
(13,13,3),
(14,14,2),
(15,15,1);

