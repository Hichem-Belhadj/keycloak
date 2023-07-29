# Keycloak Integration with Spring Boot 3

This project shows how to secure a Spring Boot application using Keycloak, a powerful open-source identity and access management tool. This work is based on a tutorial by [Ali Bouali](https://www.youtube.com/watch?v=vmEWywGzWbA&t=1569s).

## List of dependencies

- Spring WEB
- Spring Oauth2 Resource Server
- Spring Security
- Lombok

## Features

- Single Sign-On (SSO) with OpenID Connect
- Role-Based Access Control (RBAC)
- Fine-Grained Authorization

## Prerequisites

- Java 17+
- Maven
- Keycloak Server 21+

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Keycloak Setup

1. Download the [Keycloak](https://www.keycloak.org/downloads) server and unzip it in the directory of your choice.
2. Once the file has been unzipped, go to your server directory and run the following command:
    ```bash
    bin/kc.bat start-dev --http-port 8180
    ```
   By default the port used by Keyloak is 8080 you can omit the command ```--http-port 8180```