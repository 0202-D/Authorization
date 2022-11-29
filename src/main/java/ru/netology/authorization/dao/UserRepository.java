package ru.netology.authorization.dao;

import org.springframework.stereotype.Repository;
import ru.netology.authorization.model.Authorities;

import java.util.List;
@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        return null;
    }
}
