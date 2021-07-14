package entities;

public class Product {
	// Atributos do objeto
	private String name;
	private double price;
	private int quantity;

	// Construtor Padrão
	public Product() {

	}

	// Construtor Personalizado
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// Construtor sobrecarga
	public Product(String name, double price) {
		this.name = name;
		this.price = price;

	}

	// Gets and Seters

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {

		return name;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	// Este metodo de controle de quantida somente sera alterado com entradas ou saidas 
	// diertamente no estoque Desta forma nao podera ser alterado via metodos para segurança do seu estoque
	public int getQuantity() {
		return quantity;
	}
	
	
	/// Metodos operações
	
	public double totalValueInStock() {
		return price * quantity;

	}

	public void addProducts(int quantity) {

		this.quantity += quantity;

	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;

	}

	public String toString() {
		return name + ", $" + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());

	}

}
