package com.gennadiysinigur.blog.repo;

import com.gennadiysinigur.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
