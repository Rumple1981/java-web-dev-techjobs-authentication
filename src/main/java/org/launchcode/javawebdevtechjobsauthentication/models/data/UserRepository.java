package org.launchcode.javawebdevtechjobsauthentication.models.data;

import org.launchcode.javawebdevtechjobsauthentication.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;
import java.util.List;

@Repository
public interface UserRepository extends CrudRepository {
    User findByUsername(String username);

//    public class EventTagDTO {
//
//        @NotNull
//        private User username;
//
//        public EventTagDTO() {}
//
//        public User getUser() {
//            return username;
//        }
//
//        public void setUser(User user) {
//            this.username = user;
//        }

    }



