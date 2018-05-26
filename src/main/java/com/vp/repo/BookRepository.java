package com.vp.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vp.domain.Books;

@RepositoryRestResource(path="books", collectionResourceRel="books")
public interface BookRepository extends PagingAndSortingRepository<Books, Long> {

}
