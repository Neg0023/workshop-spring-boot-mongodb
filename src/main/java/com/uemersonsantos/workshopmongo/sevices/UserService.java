package com.uemersonsantos.workshopmongo.sevices;

import com.uemersonsantos.workshopmongo.domain.User;
import com.uemersonsantos.workshopmongo.repository.UserRepository;
import com.uemersonsantos.workshopmongo.sevices.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
