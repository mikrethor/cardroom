insert into CARDROOM("ID","OPERATOR","DOMAIN", "URL") values (1, 'Winamax', 'fr', 'https://www.winamax.fr/');

insert into PLAYER("ID","NAME","CARDROOM_ID") values (1, 'name_player', 1);

insert into ACCOUNT("ID","PLAYER_ID") values (1, 1);

insert into HAND("ID","CARDROOM_ID","HAND_DATE") values (1, 1,CURRENT_DATE);
