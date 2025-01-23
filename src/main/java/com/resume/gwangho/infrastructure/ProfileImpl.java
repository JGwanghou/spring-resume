package com.resume.gwangho.infrastructure;

import com.resume.gwangho.controller.ProfileApiResponse;
import com.resume.gwangho.repository.ProfileApiGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class ProfileImpl implements ProfileApiGateway {
    private RestTemplate restTemplate;

    @Override
    public ProfileApiResponse externalProfileData() {
        restTemplate = new RestTemplate();

        return null;
    }
}
