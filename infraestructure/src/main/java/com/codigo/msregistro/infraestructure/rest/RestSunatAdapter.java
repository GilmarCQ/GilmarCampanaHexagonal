package com.codigo.msregistro.infraestructure.rest;

import com.codigo.msregistro.domain.aggregates.response.ResponseSunat;
import com.codigo.msregistro.domain.ports.out.RestSunatOut;
import com.codigo.msregistro.infraestructure.rest.client.ClienteSunat;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestSunatAdapter implements RestSunatOut {

    private final ClienteSunat sunat;

    @Value("apis-token-7322.2Jfv1sfhOiZzKnro3Uo1DOmKtsUn4k3w")
    private String tokenApi;

    @Override
    public ResponseSunat getInfoSunat(String numero) {
        String authorization = "Bearer " + tokenApi;
        ResponseSunat responseSunat = sunat.getInfoSunat(numero,authorization);
        return responseSunat;
    }
}
