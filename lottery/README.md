# lottery API 용 README

## Environment
```
$ java --version
openjdk 11.0.19 2023-04-18
OpenJDK Runtime Environment (Red_Hat-11.0.19.0.7-2.fc38) (build 11.0.19+7)
OpenJDK 64-Bit Server VM (Red_Hat-11.0.19.0.7-2.fc38) (build 11.0.19+7, mixed mode, sharing)

$ ./gradlew -v

------------------------------------------------------------
Gradle 7.6
------------------------------------------------------------

Build time:   2022-11-25 13:35:10 UTC
Revision:     daece9dbc5b79370cc8e4fd6fe4b2cd400e150a8

Kotlin:       1.7.10
Groovy:       3.0.13
Ant:          Apache Ant(TM) version 1.10.11 compiled on July 10 2021
JVM:          11.0.19 (Red Hat, Inc. 11.0.19+7)
OS:           Linux 6.3.8-200.fc38.x86_64 amd64
```

## 이미지 작성

### 개발 환경
1. 이미지 빌드/태그 작성
    - `docker build -t ljusvita/lottery_springboot:0.0.1 .`
2. 이미지 업로드
    - `docker push ljusvita/lottery_springboot:0.0.1`
