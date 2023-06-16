package com.example.demo.dto;

import com.example.demo.entity.User;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
	@NotBlank(message="not blank")
	private String name;
	@Size(min=3,max=20)
	private String place;

}
