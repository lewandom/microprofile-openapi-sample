package com.ibm.code.bookstore;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@OpenAPIDefinition(info = @Info(title = "Bookstore API",
                                version = "1.0",
                                description = "Get information on available books"),
                   servers = @Server(url = "http://localhost:9080/bookstore",
                                     description = "My development environment"),
                   tags = @Tag(name = "Bookstore"))
@ApplicationPath("/")
public class BookstoreApp extends Application {

}
