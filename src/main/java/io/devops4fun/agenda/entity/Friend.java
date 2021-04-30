package io.devops4fun.agenda.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author rogeliomorelos
 * @createdOn 26/04/2021 09:49 p. m.
 */
@Data
@NoArgsConstructor
@Entity(name = "Friend")
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "name is required")
    private String name;

    @Column(name = "last_name")
    @NotNull(message = "lastName is required")
    private String lastName;

    @NotNull(message = "birthday is required")
    private Date birthday;

    @Column(name = "phone_number")
    @NotNull(message = "phoneNumber is required")
    private String phoneNumber;
}
