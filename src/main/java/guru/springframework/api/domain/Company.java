package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Company implements Serializable {
    private String name;
    private String catchPhrase;
    private String bs;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
