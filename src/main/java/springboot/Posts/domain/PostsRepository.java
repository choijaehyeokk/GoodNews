package springboot.Posts.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> {

    //Spring JPA에서 제공하지 않는 쿼리 같은경우
    @Query("SELECT p from Posts p ORDER BY p.id desc ")
    List<Posts> findAllDesc();
}
