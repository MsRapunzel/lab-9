/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.msrapunzel;

/**
 *
 * @author msrapunzel
 */
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/metadata")
public class MetadataController {

    @Inject
    private MetadataService metadataService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMetadata() {
        return metadataService.getBeanMetadata();
    }
}
