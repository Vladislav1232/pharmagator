ALTER TABLE pharmacies (
    id bigserial primary key,
    name varchar(256) not null,
    medicine_link_template varchar(256)
    FOREIGN KEY (pharmacy_id) REFERENCES prices(id)
);

ALTER TABLE medicines (
    id bigserial primary key,
    title varchar(256)
    FOREIGN KEY (medicine_id) REFERENCES prices(id)
);

ALTER TABLE prices (
    pharmacy_id bigint,
    medicine_id bigint,
    price decimal(10, 2) not null,
    external_id varchar(100) not null,
    updated_at timestamp not null default now()
);