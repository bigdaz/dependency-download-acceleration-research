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
| ccud-maven-extension | [46 sec](https://ge.solutions-team.gradle.com/s/x4ydjq4o2inua) | [11 sec](https://ge.solutions-team.gradle.com/s/hmfetl4oeevim) |
| spring-data-elasticsearch | [113 sec](https://ge.solutions-team.gradle.com/s/ksyz57sdygcwi) | [32 sec](https://ge.solutions-team.gradle.com/s/srpthbrgqs4la) |
| develocity-bamboo-plugin | [276 sec](https://ge.solutions-team.gradle.com/s/6tb33nnw2slka) | [55 sec](https://ge.solutions-team.gradle.com/s/h5sduwdpfpj3c) |

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
