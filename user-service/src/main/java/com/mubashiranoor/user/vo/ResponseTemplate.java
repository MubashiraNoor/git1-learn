package com.mubashiranoor.user.vo;

import com.mubashiranoor.user.entity.UserAccount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplate {
    private UserAccount userAccount;
    private Department department;
}
