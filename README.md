# JavaEE 7 and Angular5 application

Serves the [Wine](https://archive.ics.uci.edu/ml/datasets/wine) dataset utilizing [JavaEE 7](https://docs.oracle.com/javaee/7/), [Angular5](https://angular.io/), [Angular Material](https://material.angular.io/) , [Wildfly 10](http://wildfly.org/news/2016/01/29/WildFly10-Released/), [Postgres 9.5](https://www.postgresql.org/docs/9.5/static/release-9-5.html), [Liquibase](http://www.liquibase.org/) and [Docker](https://www.docker.com/).

This is uses just as a demo application or it can be used as the basis of more complicated applications with the same technology stack.

Based on the official images:

* [java](https://hub.docker.com/_/openjdk/)
* [postgres](https://hub.docker.com/_/postgres/)

# Requirements

## Setup

1. Install [Maven](https://maven.apache.org/install.html).
2. Install [NodeJs](https://nodejs.org/en/download/) 
3. Install [Docker](http://docker.io).
4. Install [Docker-compose](http://docs.docker.com/compose/install/).
5. Clone this repository

# Usage

Build using maven

```bash
$ mvn clean install docker:build
```

Start the app stack using *docker-compose*:

```bash
$ docker-compose up
```

You can also choose to run it in background (detached mode):

```bash
$ docker-compose up -d
```
