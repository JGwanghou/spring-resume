package com.resume.gwangho.infrastructure;

import com.resume.gwangho.controller.dto.ProfileApiResponse;
import com.resume.gwangho.repository.ProfileApiGateway;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.nio.charset.StandardCharsets;

@Component
@RequiredArgsConstructor
public class ProfileImpl implements ProfileApiGateway {

    private static final Logger log = LoggerFactory.getLogger(ProfileImpl.class);

    @Override
    public ProfileApiResponse externalProfileData() {
        log.info("외부 API 호출 시작");
        URI uri = UriComponentsBuilder
                .fromUriString("http://121.130.28.118:8080")
                .path("/BTLMS/ALPAS_TEST.do")
                .queryParam("name", "조광호")
                .encode(StandardCharsets.UTF_8)
                .build()
                .toUri();

        log.info("생성된 URI: {}", uri.toString());

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<ProfileApiResponse> response = restTemplate.getForEntity(uri, ProfileApiResponse.class);
        log.info("API 응답1: {}", response.getBody().getImg());
        log.info("API 응답2: {}", response.getBody().getText());

        log.info("외부 API 호출 종료");
        return response.getBody();
    }
}
