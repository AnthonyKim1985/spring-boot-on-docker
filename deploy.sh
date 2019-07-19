#!/usr/bin/env bash

argc=$#
args=("$@")

#
# TODO: Cleaning up old built files
#
function cleanUpOldBuiltFiles() {
    echo "Cleaning up old built files is activated"
    /bin/bash clean-up.sh
}
cleanUpOldBuiltFiles

#
# TODO: Building up sources, and making docker image
#
function buildUpSourcesAndMakingDockerImage() {
    echo "Building up sources, and making docker image are activated."
    /bin/bash build-up.sh
}
buildUpSourcesAndMakingDockerImage

echo "Job's done"
