# Dependency download acceleration research

## M2 Repository sizes

| Project | Uncompressed M2 Repo | Compressed tarball |
| --- | --- | --- | 
| ccud-maven-extension | 82Mb | 69Mb |
| spring-data-elasticsearch | 283Mb | 249Mb |
| develocity-bamboo-plugin | 539Mb | 461Mb |

## Results for Local

| Project | Artifactory | Tarball | 
| --- | --- | --- | 
| ccud-maven-extension | [8 sec](https://ge.solutions-team.gradle.com/s/ajmeb2jmfm67i) | [8 sec](https://ge.solutions-team.gradle.com/s/3b3mlhy3lelbm) |
| spring-data-elasticsearch | [19 sec](https://ge.solutions-team.gradle.com/s/ozpmyiyirjttm) | [16 sec](https://ge.solutions-team.gradle.com/s/2moofosizlqs6) |
| develocity-bamboo-plugin | [51 sec](https://ge.solutions-team.gradle.com/s/shiheqy5so426) | [45 sec](https://ge.solutions-team.gradle.com/s/53r6slf23x2iq) |

## Results for Remote

| Project  | Artifactory | Tarball |
| --- | --- | --- |
| ccud-maven-extension | [39 sec](https://ge.solutions-team.gradle.com/s/yjz7bfye4wyic) | [14 sec](https://ge.solutions-team.gradle.com/s/7ecfwtocimdzi) |
| spring-data-elasticsearch | [95 sec](https://ge.solutions-team.gradle.com/s/ndm5l7qdh2na4) | [37 sec](https://ge.solutions-team.gradle.com/s/5zlgeghbtnxn6) |
| develocity-bamboo-plugin | [289 sec](https://ge.solutions-team.gradle.com/s/f5xcdyvizxeey) | [74 sec](https://ge.solutions-team.gradle.com/s/jm4z4754ijcck) |

## Raw Results

### Local - restore from local tarball, read from local Artifactory

#### common-custom-user-data-maven-extension

```
Building common-custom-user-data-maven-extension with dependencies from local Artifactory
====== Build with Artifactory complete
Building common-custom-user-data-maven-extension with dependencies from local tarball
====== Build from tarball complete

Artifactory build: 8 sec
Tarball build: 8 sec
 - Extract tarball: 1 sec
```

#### spring-data-elasticsearch

```
Building spring-data-elasticsearch with dependencies from local Artifactory
====== Build with Artifactory complete
Building spring-data-elasticsearch with dependencies from local tarball
====== Build from tarball complete

Artifactory build: 19 sec
Tarball build: 16 sec
 - Extract tarball: 3 sec
```

#### develocity-bamboo-plugin

```
Building develocity-bamboo-plugin with dependencies from local Artifactory
====== Build with Artifactory complete
Building develocity-bamboo-plugin with dependencies from local tarball
====== Build from tarball complete

Artifactory build: 51 sec
Tarball build: 45 sec
 - Extract tarball: 12 sec
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

Artifactory build: 39 sec
Tarball build: 14 sec
 - Download and extract tarball: 7 sec
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

Artifactory build: 95 sec
Tarball build: 37 sec
 - Download and extract tarball: 21 sec
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

Artifactory build: 289 sec
Tarball build: 74 sec
 - Download and extract tarball: 41 sec
```
