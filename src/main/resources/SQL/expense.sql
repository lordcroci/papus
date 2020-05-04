CREATE TABLE expense(
	id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id BIGINT NOT NULL,
    amount DECIMAL NOT NULL,
    description VARCHAR(255),
    on_date DATETIME,
    INDEX user_id_indx (user_id),
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES user(id) ON DELETE CASCADE
)ENGINE=INNODB;