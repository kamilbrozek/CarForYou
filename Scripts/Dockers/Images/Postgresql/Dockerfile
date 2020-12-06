FROM postgres:13

RUN apt update -y && apt upgrade -y
COPY ./Data/init.sql /docker-entrypoint-initdb.d/init.sql

