package cloud.blog.entities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.HashSet;
import java.util.UUID;

import org.junit.jupiter.api.Test;

class PostTest {
	
	@Test
	void testPostIdentity() {
		UUID uuid = UUID.randomUUID();
		var post1 = new Post(uuid);
		var post2 = new Post(uuid);
		var post3 = new Post(null);

		var set = new HashSet<>(){
			{
				add(post1);
				add(post2);
			}
		};
		
		assertEquals(post1, post2);
		assertNotEquals(post1, "any");
		assertNotEquals(post1, null);
		assertEquals(post1, post1);
		assertNotEquals(post3, post1);
		assertEquals(set.size(),1);
	}
}
