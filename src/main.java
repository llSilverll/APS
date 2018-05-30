import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String menu =  "/--------------------------------\\" + "\n" +
							 "| 01 - Listar todos os produtos  |\n" +
							 "| 02 - Listar por tipo           |\n" +
							 "| 03 - Buscar por codigo         |\n" +
							 "| 04 - Buscar por validade       |\n" +
							 "| 05 - Buscar por quantidade     |\n" +
							 "| 06 - Buscar por estoques vazios|\n" +
							 "| 07 - Adicionar produto         |\n" +
							 "| 08 - Remover produto           |\n" +
							 "| 09 - Vender produto            |\n" +
							 "| 10 - Comprar produto           |\n" +
							 "| 00 - Cancelar                  |\n" +
							 "\\________________________________/\n";
		
		System.out.print(menu);
		
		Scanner reader = new Scanner(System.in);
		gerenciarProdutos gerProd = new gerenciarProdutos();
		
		String command = "", subC = "";
		
		while (command != "0" && command != "00") {
			command = reader.nextLine();
			
			switch (command) {
			case "1": case "01":
				gerProd.listarTudo();
				break;
				
			case "2": case "02":
				System.out.print("Digite o tipo: ");
				reader = new Scanner(System.in);
				subC = reader.nextLine();
				gerProd.listarTipo(subC);
				break;
				
			case "3": case "03":
				System.out.print("Digite o codigo: ");
				reader = new Scanner(System.in);
				subC = reader.nextLine();
				int cod = -1837593;
				while (cod == -1837593) {
					try {
						cod =  Integer.parseInt(subC);
					}
					catch (Exception e) {
						System.out.println("Digitar um numero!!");
					}
				}
				gerProd.buscar(cod);
				break;
				
			case "4": case "04":
				System.out.print("Digite a validade: ");
				reader = new Scanner(System.in);
				subC = reader.nextLine();
				Date validade = new Date(1190, 1, 1);
				while (validade == new Date(1190, 1, 1)) {
					try {
						validade = new Date(subC);
					}
					catch (Exception e) {
						System.out.println("Digitar uma data no formato dd/MM/yyyy !!");
					}
				}
				gerProd.listarPorValidade(validade);
				break;
				
			case "5": case "05":
				System.out.print("Digite a quantidade: ");
				reader = new Scanner(System.in);
				subC = reader.nextLine();
				int qtd = -1837593;
				while (qtd == -1837593) {
					try {
						qtd =  Integer.parseInt(subC);
					}
					catch (Exception e) {
						System.out.println("Digitar um numero!!");
					}
				}
				gerProd.listarEstoqueMenorQue(qtd);
				break;
				
			case "6": case "06":
				gerProd.listarEstoqueMenorQue(0);
				break;
				
			case "7": case "07":
				break;
				
			case "8": case "08":
				System.out.print("Digite o codigo: ");
				reader = new Scanner(System.in);
				subC = reader.nextLine();
				int codigo = -1837593;
				while (codigo == -1837593) {
					try {
						codigo =  Integer.parseInt(subC);
					}
					catch (Exception e) {
						System.out.println("Digitar um numero!!");
					}
				}
				gerProd.remover(codigo);
				break;
				
			case "9": case "09":
				System.out.print("Digite o codigo: ");
				int codgo = -1837593, quanti = -1;
				while (codgo == -1837593) {
					try {
						reader = new Scanner(System.in);
						subC = reader.nextLine();
						codgo =  Integer.parseInt(subC);
					}
					catch (Exception e) {
						System.out.println("Digitar um numero!!");
					}
				}
				
				System.out.print("Digite a quantidade: ");
				while (quanti == -1) {
					try {
						reader = new Scanner(System.in);
						subC = reader.nextLine();
						codgo =  Integer.parseInt(subC);
					}
					catch (Exception e) {
						System.out.println("Digitar um numero!!");
					}
				}
				
				gerProd.venderProduto(codgo, quanti);
				break;
				
			case "10":
					System.out.print("Digite o codigo: ");
				int codgo = -1837593, quanti = -1;
				while (codgo == -1837593) {
					try {
						reader = new Scanner(System.in);
						subC = reader.nextLine();
						codgo =  Integer.parseInt(subC);
					}
					catch (Exception e) {
						System.out.println("Digitar um numero!!");
					}
				}
				
				System.out.print("Digite a quantidade: ");
				while (quanti == -1) {
					try {
						reader = new Scanner(System.in);
						subC = reader.nextLine();
						codgo =  Integer.parseInt(subC);
					}
					catch (Exception e) {
						System.out.println("Digitar um numero!!");
					}
				}
				
				gerProd.venderProduto(codgo, quanti);
				break;
			}
			
			reader = new Scanner(System.in);
		}
	}

}
