# spring-boot-on-docker
<h4> 1. 준비사항</h4>
<h5>(1) docker 및 docker compose 설치</h5>
<h5>(2) hub.docker.com 계정 생성</h5>
계정 생성 후 아래와 같이 터미널에서 로그인 합니다.<br>

```
$ sudo docker login
Login with your Docker ID to push and pull images from Docker Hub. If you don't have a Docker ID, head over to https://hub.docker.com to create one.
Username: xxxxxxx
Password: 
Login Succeeded
```

<h5>(3) hub.docker.com 계정 생성</h5>
push-on-registry.sh 파일에서 dockerHubId 변수에 docker hub 계정으로 초기화합니다.
<h4> 2. 배포방법</h4>
deploy.sh 스크립트는 코드를 빌드하고 이미지화하여 docker hub에 이미지를 배포합니다. 

```
./deploy.sh
```

<h4> 3. 실행방법</h4>
docker-compose를 이용하여 실행합니다.<br>
 