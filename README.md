# MongoDB Java Technical Assessment Project

This project was initialized using the [Spring Initializer](https://start.spring.io/) with the following dependencies:

* Spring Web
* Spring Data MongoDB
* Spring Boot DevTools
* Lombok

![](docs/SS%202024-11-28%2012.22.23.png)

## Purpose

This project can be used during a technical interview to assess the Java programming capabilities of a candidate. Successful completion of the assessment would result in a web application that can create new named items and descriptions, which can also be filtered.

![](docs/SS%202024-11-28%2014.19.45.png)

## Preparation

Make sure you're prepared to clone and run Java code. Specifically you'll need:

* an IDE such as [Visual Studio Code](https://code.visualstudio.com/download) or [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/other.html)
* Java 17
* [Apache Maven](https://maven.apache.org/download.cgi)

Note that if you're on macOS and have [Homebrew](https://brew.sh/) available you can install Java and Maven by entering `brew install openjdk@17 maven`.

## Tasks

* Configure the Spring Data MongoDB application with the provided connection string
* Review the application structure and explain how the various Spring Data components fit together
* Setup the `Item` model with appropriate property accessors
* Using Maven or Gradle, build and start the application and navigate to http://localhost:8080 to verify it works
* Create a couple items via the UI
* Using the API, list all created items
* Create an API method for deleting an item by Id, then delete an item using this API
* [Optional] Inspect the backing JavaScript file to identify what API call is used for searching, then work backwards to enable this functionality

## Additional Resources

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.0/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.0/maven-plugin/build-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.4.0/reference/web/servlet.html)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/3.4.0/reference/data/nosql.html#data.nosql.mongodb)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/3.4.0/reference/using/devtools.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)

## License

Copyright 2024-present, Alex Bevilacqua

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the “Software”), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.