# Thymeleaf with Spring Boot
- Thymeleaf is a server-side Java template engine that can be integrated with Spring Boot. It allows for the creation of dynamic web pages with HTML, CSS, and JavaScript. This tutorial will cover the following concepts in Thymeleaf: Iteration, Conditional Statements, Fragments, Inheriting Thymeleaf Template, and how to add custom and bootstrap JS and CSS files.

## Prerequisites
- To follow this tutorial, you will need:
1. Java 8 or later installed
2. Spring Boot 2.1.0 or later
3. A basic understanding of HTML, CSS, and JavaScript

## Setting up a Spring Boot project with Thymeleaf
- Add the Thymeleaf dependency to your project's pom.xml file:

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
```

## Thymeleaf Concepts
### Iteration

- Thymeleaf provides a simple way to iterate over collections using the th:each attribute.

### Conditional Statements
- Elvis
```
<h1>User is <span th:style="${isActive} ? 'color:green':'color:red'" th:text="${isActive} ? 'ACTIVE' : 'NOT ACTIVE'"></span></h1>
```
- If Unless
```
<h1 th:if="${gender}=='M'">User is Male</h1>
<h1 th:unless="${gender}=='M'">User is Female</h1>
```
- Switch
```
<div th:switch="${#lists.size(lon)}">
		<h1 th:case="'0'">List is empty</h1>
		<h1 th:case="'1'">List contains one element</h1>
		<h1 th:case="*">List contains more than one elements</h1>
</div>
```

## Inheriting Thymeleaf Templates

- Thymeleaf allows you to define templates that can be inherited by other templates. You can use the th:replace attribute to inherit a template.

```
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org" th:fragment="layout(content)">
<head>
	<meta charset="UTF-8" />
	<title>Base Page</title>
</head>
<body>

	<h1>Common Header for Website</h1>
	
	<div th:replace="${content}">
		
	</div>
	
	<h1>Common Footer for Website</h1>

</body>
</html>
```

## Adding Custom and Bootstrap CSS and JS Files

- To add custom CSS and JS files to your Thymeleaf templates, you can use the th:href attribute. This attribute allows you to specify the location of the file.

```

```
