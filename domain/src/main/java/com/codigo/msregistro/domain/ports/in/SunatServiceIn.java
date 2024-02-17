package com.codigo.msregistro.domain.ports.in;

import com.codigo.msregistro.domain.aggregates.response.ResponseSunat;

public interface SunatServiceIn {
    ResponseSunat getInfoin(String numero);
}
