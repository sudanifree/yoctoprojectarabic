SUMMARY = "Minimal image with the Java 17 runtime"
LICENSE = "MIT"

require recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL:append = " openjdk-17-jre"