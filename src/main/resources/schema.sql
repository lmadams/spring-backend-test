CREATE TABLE category (
  id          INTEGER       NOT NULL AUTO_INCREMENT,
  name        VARCHAR(255)  NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE product (
  id            INTEGER       NOT NULL AUTO_INCREMENT,
  name          VARCHAR(50)   NOT NULL,
  category_id   INTEGER       NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_product_category   FOREIGN KEY (category_id)   REFERENCES category(id),
);
