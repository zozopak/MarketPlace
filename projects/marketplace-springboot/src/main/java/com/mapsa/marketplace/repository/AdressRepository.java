package com.mapsa.marketplace.repository;

import com.mapsa.marketplace.model.Adress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource
@Repository
public interface AdressRepository extends JpaRepository<Adress,Long> {

}
