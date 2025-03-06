
CREATE TABLE users (
                     id INT AUTO_INCREMENT PRIMARY KEY,
                     username VARCHAR(50) NOT NULL UNIQUE,
                     email VARCHAR(100) NOT NULL UNIQUE,
                     password_hash VARCHAR(255) NOT NULL,
                     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE posts (
                     id INT AUTO_INCREMENT PRIMARY KEY,
                     user_id INT NOT NULL,
                     title VARCHAR(255) NOT NULL,
                     content TEXT NOT NULL,
                     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                     updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);


ALTER TABLE posts ADD FOREIGN KEY (user_id) REFERENCES users(id);
