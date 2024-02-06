package oguzhan.mavi.BlogApps.controller;

import oguzhan.mavi.BlogApps.model.Post;
import oguzhan.mavi.BlogApps.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
@CrossOrigin(origins ="*")
public class PostController {

    @Autowired
    private PostService postService;


    @CrossOrigin(origins = "https://localhost:3000")
    @GetMapping
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable Long id){
        return postService.getPostById(id);
    }

    @PostMapping
    public Post savePost(@RequestBody Post post){
        return postService.savePost(post);
    }

    @DeleteMapping("/{id}")
    public  void deletePost(@PathVariable Long id){
        postService.deletePost(id);
    }

}
