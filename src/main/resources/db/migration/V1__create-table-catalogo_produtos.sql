CREATE TABLE catalogo_produtos(
    id TEXT PRIMARY KEY UNIQUE NOT NULL,
    name TEXT NOT NULL,
    price_in_cents FLOAT NOT NULL
);