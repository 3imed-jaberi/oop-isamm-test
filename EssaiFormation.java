// PARTIE II

public class EssaiFormation {

    public static void main(String[] args) {
               // Question 1
               Formation F1 = new Formation(args[0],Integer.parseInt(args[1]));
               // Question 2 
               Formation F2 = new Formation("JAVA", 20);
               // Question 3
               System.out.println(F1.getNombreHeures());
               System.out.println(F2.getNombreHeures());
               // Question 4
                    //i 
                    F2.ajouterHeures(5);
                    // ii 
                    F1.reduireHeures(4);
               // Question 5 
               F1.selectionFormation(F2).afficheFormation();
    }
    
}
