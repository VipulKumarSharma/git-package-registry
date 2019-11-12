# git-package-registry

<b>1. Add Dockerfile in project's root directory</b>

    FROM openjdk:8-jdk-alpine
    COPY target/git-package-registry-0.0.1-SNAPSHOT.jar git-package-demo.jar
    EXPOSE 8080
    ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "git-package-demo.jar"]
    
<b>2. Add code & build the project</b>

    mvn clean install
    
<b>3. Build docker image (with name mentioned in Dockerfile) & check the same</b>

    docker build . -t git-package-demo:v1
    docker images
    
<b>4. Add Tag to docker image</b>

    docker tag git-package-demo:v1 docker.pkg.github.com/vipulkumarsharma/git-package-registry/git-package-demo:v1

<b>5. Login to github docker repo (using Github Token keys)</b>

    docker login docker.pkg.github.com -u VipulKumarSharma -p <GH_KEY>
    
<b>6. Push docker image to github package registry</b>

    docker push docker.pkg.github.com/vipulkumarsharma/git-package-registry/git-package-demo:v1

<hr>
<i>Note : Use account name in lowercase only (in URL & tagging)</i>
