package guru.springframework.springrestclientexamples.service;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {
    private final RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {
        ResponseEntity<List<User>> responseEntity = restTemplate.exchange(
                "https://jsonplaceholder.typicode.com/users?_limit=" + limit,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<User>>() {});

        return responseEntity.getBody();
    }
}
