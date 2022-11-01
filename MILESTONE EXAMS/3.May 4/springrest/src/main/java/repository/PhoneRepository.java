package repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mobile.Phone;


@Repository
public interface PhoneRepository extends CrudRepository<Phone, Integer> {

}