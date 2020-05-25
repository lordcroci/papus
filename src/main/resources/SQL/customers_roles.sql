--mysql 8
DROP TABLE IF EXISTS user_role;
CREATE TABLE user_role (
  user_id BIGINT NOT NULL,
  role_id BIGINT NOT NULL,
  PRIMARY KEY (user_id,role_id),
  KEY fk_user_role_roleid_idx (role_id),
  CONSTRAINT fk_user_role_roleid FOREIGN KEY (role_id) REFERENCES role (id) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT fk_user_role_userid FOREIGN KEY (user_id) REFERENCES user (id) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--postgres 12
CREATE TABLE customers_roles (
  customers_id bigint REFERENCES customers (id) ON UPDATE CASCADE ON DELETE CASCADE,
  roles_id bigint REFERENCES roles (id) ON UPDATE CASCADE ON DELETE CASCADE,
  CONSTRAINT customers_roles_pkey PRIMARY KEY (customers_id, roles_id)
	)