package com.gradle.develocity.bamboo;

/**
 * Describes a set of Maven coordinates, represented as a GAV.
 */
public final class MavenCoordinates {

    private final String groupId;
    private final String artifactId;
    private final String version;

    public MavenCoordinates(String groupId, String artifactId) {
        this(groupId, artifactId, "unspecified");
    }

    public MavenCoordinates(String groupId, String artifactId, String version) {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
    }

    public static MavenCoordinates parseCoordinates(String groupAndArtifact) {
        if (groupAndArtifact == null || groupAndArtifact.trim().isEmpty()) {
            return null;
        } else {
            String[] ga = groupAndArtifact.split(":");
            if (ga.length == 2) {
                return new MavenCoordinates(ga[0], ga[1]);
            } else if (ga.length == 3) {
                return new MavenCoordinates(ga[0], ga[1], ga[2]);
            } else {
                return null;
            }
        }
    }

    String groupId() {
        return groupId;
    }

    String artifactId() {
        return artifactId;
    }

    String version() {
        return version;
    }

    @Override
    public String toString() {
        return String.format("%s:%s:%s", groupId, artifactId, version);
    }

}
