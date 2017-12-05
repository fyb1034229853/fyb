package com.itheima.service;

import com.itheima.domain.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

public interface UserService {
    @Path("/user")
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @POST
     void save(User user);
    @Path("/user")
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @DELETE
    void delete(@QueryParam("id") Integer id);
    @Path("/user")
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @PUT
    void update(User user);
    @Path("/user")
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @GET
    List<User> findAll();
    @Path("/user/{id}")
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @GET
    User findById(@PathParam("id") String id);
    @Path("/user")
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @GET

    User findById1(@QueryParam("id") String id);
}
