FROM artifacts.platform.avalara.io:443/orl-docker-local/java:openjdk8.432.06-alpine3.20
WORKDIR /
ADD ./target/FeatureToggleService.jar FeatureToggleService.jar
ENTRYPOINT ["java", "-Dprocess.name=FeatureToggleService", "-jar", "FeatureToggleService.jar"]
