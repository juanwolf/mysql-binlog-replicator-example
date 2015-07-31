package fr.juanwolf.mysqlbinlogreplicator.example.dao;

import fr.juanwolf.mysqlbinlogreplicator.example.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

/**
 * Created by juanwolf on 27/07/15.
 */
public interface UserRepository extends ElasticsearchCrudRepository<User, Integer> {
}
