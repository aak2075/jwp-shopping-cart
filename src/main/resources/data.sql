DROP TABLE IF EXISTS PRODUCT;

CREATE TABLE IF NOT EXISTS PRODUCT (
     id          INT         NOT NULL AUTO_INCREMENT,
     name       VARCHAR(11)         NOT NULL,
     image_url      TEXT(500)     NOT NULL,
     price      DECIMAL(10,2)         NOT NULL,
     created_at  DATETIME    NOT NULL default current_timestamp,
     PRIMARY KEY (id)
);
