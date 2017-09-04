# pho-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>pho-java-client</artifactId>
    <version>1.1.1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:pho-java-client:1.1.1"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/pho-java-client-1.1.1.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.*;
import org.auth.*;
import io.swagger.client.model.*;
import org.phonetworks.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        String value = "value_example"; // String | The value to update the key with.
        try {
            InlineResponse2004 result = apiInstance.addAttribute(value);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#addAttribute");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://virtserver.swaggerhub.com/phonetworks/server-rest/1.1.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**addAttribute**](docs/DefaultApi.md#addAttribute) | **POST** /{uuid}/attribute/{key} | updates (or creates) an attribute
*DefaultApi* | [**delAttribute**](docs/DefaultApi.md#delAttribute) | **DELETE** /{uuid}/attribute/{key} | deletes an attribute
*DefaultApi* | [**delEntity**](docs/DefaultApi.md#delEntity) | **DELETE** /{uuid} | deletes an entity
*DefaultApi* | [**getAllEdges**](docs/DefaultApi.md#getAllEdges) | **GET** /{uuid}/edges/all | retrieves the edges of a node
*DefaultApi* | [**getAttribute**](docs/DefaultApi.md#getAttribute) | **GET** /{uuid}/attribute/{key} | retrieves the value of an entity attribute
*DefaultApi* | [**getAttributes**](docs/DefaultApi.md#getAttributes) | **GET** /{uuid}/attributes | retrieves the existing attribute keys of an entity (edge or node)
*DefaultApi* | [**getEdge**](docs/DefaultApi.md#getEdge) | **GET** /edge/{uuid} | retrieves an edge
*DefaultApi* | [**getEdgeGetters**](docs/DefaultApi.md#getEdgeGetters) | **GET** /{uuid}/edges/getters | retrieves the edge getter methods of a node
*DefaultApi* | [**getEdgeSetters**](docs/DefaultApi.md#getEdgeSetters) | **GET** /{uuid}/edges/setters | retrieves the edge setter methods of a node
*DefaultApi* | [**getFounder**](docs/DefaultApi.md#getFounder) | **GET** /founder | retrieves the Graph Founder
*DefaultApi* | [**getGraph**](docs/DefaultApi.md#getGraph) | **GET** /graph | retrieves the main Graph
*DefaultApi* | [**getIncomingEdges**](docs/DefaultApi.md#getIncomingEdges) | **GET** /{uuid}/edges/in | retrieves the incoming edges of a node
*DefaultApi* | [**getNode**](docs/DefaultApi.md#getNode) | **GET** /{uuid} | retrieves a node
*DefaultApi* | [**getNodeEdge**](docs/DefaultApi.md#getNodeEdge) | **GET** /{uuid}/{edge} | edge getter
*DefaultApi* | [**getOutgoingEdges**](docs/DefaultApi.md#getOutgoingEdges) | **GET** /{uuid}/edges/out | retrieves the outgoing edges of a node
*DefaultApi* | [**getSpace**](docs/DefaultApi.md#getSpace) | **GET** /space | retrieves the Space
*DefaultApi* | [**getType**](docs/DefaultApi.md#getType) | **GET** /{uuid}/type | fetches entity type
*DefaultApi* | [**makeActor**](docs/DefaultApi.md#makeActor) | **POST** /actor | creates an Actor object
*DefaultApi* | [**makeEdge**](docs/DefaultApi.md#makeEdge) | **POST** /{uuid}/{edge} | creates an edge
*DefaultApi* | [**setAttribute**](docs/DefaultApi.md#setAttribute) | **PUT** /{uuid}/attribute/{key} | updates (or creates) an attribute


## Documentation for Models

 - [Edge](docs/Edge.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2003In](docs/InlineResponse2003In.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [Node](docs/Node.md)
 - [NodeEdge](docs/NodeEdge.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

emre@phonetworks.org

