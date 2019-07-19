#!/bin/bash

argc=$#
args=("$@")

for ((i=1; i<${argc}; i+=2));
do
    host=${args[$i]}
    port=${args[$i + 1]}

    >&2 echo "Wait for ${host} dependency";
    >&2 echo "run nc -z ${host} ${port}";

    while ! nc -z ${host} ${port};
    do
      >&2 echo "The ${host} is not ready - waiting...";
      sleep 1;
    done;
    >&2 echo "The ${host} has been connected.";
done

>&2 echo "run java -Dspring.profiles.active=${args[0]} -cp app:app/lib/* com.example.springbootondocker.SpringBootOnDockerApplication"
java -Dspring.profiles.active=${args[0]} -cp app:app/lib/* com.example.springbootondocker.SpringBootOnDockerApplication