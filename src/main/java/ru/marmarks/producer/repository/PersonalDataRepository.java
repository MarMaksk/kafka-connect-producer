package ru.marmarks.producer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.marmarks.producer.entity.PersonalData;

@Repository
public interface PersonalDataRepository extends JpaRepository<PersonalData, Long> {

}
