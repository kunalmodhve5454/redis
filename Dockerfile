FROM openjdk:17
COPY . /
WORKDIR /
CMD ["java","-jar","target/redis-0.0.1-SNAPSHOT.jar","com.cache.redis.RedisApplication"]
