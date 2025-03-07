docker pull postgres:latest
docker volume create postgres-volume
docker run --name my-postgres \
  -e POSTGRES_PASSWORD=password \
  -v postgres-volume:/var/lib/postgresql/data \
  -p 5432:5432 \
  -d postgres

# connect localhost 5432 username sa password
