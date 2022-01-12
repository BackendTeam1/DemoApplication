package com.LinkedInApp;

public class PostDisplay {
	public void display(String name){
	
	Posts post = new Posts();  
    PreviousPosts previousPost =new PreviousPosts();  
    post.setPost("post no 1");  
    previousPost.add(post.savePostToPostDetails());  
    post.setPost("post no 2");  
    previousPost.add(post.savePostToPostDetails());  
    post.setPost("post no 3");  
    previousPost.add(post.savePostToPostDetails());  
    post.setPost("post no 4");
    previousPost.add(post.savePostToPostDetails());  
    post.setPost("post no 5");
    previousPost.add(post.savePostToPostDetails());
    
    System.out.println("Recent post by "+name+" is :" + post.getPost());          
    post.getPostFromPostDetails(previousPost.get(0));  
    System.out.println();
    System.out.println("Oldest post by "+name+ " is: " + post.getPost());  
    System.out.println();
    System.out.println("All the posts uploaded by "+name+": ");
    int cnt=previousPost.displaypost();
    System.out.println();
    System.out.println("Total Posts by "+name+": "+cnt);
    System.out.println();
    
    //delete posts
    System.out.println("******************************************");
    post.getPostFromPostDetails(previousPost.get(1)); 
    System.out.println(post.getPost()+" deleted! by "+name);
    System.out.println();
    
    previousPost.deletePost(previousPost.get(1));
    System.out.println("Posts by "+name+": ");
    int count=previousPost.displaypost();
    
    System.out.println();
    System.out.println("Total Posts by "+name+": "+count);
    System.out.println();
    
    //restore the posts
    System.out.println("*************************************");
    post.setPost("post no 2");
    previousPost.add(post.savePostToPostDetails());
    System.out.println("Previous Deleted post restored!\n");
    System.out.println("Posts by "+name+": ");
    int count1=previousPost.displaypost();
    System.out.println();
    System.out.println("Total Posts by "+name+": "+count1);
    System.out.println();
	}
}
