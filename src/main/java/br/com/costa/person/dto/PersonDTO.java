package br.com.costa.person.dto;

import br.com.costa.person.enums.PersonType;
import lombok.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    @NotNull
    private String name;

    @NotNull
    @Min(0)
    @Max(130)
    private Integer age;

    @NotNull
    @Enumerated(EnumType.STRING)
    private PersonType gender;
}
