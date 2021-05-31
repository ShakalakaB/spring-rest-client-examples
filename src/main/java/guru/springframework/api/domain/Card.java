package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Card implements Serializable {
    private String type;
    private Long number;
    private ExpirationDate expirationDate;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
