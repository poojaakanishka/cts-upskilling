# Event Management SQL

## Run MySQL with Docker

```bash
docker run -d \
  --name mysql-events \
  -e MYSQL_ROOT_PASSWORD=root \
  -e MYSQL_DATABASE=event_management \
  -v "$(pwd):/docker-entrypoint-initdb.d" \
  -v mysql-data:/var/lib/mysql \
  -p 3306:3306 \
  mysql:latest
```

### What it does

| Flag | Purpose |
|------|---------|
| `-e MYSQL_ROOT_PASSWORD=root` | Sets root password |
| `-e MYSQL_DATABASE=event_management` | Creates database on startup |
| `-v "$(pwd):/docker-entrypoint-initdb.d"` | Mounts current dir — MySQL auto-runs `init.sql` from here |
| `-v mysql-data:/var/lib/mysql` | Named volume for persistent data |
| `-p 3306:3306` | Exposes port 3306 |

### Connect

```bash
docker exec -it mysql-events mysql -u root -p
# password: root
```

### Connection Strings

| Type | String |
|------|--------|
| **MySQL CLI** | `mysql -u root -p -h 127.0.0.1 -P 3306` |
| **JDBC** | `jdbc:mysql://127.0.0.1:3306/event_management` |
| **Python (mysql-connector)** | `mysql.connector.connect(host="127.0.0.1", user="root", password="root", database="event_management")` |
| **Node.js (mysql2)** | `mysql.createConnection({host:"127.0.0.1", user:"root", password:"root", database:"event_management"})` |
| **DBeaver / MySQL Workbench** | Host: `127.0.0.1`, Port: `3306`, User: `root`, Password: `root`, Database: `event_management` |
