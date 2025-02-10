package com.gautam.splitz.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.gautam.splitz.entity.UserInfo;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@JsonNaming (PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserInfoDto extends UserInfo
{

    private String firstName;

    private String lastName;

    private Long phoneNumber;

    private String email;

}