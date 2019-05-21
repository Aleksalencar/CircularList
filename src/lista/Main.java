package lista;

public class Main {

	public static void main(String[] args) {
		CircularList lista = new CircularList();
		try {
			lista.insertFirst(new DNode("1 º "));
			lista.insertLast(new DNode("A, "));
			lista.insertLast(new DNode("B, "));
			lista.insertFirst(new DNode("vai ser removido "));
			lista.insertLast(new DNode("C, "));
			lista.insertLast(new DNode("D, "));
			lista.show(1);
			lista.removeFirst();
			lista.show(2);
		} catch (Exception e) {
			System.out.println("ERRO: Impossível remover!");
			e.printStackTrace();
			}
		}
	
		
	}
