package com.student.information.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Document(collection = "students")
public class Student {

    @Id
    private String id;

    @Email(message = "invalid email address")
    private String email;

    private String password;

    @NotNull(message = "The field 'name' is Required.")
    private String name;

    @NotNull(message = "The field 'registration_type' is Required.")
    private String registration_type;

    @NotNull(message = "The field 'nationality' is Required.")
    private String nationality;

    @NotNull(message = "The field 'father_name' is Required.")
    private String father_name;

    @NotNull(message = "The field 'mother_name' is Required.")
    private String mother_name;

    @NotNull(message = "The field 'birth_date' is Required.")
    private String birth_date;

    @NotNull(message = "The field 'gender' is Required.")
    private String gender;

    @NotNull(message = "The field 'phone' is Required.")
    private String cell_phone;

    @NotNull(message = "The field 'address' is Required.")
    private String address;

    @NotNull(message = "The field 'town' is Required.")
    private String town;

    @NotNull(message = "The field 'address_country' is Required.")
    private String address_country;
    
    private String situation;

    private String studentId;

    private String state;

    private String passport_no;

    private String passport;

    private String registration_date;

    private String last_session_date;

    private String image;

    private String duration_of_study;

    private String study_language;

    private String full_information;

    private String study_plan;

    private String student_grades;

    // IF WE USE THE CODE
    private String secret;

    private String certificateName;

    private String certificateNumber;

    private String averageScore;

    private String education;

    private String description;

}
