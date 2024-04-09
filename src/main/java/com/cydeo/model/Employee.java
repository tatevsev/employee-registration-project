package com.cydeo.model;

import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Employee {

  //  @NotNull //  @NotNull
  //  @NotEmpty // @NotEmpty + @NotNull
   // @NotBlank // @NotBlank + @NotEmpty + @NotNull

    @NotBlank
    @Size(max=12,min=2)
    private String firstName;
    private String lastName;

    //Thymeleaf accepts yyyy-MM-dd, but LocalDate accepts mm-dd-yyyy

   // @NotNull
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate birthday;

    //@NotBlank
    //@Email
    private String email;

    //@NotBlank
    //@Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,}")
    private String password;

    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipcode;



}
