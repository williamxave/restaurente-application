package com.restaurante.application.service.client.domain;

import java.util.List;

public record ClientDomain(

        String name,
        String cpf,
        String email,
        List<String> phoneNumber

) {
}