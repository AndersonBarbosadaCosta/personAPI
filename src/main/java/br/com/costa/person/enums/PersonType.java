package br.com.costa.person.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PersonType {

    MALE("male"), FEMALE("female");

    private final String description;
}
