FROM postgres:13

RUN apt update -y && apt upgrade -y
ADD ./Data/init.sql /docker-entrypoint-initdb.d/init.sql
RUN chmod 644 /docker-entrypoint-initdb.d/init.sql
