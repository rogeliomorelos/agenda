package io.devops4fun.agenda.repository;

import io.devops4fun.agenda.entity.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * @author rogeliomorelos
 * @createdOn 26/04/2021 10:26 p. m.
 */
@Repository
@RepositoryRestResource(collectionResourceRel = "friend", path = "friend")
public interface FriendRepository extends JpaRepository<Friend, Integer> {
}
