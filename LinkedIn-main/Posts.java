package com.LinkedInApp;

public class Posts {
private String post1;
    
    public void setPost(String post1){  
       this.post1 = post1;  
    }  

	public String getPost(){  
       return post1;  
    }  
   
	public PostDetails savePostToPostDetails(){  
        return new PostDetails(post1);  
     }  
    
     public void getPostFromPostDetails(PostDetails p){  
        post1 = p.getPost1();  
     }

}
