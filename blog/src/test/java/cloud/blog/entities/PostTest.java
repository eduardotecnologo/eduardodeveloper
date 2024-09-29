package cloud.blog.entities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.UUID;

import org.junit.jupiter.api.Test;

class PostTest {
	
	@Test
	void testPostIdentity() {
		UUID uuid = UUID.randomUUID();
		var post1 = new Post(uuid);
		var post2 = new Post(uuid);
		
		assertEquals(post1, post2);
		assertNotEquals(post1, "any");
		assertNotEquals(post1, null);


	}
}
