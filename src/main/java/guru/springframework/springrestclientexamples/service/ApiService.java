package guru.springframework.springrestclientexamples.service;

import org.apache.catalina.User;

import java.util.List;

public interface ApiService {
    List<User> getUsers(Integer limit);
}
