--mysql8
CREATE TABLE expenses(
	id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id BIGINT NOT NULL,
    amount DECIMAL NOT NULL,
    description VARCHAR(255),
    on_date DATE,
    INDEX user_id_indx (user_id),
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES user(id) ON DELETE CASCADE
)ENGINE=INNODB;

--postgres12
CREATE TABLE expenses(
	id BIGSERIAL PRIMARY KEY,
    customer_id bigint NOT NULL,
    amount DECIMAL NOT NULL,
    description VARCHAR(255),
    on_date DATE,
    FOREIGN KEY (customer_id) REFERENCES customers(id) ON DELETE CASCADE
)