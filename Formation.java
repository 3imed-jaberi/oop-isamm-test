// PARTIE I 

public class Formation {

  // Question 1
  private String nom ;
  private int nombreHeures;

  // Question 4
  public Formation(String n , int nbH ){
      this.nom = n ;
      this.nombreHeures = nbH ;      
  }
  // Question 2
  public int getNombreHeures() {
          return nombreHeures;
  };
  // Question 3
  public void setNombreHeures(int nbH){
       this.nombreHeures = nbH ;     
  };
  // Question 5 
  public void afficheFormation(){
     System.out.println(nom);
  }
  // Question 6 
  public void reduireHeures(int h){
     this.nombreHeures = this.nombreHeures-h ;
  }
  // Question 7
  public void ajouterHeures(int h){
    this.nombreHeures = this.nombreHeures+h ;
  }
  // Question 8
  public Formation selectionFormation(Formation F){
      if ( this.nombreHeures > F.nombreHeures ){
                return this ;
      }else {
                return F ;
      }
  }
}