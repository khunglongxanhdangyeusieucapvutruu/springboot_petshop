create table admin
(
    ad_id int primary key ,
    ad_name varchar(100),
    ad_phone char(10),
    ad_personid char(13),
    ad_gender boolean,
    ad_birthday datetime,
    ad_password varchar(100),
    ad_role tinyint(1)
)


create table customer
(
    ctm_id int primary key,
    ctm_name varchar(100),
    ctm_phone char(10),
    ctm_email char(50),
    ctm_address varchar(255),
    ctm_password varchar(100),
    ctm_gender boolean,
    ctm_can_feedback boolean
)

create table discount
(
    dc_code varchar(50) primary key,
    dc_description varchar(100),
    dc_condition int,
    dc_value int,
    dc_value_percent double,
    dc_start_time datetime,
    dc_end_time datetime
)

create table pet
(
    pet_id int primary key,
    pet_name varchar(100),
    pet_type boolean,
    pet_species varchar(100),
    pet_gender boolean,
    pet_note text,
    ctm_id int,
    constraint fk_pet_customer foreign key (ctm_id) references customer(ctm_id)
)



create table category_news
(
   cn_id int primary key,
   cn_name varchar(100)
)



create table news
(
   news_id int primary key,
   news_title varchar(100),
   news_description varchar(100),
   news_content text,
   news_img text,
   news_date_release datetime,
   ad_id int,
   cn_id int,
   constraint fk_news_admin foreign key (ad_id) references admin(ad_id),
   constraint fk_news_category foreign key (cn_id) references category_news(cn_id)
)



create table category_service
(
    cs_id int primary key,
    cs_name varchar(100)
)



create table service
(
   sv_id int primary key,
   sv_name varchar(100),
   sv_price double,
   sv_description varchar(100),
   sv_pet boolean,
   cs_id int,
   constraint fk_service_category foreign key (cs_id) references category_service(cs_id)
)



create table material
(
   mtr_id int primary key,
   mtr_name varchar(100),
   mtr_quantity int
)



create table detail_service
(
    sv_id int,
    mtr_id int,
    quantity int,
    constraint fk_ds_service foreign key (sv_id) references service(sv_id),
    constraint fk_ds_material foreign key (mtr_id) references material(mtr_id),
    constraint pk_detail_service primary key  (sv_id,mtr_id)
)



create table appointment
(
    apm_id int primary key,
    apm_time datetime,
    apm_status tinyint(1),
    ctm_id int,
    constraint fk_appointment foreign key (ctm_id) references customer(ctm_id)
)



create table detail_appointment
(
    apm_id int,
    sv_id int,
    constraint fk_da_service foreign key (sv_id) references service(sv_id),
    constraint fk_da_appointment foreign key (apm_id) references appointment(apm_id),
    constraint pk_detail_appointment primary key  (sv_id,apm_id)
)



create table bill 
(
    bill_id int primary key,
    bill_date_release datetime,
    ctm_id int,
    ad_id int,
    dc_code varchar(50),
    constraint fk_bill_customer foreign key (ctm_id) references customer(ctm_id),
    constraint fk_bill_admin foreign key (ad_id) references admin(ad_id),
    constraint fk_bill_discount foreign key (dc_code) references discount(dc_code)
)



create table detail_bill 
(
    bill_id int,
    sv_id int,
    quantity int,
    sv_price double,
    pet_id int,
    constraint fk_do_service foreign key (sv_id) references service (sv_id),
    constraint fk_do_bill  foreign key (bill_id) references bill (bill_id),
    constraint pk_detail_bill  primary key  (bill_id,sv_id)
)



create table feedback
(
    fb_id int primary key,
    fb_content text,
    fb_time datetime,
    ctm_id int,
    constraint fk_feedback_ctm foreign key (ctm_id) references customer(ctm_id)
)


create table shop_info
(
    shop_name varchar(150),
    shop_address varchar(150),
    shop_phone char(13),
    shop_description text,
    shop_facebook varchar(255),
    shop_website varchar(255),
    shop_banner varchar(255),
    shop_logo varchar(255)
)