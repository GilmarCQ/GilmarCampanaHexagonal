package com.codigo.msregistro.domain.impl;

import com.codigo.msregistro.domain.aggregates.response.ResponseSunat;
import com.codigo.msregistro.domain.ports.in.SunatServiceIn;
import com.codigo.msregistro.domain.ports.out.RestSunatOut;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SunatServiceImpl implements SunatServiceIn {

    private final RestSunatOut sunat;

    @Override
    public ResponseSunat getInfoin(String numero) {
        return sunat.getInfoSunat(numero);
    }
}
