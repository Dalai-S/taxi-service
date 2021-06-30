package taxi.service;

import taxi.controller.exception.AuthenticationException;
import taxi.model.Driver;

public interface AuthenticationService {
    Driver login(String username, String password) throws AuthenticationException;
}
