INSERT INTO users (username, email, password_hash, created_at)
VALUES ('CaptainIgnight', 'captain@ignight.com', 'hashed_password_here', CURRENT_TIMESTAMP);


INSERT INTO posts (user_id, title, content, created_at, updated_at)
VALUES
  (1, 'Mastering Flyway for Database Migrations', 'Flyway is an open-source database migration tool that strongly favors simplicity and convention over configuration. In this post, we''ll explore how to effectively use Flyway in your Java projects for seamless database schema evolution...', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
  (1, 'Spring Boot: Simplifying Java Development', 'Spring Boot has revolutionized the way we develop Java applications by providing a powerful and flexible framework that emphasizes convention over configuration. In this comprehensive guide, we''ll delve into the key features of Spring Boot...', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
  (1, 'Gradle: The Powerful Build Tool for Java Projects', 'Gradle is a build automation tool that combines the flexibility of Ant with the dependency management and conventions of Maven in a more effective way. This post will cover Gradle''s core concepts, its advantages over other build tools, and how to set up a basic Java project using Gradle...', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
