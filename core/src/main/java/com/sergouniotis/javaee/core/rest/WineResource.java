package com.sergouniotis.javaee.core.rest;

import java.util.Collection;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sergouniotis.javaee.core.domain.Wine;
import com.sergouniotis.javaee.core.services.WineService;

@ApplicationScoped
@Path("/wine")
public class WineResource {

	@Inject
	private WineService wineService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response doGet() {
		Collection<Wine> res = wineService.findAll();
		return Response.ok(res).build();
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response load() {
		Collection<Wine> res = wineService.load();
		return Response.ok(res).build();
	}

}
