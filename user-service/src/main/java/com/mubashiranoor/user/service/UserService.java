package com.mubashiranoor.user.service;

import com.mubashiranoor.user.entity.UserAccount;
import com.mubashiranoor.user.repository.UserRepository;
import com.mubashiranoor.user.vo.Department;
import com.mubashiranoor.user.vo.ResponseTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;
    public UserAccount saveUser(UserAccount user) {
        return userRepository.save(user);
    }


    public UserAccount getUserById(Long id) {
        return userRepository.getUserByUserId(id);
    }

    public ResponseTemplate getUserWithDepartment(Long id) {
        ResponseTemplate responseTemplate = new ResponseTemplate();
        UserAccount user = getUserById(id);
        Department department = restTemplate.getForObject("http://localhost:9091/departments/"+user.getDepartmentId(),Department.class);
        responseTemplate.setUserAccount(user);
        responseTemplate.setDepartment(department);
        return responseTemplate;

    }
}
