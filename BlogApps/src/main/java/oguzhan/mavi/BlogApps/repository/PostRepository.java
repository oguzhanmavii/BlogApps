package oguzhan.mavi.BlogApps.repository;

import oguzhan.mavi.BlogApps.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
