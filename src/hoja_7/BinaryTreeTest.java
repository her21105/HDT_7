package hoja_7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class BinaryTreeTest {

	

	
	@Test
	void testExiste() {
		BinaryTree tree = new BinaryTree();
		String spa = "hola";
		String eng = "hello";
		tree.insertar(eng,spa);
		
		
		
		assertTrue(tree.existe(eng));
		
	}

	@Test
	void testTraduccion() {
		BinaryTree tree = new BinaryTree();
		String spa = "hola";
		String eng = "hello";
		tree.insertar(eng,spa);
		

		assertEquals(spa, tree.traduccion(eng));
		
	}

	@Test
	void testInsertar() {
		BinaryTree tree = new BinaryTree();
		
		boolean mediador = false;
		
		String spa = "hola";
		String eng = "hello";
		tree.insertar(eng,spa);
		
		if(tree.existe(eng) && spa.equalsIgnoreCase(tree.traduccion(eng))) {
			
			mediador = true;
			
		}
		
		assertTrue(mediador);
	}

	@Test
	void testTraducir() {
		BinaryTree tree = new BinaryTree();
		
		String spa = "hola";
		String eng = "hello";
		String spa2 = "caballo";
		String eng2 = "horse";
		String aux = "*horse*";
		boolean mediador = false;
		tree.insertar(eng,spa);
		
		if(spa.equalsIgnoreCase(tree.traducir(eng)) && aux.equalsIgnoreCase(tree.traducir(eng2))) {
			
			mediador = true;
			
		}
		
		assertTrue(mediador);
		
	}

	@Test
	void testPreorden() {
		BinaryTree tree = new BinaryTree();
		
		String uno = "a";
		String dos = "b";
		String tres = "c";
		
		tree.insertar(uno, uno);
		tree.insertar(dos, dos);
		tree.insertar(tres, tres);
		
		
	}

	@Test
	void testInorden() {
		BinaryTree tree = new BinaryTree();
		
		
		
		
	}

	@Test
	void testPostorden() {
		BinaryTree tree = new BinaryTree();
		
		
		
		
	}

}
