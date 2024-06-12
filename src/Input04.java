import java.util.Scanner;

public class Input04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(Input04.class.getResourceAsStream("input04text.txt"));      
        
        // Pula a primeira linha
        sc.nextLine();
        // Imprime a segunda linha
        System.out.println(sc.nextLine());
        
        // Verifica se a linha atual contém "BlueBumper"
        String found = sc.findInLine("BlueBumper");
        System.out.println(found != null ? found : "BlueBumper não encontrado");
        
        // Lê as próximas duas posições numéricas como xPosition e yPosition
        int xPosition = sc.nextInt();
        int yPosition = sc.nextInt();
        
        // Imprime as posições
        System.out.println("X: " + xPosition + ", Y: " + yPosition);
        sc.close();
    }    
}