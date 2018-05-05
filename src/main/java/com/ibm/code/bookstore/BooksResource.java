package com.ibm.code.bookstore;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Tag(ref = "Bookstore")
@Path("/books")
@Produces(MediaType.APPLICATION_JSON)
public class BooksResource {

    @Operation(summary = "Get the list of available books")
    @APIResponses({
        @APIResponse(description = "The list of available books"),
        @APIResponse(responseCode = "5XX",
                     description = "Error while obtaining the list of books",
                     content = @Content(mediaType = MediaType.TEXT_PLAIN,
                                        schema = @Schema(type = SchemaType.STRING,
                                                         example = "Failed to obtain the list of books from the backend store")))
    })
    @GET
    public List<Book> getBooks() {
        return Arrays.asList(new Book("Mistrz i Małgorzata", "Michaił Bułhakow"),
                new Book("Skarb w Srebrnym Jeziorze", "Karol May"));
    }

}
