package com.sdhsie.railway.common.utils;

import org.springframework.web.util.UriTemplate;

import java.net.URI;

/**
 */
public class URIUtils {

    public static URI createURI(String url, Object... uriVariableValues) {
        return new UriTemplate(url).expand(uriVariableValues);
    }

}
