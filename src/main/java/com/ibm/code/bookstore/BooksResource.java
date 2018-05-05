package com.ibm.code.bookstore;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/books")
@Produces(MediaType.APPLICATION_JSON)
public class BooksResource {

    @GET
    public List<Book> getBooks() {
        return Arrays.asList(new Book("Mistrz i Małgorzata", "Michaił Bułhakow"),
                new Book("Skarb w Srebrnym Jeziorze", "Karol May"));
    }

}
