/**
 * base
 */
public class base {

    public static void main(String[] args) {
        
        String laletta = "ciliegina";
        Boolean Tia_ama_Laletta = true;
        Boolean Laletta_ama_Tia = true;
        String umore_Tia = "";
        String umore_Laletta = "come stai Laletta?";
        do{
            if(Laletta_ama_Tia == true) umore_Tia = "felicio";
            else umore_Tia = "triste : - (";

            if(umore_Tia.equals("felicio") == true)
                System.out.println("Tia riempie Laletta di bacini");
            else if(umore_Laletta.equals("felicia") != true)
                System.out.println("Tia fa solettico a Laletta");
        }
        while(Tia_ama_Laletta);
    }
}