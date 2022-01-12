package com.LinkedInApp;

import java.util.ArrayList;
import java.util.List;

public class PreviousPosts {
List<PostDetails> posts1=new ArrayList<>();
	
	public void add(PostDetails posts){  
        posts1.add(posts);  
     }  

	public int displaypost()
    {
		int count=0;
   	 	for(PostDetails pd:posts1) {
   		 System.out.println("\t"+pd.getPost1());
   		 count++;
   	 }
   	 	return count;
    }
	
     public PostDetails get(int index){  
        return posts1.get(index);  
     }
     
     public void deletePost(PostDetails index)
     {
    	 posts1.remove(index);
     }
     
}
