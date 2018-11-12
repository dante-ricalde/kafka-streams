# Builds a docker image for Confluent's example applications for the Kafka Streams API
ARG DOCKER_UPSTREAM_REGISTRY
ARG DOCKER_UPSTREAM_TAG=latest

FROM ${DOCKER_UPSTREAM_REGISTRY}confluentinc/cp-base:${DOCKER_UPSTREAM_TAG}

RUN echo '***************** Dante Dockerfile *****************'

ARG STREAMS_VERSION
ARG ARTIFACT_ID

MAINTAINER partner-support@confluent.io
LABEL io.confluent.docker=true
ARG COMMIT_ID=unknown
LABEL io.confluent.docker.git.id=$COMMIT_ID
ARG BUILD_NUMBER=-1
LABEL io.confluent.docker.build.number=$BUILD_NUMBER

WORKDIR /build
ENV COMPONENT="${ARTIFACT_ID}"





