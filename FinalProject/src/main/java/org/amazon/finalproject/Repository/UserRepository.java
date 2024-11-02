package org.amazon.finalproject.Repository;

import org.amazon.finalproject.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
