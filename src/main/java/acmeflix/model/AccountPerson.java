package acmeflix.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@ToString(callSuper = true)
@SuperBuilder
public class AccountPerson extends BaseModel{
    private String firstName;
    private String lastName;
    private int age;
}
