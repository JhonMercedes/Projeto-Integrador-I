import java.util.Scanner;


public class CalcIP {
	
    public static void menu(){
        System.out.println("\tCalculadora IP - Projeto Intregador ");
        System.out.println("1. Comparação de Ip's ");
        System.out.println("2. Identificação dos Endereços de Rede, Broadcast e IP's ");
        System.out.println("3. Cálculo de Sub-Rede ");
        System.out.println("4. Sair");
        System.out.println("Opcao:");
    }

    /**
     * 
     */
    public static void compara(){
    	
        System.out.println("Você entrou no método Compara IP.");
        Scanner leia = new Scanner(System.in);
		String ip,ip2,oct1, oct2, oct3, oct4, classeIP1, classeIP2;
		String[] octetos;
		String PrimeiroIP,SegundoIP;
		classeIP1 = "";
	    classeIP2 = "";
		
		System.out.print("Digite o primeiro IP :");
		ip = leia.next();
		System.out.println("-----------------------");
		octetos = ip.split("\\.");
		
		System.out.println("-----------------------");
		PrimeiroIP = octetos[0]+"."+octetos[1]+"."+octetos[2]+"."+octetos[3];
		System.out.println("Primeiro IP :"+PrimeiroIP);
		
		int oct1Int = Integer.parseInt(octetos[0]);
		int oct2Int = Integer.parseInt(octetos[1]);
		int oct3Int = Integer.parseInt(octetos[2]);
		int oct4Int = Integer.parseInt(octetos[3]);
		if (oct1Int >=0 && oct1Int <= 127) {
			classeIP1 = "Classe A";
			System.out.println(classeIP1);
			System.out.println("Máscara padrão: 255.0.0.0");
		
		}
		else if (oct1Int >= 128 && oct1Int <= 191) {
			classeIP1 = "Classe B";
			System.out.println(classeIP1);
			System.out.println("Máscara padrão: 255.255.0.0");
		}
		else if (oct1Int>=192 && oct1Int <= 223) {
			classeIP1 = "Classe C";
			System.out.println(classeIP1);
			System.out.println("Máscara padrão: 255.255.255.0");
		}
		else if (oct1Int >= 224 && oct1Int <= 239) {
			classeIP1 = "Classe D";
			System.out.println(classeIP1);
			System.out.println("Não possui máscara padrão");
		
		}
		else if (oct1Int >= 240 && oct1Int <= 255) {
			classeIP1 = "Classe E";
			System.out.println(classeIP1);
			System.out.println("Não possui máscara padrão");
		
		}
	   
		if ((oct1Int >= 0 && oct1Int <= 255) && (oct2Int >= 0 && oct2Int <= 255) && (oct3Int >= 0 && oct3Int <= 255) && (oct4Int >= 0 && oct4Int <= 255)) {
			System.out.print("IP1 Válido");
			System.out.println("  ");
		}
		else {
			System.out.println("IP1 Inválido");
			System.out.println("  ");
			return;
		}
		
		System.out.println("-----------------------");
		
		System.out.print("Digite o Segundo IP ");
		ip2 = leia.next();
		
		System.out.println("-----------------------");
		octetos = ip2.split("\\.");
		
		System.out.println("-----------------------");
		SegundoIP = octetos[0]+"."+octetos[1]+"."+octetos[2]+"."+octetos[3];
		System.out.println("Segundo IP :"+SegundoIP);
		
		int oct1Inte = Integer.parseInt(octetos[0]);
		int oct2Inte = Integer.parseInt(octetos[1]);
		int oct3Inte = Integer.parseInt(octetos[2]);
		int oct4Inte = Integer.parseInt(octetos[3]);
		
		if (oct1Inte >=0 && oct1Inte <= 127) {

			classeIP2 = "Classe A";
		System.out.println(classeIP2);
		System.out.println("Máscara padrão: 255.0.0.0");
		
		}
		else if (oct1Inte >= 128 && oct1Inte <= 191) {
			classeIP2 = "Classe B";
			System.out.println(classeIP2);
			System.out.println("Máscara padrão: 255.255.0.0");
		}
		else if (oct1Inte >=192 && oct1Inte <= 223) {
			classeIP2 = "Classe C";
			System.out.println(classeIP2);
			System.out.println("Máscara padrão: 255.255.255.0");
		}
		else if (oct1Inte >= 224 && oct1Inte <= 239) {
			classeIP2 = "Classe D";
			System.out.println(classeIP2);
			System.out.println("Não possui máscara padrão");
		
		}
		else if (oct1Inte >= 240 && oct1Inte <= 255) {
			classeIP2 = "Classe E";
			System.out.println(classeIP2);
			System.out.println("Não possui máscara padrão");
		
		}
		
		if ((oct1Inte >= 0 && oct1Inte <= 255) && (oct2Inte >= 0 && oct2Inte <= 255) && (oct3Inte >= 0 && oct3Inte <= 255) && (oct4Inte >= 0 && oct4Inte <= 255)) {
			System.out.print("IP2 Válido");
			System.out.println("  ");
		}
		else {
			System.out.println("IP2 Inválido");
			System.out.println("  ");
			return;
		}
		if (classeIP1 == classeIP2) {
        	System.out.println("Os dois IP's pertecem a mesma Classe !");
		} else  {
        	System.out.println("Os IP's não pertecem a mesma Classe !");
        
		}
		
		if (oct1Int == oct1Inte & oct2Int == oct2Inte & oct3Int == oct3Inte) {
		System.out.println("Fazem parte da mesma rede!");
		}else {
			System.out.println("Não fazem parte da mesma rede!");
		}
		System.out.println("   ");
    	System.out.println("   ");
        	
    }
    
    public static void identifica(){
        System.out.println("Você entrou no método Identificação.");
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite um endereço de IP: ");
        String IP = leia.next();
        String[] oct = IP.split("\\.");
		int oct1Int = Integer.parseInt(oct[0]);
		int oct2Int = Integer.parseInt(oct[1]);
		int oct3Int = Integer.parseInt(oct[2]);
		int oct4Int = Integer.parseInt(oct[3]);
		
		if ((oct1Int >= 0 && oct1Int <= 255) && (oct2Int >= 0 && oct2Int <= 255) && 
				(oct3Int >= 0 && oct3Int <= 255) && (oct4Int >= 0 && oct4Int <= 255)) {
		}
		else {
			System.out.println("IP1 Inválido");
			System.out.println("  ");
			return;
		}
		
		
		Scanner leia1= new Scanner (System.in);
		System.out.println("Informe a máscara do IP: ");
		String Masc = leia1.next();
		//String binIP, binMasc;
		String[] octM = Masc.split("\\.");	
		int octInt1 = Integer.parseInt(octM[0]);
		int octInt2 = Integer.parseInt(octM[1]);
		int octInt3 = Integer.parseInt(octM[2]);
		int octInt4 = Integer.parseInt(octM[3]);
		
		if ((octInt1 >= 000 && octInt1 <= 255) && (octInt2 >= 000 && octInt2 <= 255) && 
			(octInt3 >= 000 && octInt3 <= 255) && (octInt4 >= 000 && octInt4 <= 255)) {
			
		}
		else {
			System.out.println("Máscara Inválida");
			System.out.println("  ");
			return;
		}
		
		int restobin1, restobin2, restobin3, restobin4, bin1, bin2, bin3, bin4;
		bin1 = oct1Int;
		bin2 = oct2Int;
		bin3 = oct3Int;
		bin4 = oct4Int;
		String numerodiv1 = "", numerodiv2 = "", numerodiv3 = "", numerodiv4 = "";
		
		
		while (bin1 > 1) {
			restobin1 = bin1 % 2;
			bin1 = bin1/2;
			numerodiv1 = numerodiv1 + String.valueOf(restobin1);
			
		}
		numerodiv1 = numerodiv1 + String.valueOf(bin1);
		int invertida1 = Integer.parseInt (new StringBuilder(numerodiv1).reverse().toString());
		
		while (bin2 > 1) {
			restobin2 = bin2 % 2;
			bin2 = bin2/2;
			numerodiv2 = numerodiv2 + String.valueOf(restobin2);
		}
		numerodiv2 = numerodiv2 + String.valueOf(bin2);
		int invertida2 = Integer.parseInt (new StringBuilder(numerodiv2).reverse().toString());	
		
		while (bin3 > 1) {
			restobin3 = bin3 % 2;
			bin3 = bin3/2;
			numerodiv3 = numerodiv3 + String.valueOf(restobin3);
			}
		numerodiv3 = numerodiv3 + String.valueOf(bin3);
		int invertida3 = Integer.parseInt (new StringBuilder(numerodiv3).reverse().toString());
		
		while (bin4 > 1) {
			restobin4 = bin4 % 2;
			bin4 = bin4/2;
			numerodiv4 = numerodiv4 + String.valueOf(restobin4);
		}
		numerodiv4 = numerodiv4 + String.valueOf(bin4);
		int invertida4 = Integer.parseInt (new StringBuilder(numerodiv4).reverse().toString());
		
		System.out.println("IP em Binário : "+String.format("%08d",invertida1)+String.format("%08d",invertida2)+String.format("%08d",invertida3)+
				String.format("%08d",invertida4));
		
		int restomasc1, restomasc2, restomasc3, restomasc4, masc1, masc2, masc3, masc4;
		masc1 = octInt1;
		masc2 = octInt2;
		masc3 = octInt3;
		masc4 = octInt4;
		String numerodivmasc1 = "", numerodivmasc2 = "", numerodivmasc3 = "", numerodivmasc4 = "";
		
		while (masc1 > 1) {
			restomasc1 = masc1 % 2;
			masc1 = masc1/2;
			numerodivmasc1 = numerodivmasc1 + String.valueOf(restomasc1);
		}
			numerodivmasc1 = numerodivmasc1 + String.valueOf(masc1);
			int invertidamasc1 = Integer.parseInt (new StringBuilder (numerodivmasc1).reverse().toString());
			
		while (masc2 > 1) {
				restomasc2 = masc2 % 2;
				masc2 = masc2/2;
				numerodivmasc2 = numerodivmasc2 + String.valueOf(restomasc2);
			}
				numerodivmasc2 = numerodivmasc2 + String.valueOf(masc2);
				int invertidamasc2 = Integer.parseInt (new StringBuilder(numerodivmasc2).reverse().toString());
				
				while (masc3 > 1) {
					restomasc3 = masc3 % 2;
					masc3 = masc3/2;
					numerodivmasc3 = numerodivmasc3 + String.valueOf(restomasc3);
				}
					numerodivmasc3 = numerodivmasc3 + String.valueOf(masc3);
					int invertidamasc3 = Integer.parseInt (new StringBuilder (numerodivmasc3).reverse().toString());
					
					while (masc4 > 1) {
						restomasc4 = masc4 % 2;
						masc4 = masc4/2;
						numerodivmasc4 = numerodivmasc4 + String.valueOf(restomasc4);
					}
						numerodivmasc4 = numerodivmasc4 + String.valueOf(masc4);
						int invertidamasc4 = Integer.parseInt (new StringBuilder (numerodivmasc4).reverse().toString());
						System.out.println("Máscara em Binário :"+String.format("%08d",invertidamasc1)+String.format("%08d",invertidamasc2)
						+String.format("%08d",invertidamasc3)+String.format("%08d",invertidamasc4));
				
				String testeip = String.format("%08d", invertida1)+String.format("%08d", invertida2)+ String.format("%08d", invertida3)+String.format("%08d", invertida4);
				
				String testemask = String.format("%08d", invertidamasc1)+String.format("%08d", invertidamasc2)+String.format("%08d", invertidamasc3)+String.format("%08d", invertidamasc4);
				
				String ipRede = "";
				
				for (int i = 0; i < 32; i++) {
					if(testeip.substring(i, i+1).equals("1") && (testemask.substring(i, i + 1)).equals("1")) {
						ipRede += "1";
						
					}else {
						ipRede += "0";
					}
				}
		 System.out.print("Endereço de Rede :");
		 System.out.println(Integer.parseInt(ipRede.substring(0,8),2) + "." + Integer.parseInt(ipRede.substring(9,17),2) + "." +
		 Integer.parseInt(ipRede.substring(18,24),2) + "." + Integer.parseInt(ipRede.substring(25,32),2));
    }
    
    public static void calcula(){
        System.out.println("Você entrou no método Cálculo de Sub-Rede.");
        System.out.println("-----------------------------------------------");
        System.out.println(" ------Método está em Desenvovimento --------  ");
        System.out.println("-----------------------------------------------");
    	System.out.println("   ");
    }
    
    public static void sair () {
    	System.out.println("Você escolheu sair do programa de Cálculo de Ip's.");
    	System.out.println("   ");
    	System.out.println("   ");
    }
    
    public static void main(String[] args) {
        int opcao= 0;
        Scanner entrada = new Scanner(System.in);
        
        do{
            menu();
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 1:
                compara();
                break;
                
            case 2:
                identifica();
                break;
                
            case 3:
                calcula();
                break;
            
            case 4:
            	sair();
            	return;
     
            default:
                System.out.println("Opção invalida.");
            }
        
        }while (opcao != -1);
    	System.out.println("");
        	
    }   
    }
 
