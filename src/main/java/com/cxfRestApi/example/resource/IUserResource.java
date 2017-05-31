package com.cxfRestApi.example.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cxfRestApi.example.beans.UserBean;

import in.benchresources.cdm.user.User;

@Path("/userService")
public interface IUserResource {

	// http://localhost:8080/cxf-restApi-example/services/userService/getUser/564
	@GET
	@Path("getUser/{userId}")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public User getUserInfo(@PathParam("userId") int userId);
	
	// http://localhost:8080/cxf-restApi-example/services/userService/getUserBean/123
	@GET
	@Path("getUserBean/{id}")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public UserBean getUserDetails(@PathParam("id") int userId);
	
	// http://localhost:8080/cxf-restApi-example/services/userService/getUserBean/123
	@GET
	@Path("getAllUsers")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public List<UserBean> getAllUsers();
}
