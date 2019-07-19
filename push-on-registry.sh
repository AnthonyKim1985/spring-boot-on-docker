#!/usr/bin/env bash

argc=$#
args=("$@")

#
# TODO: Initializing parameters
#
function init() {
    baseName=$(/bin/bash gradlew -q printBaseName)
    version=$(/bin/bash gradlew -q printVersion)
    dockerHubId="hyuk0628"
}
init

#
# TODO: Pushing images on registry
#
function pushImagesOnRegistry() {
    echo "Pushing images on registry"
    docker tag ${baseName}:${version} ${dockerHubId}/${baseName}:${version}
    docker push ${dockerHubId}/${baseName}:${version}
    echo "The deployment for ${dockerHubId}/${baseName}:${version} has been completed."

    docker tag ${baseName}:${version} ${dockerHubId}/${baseName}:latest
    docker push ${dockerHubId}/${baseName}:latest
    echo "The deployment for ${dockerHubId}/${baseName}:latest has been completed."
}
pushImagesOnRegistry
