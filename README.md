# Dependency download acceleration research

## Results for Local

| Project | Artifactory | Tarball | 
| --- | --- | --- |
| ccud-maven-extension | [5](https://ge.solutions-team.gradle.com/s/y6o33ojuipick) | [5](https://ge.solutions-team.gradle.com/s/qdtcmayfmvfq2) | 
| spring-data-elasticsearch | [13](https://ge.solutions-team.gradle.com/s/zilrhevq46vly) | [12](https://ge.solutions-team.gradle.com/s/igeab5ltqylvm) |
| develocity-bamboo-plugin | [38](https://ge.solutions-team.gradle.com/s/e4aomaddflt4g) | [31](https://ge.solutions-team.gradle.com/s/t7l4q65fhcffm) |

## Results for Remote

| Project  | Artifactory | Tarball |
| --- | --- | --- |
| ccud-maven-extension | [46](https://ge.solutions-team.gradle.com/s/x4ydjq4o2inua) | [11](https://ge.solutions-team.gradle.com/s/hmfetl4oeevim) |
| spring-data-elasticsearch | [113](https://ge.solutions-team.gradle.com/s/ksyz57sdygcwi) | [32](https://ge.solutions-team.gradle.com/s/srpthbrgqs4la) |
| develocity-bamboo-plugin | [276](https://ge.solutions-team.gradle.com/s/6tb33nnw2slka) | [55](https://ge.solutions-team.gradle.com/s/h5sduwdpfpj3c) |

## Raw Results

### Local - restore from local tarball, read from local Artifactory

#### common-custom-user-data-maven-extension

```
Building common-custom-user-data-maven-extension with dependencies from local Artifactory
====== Build with Artifactory complete
Building common-custom-user-data-maven-extension with dependencies from local tarball
====== Build from tarball complete

Artifactory build: 5 sec
Tarball build: 5 sec
```

#### spring-data-elasticsearch

```
Building spring-data-elasticsearch with dependencies from local Artifactory
====== Build with Artifactory complete
Building spring-data-elasticsearch with dependencies from local tarball
====== Build from tarball complete

Artifactory build: 13 sec
Tarball build: 12 sec
 - Extract tarball: 3 sec
```

#### develocity-bamboo-plugin

```
Building develocity-bamboo-plugin with dependencies from local Artifactory
====== Build with Artifactory complete
Building develocity-bamboo-plugin with dependencies from local tarball
====== Build from tarball complete

Artifactory build: 38 sec
Tarball build: 31 sec
 - Extract tarball: 13 sec
```

### Remote - download and restore tarball from S3, read from AWS-hosted Artifactory

#### common-custom-user-data-maven-extension

```
Building common-custom-user-data-maven-extension with dependencies from remote Artifactory
====== Build with Artifactory complete
Building common-custom-user-data-maven-extension with dependencies from remote tarball
cp s3://daz-test-dependency-downloads/m2_repo-common-custom-user-data-maven-extension.tgz m2_repo.tgz
Tarball downloaded
Tarball extracted
====== Build from tarball complete

Artifactory build: 46 sec
Tarball build: 11 sec
 - Download and extract tarball: 8 sec
```

#### spring-data-elasticsearch

```
Building spring-data-elasticsearch with dependencies from remote Artifactory
====== Build with Artifactory complete
Building spring-data-elasticsearch with dependencies from remote tarball
cp s3://daz-test-dependency-downloads/m2_repo-spring-data-elasticsearch.tgz m2_repo.tgz
Tarball downloaded
Tarball extracted
====== Build from tarball complete

Artifactory build: 113 sec
Tarball build: 32 sec
 - Download and extract tarball: 24 sec
```

#### develocity-bamboo-plugin

```
Building develocity-bamboo-plugin with dependencies from remote Artifactory
====== Build with Artifactory complete
Building develocity-bamboo-plugin with dependencies from remote tarball
cp s3://daz-test-dependency-downloads/m2_repo-develocity-bamboo-plugin.tgz m2_repo.tgz
Tarball downloaded
Tarball extracted
====== Build from tarball complete

Artifactory build: 276 sec
Tarball build: 55 sec
 - Download and extract tarball: 37 sec
```
