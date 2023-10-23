package Objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Tienda {
	private static Set<Producto> articulos = new TreeSet<>();
	private static List<Cliente> clientes = new ArrayList<>();
	private static Map<Cliente,List<Producto>> compras = new TreeMap<>();
	
	private static  void aniadirCompras(Cliente  c, Producto a) {
		if (!compras.containsKey(c)) {
			compras.put(c, new ArrayList<>() );
			
			
		}
		compras.get(c).add(a);
		
		
	}
	
	
	
	

}
