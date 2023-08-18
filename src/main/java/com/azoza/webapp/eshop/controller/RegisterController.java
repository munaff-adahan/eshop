package com.azoza.webapp.eshop.controller;

import com.azoza.webapp.eshop.dto.RegisterDTO;
import com.azoza.webapp.eshop.entity.User;
import com.azoza.webapp.eshop.service.UserService;
import com.azoza.webapp.eshop.util.Encryption;
import com.azoza.webapp.eshop.util.HibernateUtil;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.hibernate.SessionFactory;

import java.util.UUID;

@Path("/register")
public class RegisterController {
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response register(RegisterDTO registerDTO){

        UserService userService = new UserService();
        User byEmail = userService.getByEmail(registerDTO.getEmail());


        if(byEmail != null){
           return Response.status(Response.Status.BAD_REQUEST).entity("Email Already exists").build();
        }else{
            User user = new User();
            user.setEmail(registerDTO.getEmail());

            user.setPassword(Encryption.encrypt(registerDTO.getPassword()));

            String verificationCode = UUID.randomUUID().toString();

            user.setVerification_code(verificationCode);

            userService.save(user);

            return Response.ok().entity("Register Success").build();
        }


    }
}
