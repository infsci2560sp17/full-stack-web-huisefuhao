# Bed and Breakfast

1. What is the proposed name for your Web application?
    - Bed and Breakfast
2. Who is the target audience for your Web application?
    - Travelers who want to live in local traditional building and experience local life style. Especially for these who are tired of standard and boring hotels.
3. What problem is it intended to solve for the target audience?
    - It is true that there are huge amount of hotels and B&B shown in the big intermediary website such as Booking, Airbnb and Agoda, however, these websites only provide limited information about each hotels for customers. This might be enough for hotels but absolutely not enough for high-class B&B since they all are unique with different great characteristics that cannot be shown in a standard way. With this kind of website, B&B can fully show their uniqueness which is key to the success of a B&B.
4. How will it meet the minimum project requirements?
    - My site will be totally free, everyone can access to all function freely except for booking a room. If users want to make an order he must create an account and log in. This sites will show the basic information, specialty, activity information and booking information about this B&B for customers and reserve their profile and booking records for each customer in the database. Users can review their profile and booking record in this website and change their profile at any time. Meanwhile, there will be a admin account for B&B operator who manage this website to update the information including change the introduction or activities information. He can also review and change his profile.
    - For technical aspect, my site will support CRUD (create, read, update and delete) and all other requirements.
5. Why is your proposed Web application unique or creative beyond simply meeting the minimum requirements?
    - My site can fully show the uniqueness of B&B to its target customer by providing more detailed information about its characteristic as well as special activity information. B&B operators can also combine this site with SNS to make word-of-mouth marketing.

## Latest Progress

Finish Project
- Details in CHANGELOG.md

## Build status


[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web-huisefuhao.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-huisefuhao)

## Changelog

[CHANGELOG](CHANGELOG.md)

## Web Site


[Neil's Website](https://pc-huisefuhao.herokuapp.com/)

![](http://www.qqtouxiang.com/d/file/qinglv/20170212/f4eabd3bede4bb63ee566c39e8652ad7.jpg)

## Key Features
User login




* Key Feature 1
* Key Feature 2
* Key Feature N

## Project Details

### Landing Page

TODO : please provide a description of your landing page inluding a screen shot ![](https://.../image.JPG)

### User Input Form

TODO : please provide a description of at least 1 user input form including a screen shot ![](https://.../image.jpg)

## API

TODO : please provide a description of at least 1 API including a sample of request data and response data in both XML and JSON format.

### API Method 1

    POST photos/:id/tags

#### Parameters

- **id** _(required)_ — The Photo ID to add tags for.
- **tags** _(required)_ — Comma separated tags.

#### Response

A JSON or XMLobject containing the PhotoID and list of tags accepted.

#### Errors

All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.

- **404 Not Found** — The photo was not found.

#### Example

##### Request

    POST /v1/photos/123456/tags

##### Body

    tags=cute,puppy


##### JSON Response

```json
{
    "photoId": 123456,
    "tags": ["cute", "puppy"]
}
```

##### XML Response

```xml
<?xml version="1.0" encoding="UTF-8"?>
<PhotoTags>
    <photoId>123456</PhotoId>
        <tags>
            <tag>cute</tag>
            <tag>puppy</tag>
        </tags>
</PhotoTags>
```

## Technologies Used

TODO : List all technologies used in your project

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.
