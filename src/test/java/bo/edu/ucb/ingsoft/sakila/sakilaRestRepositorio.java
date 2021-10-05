package bo.edu.ucb.ingsoft.sakila;


import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "citys", path = "citys")
public interface sakilaRestRepositorio extends PagingAndSortingRepository<city, Integer> {

    
    List<city> findByTitle(@Param("title") String title);
}