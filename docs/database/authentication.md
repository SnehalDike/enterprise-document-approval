+-----------+
| USER      |
+-----------+
| id        |
| username  |
| email     |
| password  |
| active    |
| createdAt |
| updatedAt |
+-----------+
      |
      | Many
      |
+---------------+
| USER_ROLE     |
+---------------+
| user_id       |
| role_id       |
+---------------+
      |
      |
      | Many
      |
+-----------+
| ROLE      |
+-----------+
| id        |
| name      |
| description|
+-----------+
