package cloud.blog.entities;

import java.util.Objects;
import java.util.UUID;

public class Post {

	private final UUID id;
	public Post(UUID id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)return true;
		if(obj == null || obj.getClass() != getClass()) return false;//Proteção do cast

		Post post = (Post) obj;//cast
//		return id.equals(post.id);
		return Objects.equals(id, post.id);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}
}
