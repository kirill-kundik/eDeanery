package Application.service;

import Application.dao.UserRequestRepository;
import Application.model.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
Doubling methods here to use them in @Controller and easily implement other requirements to information from DB
 */

@Service
public class UserRequestService {

    @Autowired
    private UserRequestRepository userRequestRepository;

    public List<UserRequest> findAll() {
        return userRequestRepository.findAll();
    }

    public List<UserRequest> findByAnswered(boolean isAnswered) {
        return userRequestRepository.findByIsAnswered(isAnswered);
    }

    public void save(UserRequest userRequest) {
        userRequestRepository.save(userRequest);
    }
}
