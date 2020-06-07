DROP TABLE IF EXISTS cities;
 
CREATE TABLE cities (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL
);

INSERT INTO cities (name) VALUES
  ('Tokyo'),
  ('Rio de Janeiro'),
  ('Amsterdam'),
  ('New York'),
  ('London'); 