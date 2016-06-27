package com.solarvillage.permit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/structural")
public class StructuralPermitService {

	@GET
	@Path("/requestPermit/{name},{address}")
	public boolean requestPermit(@PathParam("name") String name,
			@PathParam("address") String address) {
		boolean b = Math.random() < 0.5;
		System.out
				.println("[REST Web Service] Structural Permit Service Requested for "
						+ name + " - result: " + b);
		return b;
	}

	@GET
	@Path("/cancelPermit/{name},{address}")
	public boolean cancelPermit(@PathParam("name") String name,
			@PathParam("address") String address) {
		System.out.println("[REST Web Service] Structural Permit Canceled for "
				+ name + " !!!");
		return true;
	}
}
