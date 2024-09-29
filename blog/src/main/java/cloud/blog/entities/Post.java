package cloud.blog.entities;

import java.util.UUID;

public class Post {

	private final UUID id;
	public Post(UUID id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {

		if(obj ==null || obj.getClass() != getClass()) return false;//Proteção do cast

		Post post = (Post) obj;//cast
		return id.equals(post.id);
	}
	
	

}
