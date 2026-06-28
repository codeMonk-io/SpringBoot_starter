package net.engineeringdigest.journalApp.service;

import lombok.extern.slf4j.Slf4j;
import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Slf4j
@Component
public class UserService {

    //  rn JournalEntryRepository is an interface, and we autowired for depend... inject...
    //  at runtime its implementation will be stored in JournalEntry repository
    @Autowired
    private UserRepository userRepository;

    public void saveEntry(User user) {
         try {
             userRepository.save(user);
         }
         catch (Exception e) {
             log.error("Exception" ,e);
         }
    }

    public User findByUserName(String username){
        return userRepository.findByUsername(username);
    }

    public  List<User> getAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(ObjectId id) {
        return userRepository.findById(id);
    }

    public void deleteById(ObjectId id) {
         userRepository.deleteById(id);
    }

}


