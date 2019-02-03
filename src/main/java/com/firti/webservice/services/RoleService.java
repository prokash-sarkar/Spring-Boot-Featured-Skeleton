package com.firti.webservice.services;


import com.firti.webservice.entities.Role;
import com.firti.webservice.exceptions.forbidden.ForbiddenException;
import com.firti.webservice.exceptions.notfound.UserNotFoundException;

import java.util.List;

public interface RoleService {
    Role findRole(Role.ERole role);
    Role findByRole(String role);
    Role save(Role role);

    List<Role> findByUser(Long userId) throws ForbiddenException, UserNotFoundException;
}
