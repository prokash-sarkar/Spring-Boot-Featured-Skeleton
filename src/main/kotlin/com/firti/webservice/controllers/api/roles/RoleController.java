package com.firti.webservice.controllers.api.roles;


import com.firti.webservice.entities.Role;
import com.firti.webservice.entities.User;
import com.firti.webservice.entities.annotations.CurrentUser;
import com.firti.webservice.exceptions.forbidden.ForbiddenException;
import com.firti.webservice.exceptions.notfound.UserNotFoundException;
import com.firti.webservice.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/roles")
public class RoleController {
    private final RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("")
    private ResponseEntity getMyRoles(@CurrentUser User currentUser) throws ForbiddenException, UserNotFoundException {
        List<Role> roles = this.roleService.findByUser(currentUser.getId());
        return ResponseEntity.ok(roles);
    }

}
