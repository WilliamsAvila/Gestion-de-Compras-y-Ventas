package org.amazon.finalproject.DTO;

import lombok.Data;

/**
 * Data transfer object for passing information for adding a role to a user
 */
@Data
public class RoleToUserDTO {

    private String username;

    private String roleName;
}
