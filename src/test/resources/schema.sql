DROP TABLE IF EXISTS stores;
 
CREATE TABLE stores (
  storeId VARCHAR(20)  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  description VARCHAR(250) DEFAULT NULL,
  placeId VARCHAR(20) DEFAULT NULL,
  floorNo VARCHAR(20) DEFAULT NULL,
  storePos VARCHAR(20) DEFAULT NULL
);


INSERT INTO stores (
  storeId,
  name,
  description,
  floorNo,
  placeId,
  storePos
) VALUES (
  'mnginasal00001',
  'Mang Inasal',
  'Chicken Inasal, Unlimited Rice',
  '0001',
  'SMNORTHANNEXQC',
  '0001'
), (
  'brickovenl00001',
  'Brick Oven',
  'Steak and pork chop cooked on brick oven',
  '0001',
  'SMNORTHANNEXQC',
  '0002'
),(
  'persianave00001',
  'Persian Avenue',
  'Beef wraps and more',
  '0001',
  'SMNORTHANNEXQC',
  '0020'
),(
  'pizzahut00001',
  'Pizza Hut',
  'Freshly cooked pizza for family',
  '0001',
  'SMNORTHANNEXQC',
  '0010'
),(
  'test00001',
  'Test Only',
  'For Testing Purposes',
  '0002',
  'SMNORTHANNEXQC',
  '0099'
);