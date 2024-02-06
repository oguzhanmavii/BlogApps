package oguzhan.mavi.BlogApps.service;

import oguzhan.mavi.BlogApps.model.Post;

import java.util.List;

public interface PostService {
    List<Post> getAllPosts();
    Post getPostById(Long id);
    Post savePost(Post post);
    void deletePost(Long id);
}
