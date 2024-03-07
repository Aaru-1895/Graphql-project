package com.graphql.Graphqlproject.repository;

import com.graphql.Graphqlproject.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Integer> {
}
