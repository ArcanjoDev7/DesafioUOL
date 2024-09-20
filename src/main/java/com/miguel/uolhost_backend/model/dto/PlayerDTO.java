package com.miguel.uolhost_backend.model.dto;

import com.miguel.uolhost_backend.model.GroupType;

public record PlayerDTO(
        String name,
        String email,
        String phoneNumber,
        GroupType groupType
) {
}
