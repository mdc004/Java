import javax.swing.JOptionPane;

public class car {    
    private String targa = "";
    private String marca = "";
    private String colore = "";
    private int cilindrata;
    public car(String targa){
        this.targa = targa;
        this.marca = JOptionPane.showInputDialog("Inserire la marca dell'auto");
        this.colore = JOptionPane.showInputDialog("Inserire il colore dell'auto");
        this.cilindrata = Integer.parseInt(JOptionPane.showInputDialog("Inserire la cilindrata dell'auto"));        
    }
    
    public void print(){
        JOptionPane.showMessageDialog(null, "targa:"+this.targa+"\nmarca: "+this.marca+"\ncolore: "+this.colore+"\ncilindrata: "+this.cilindrata);
    }

    public int getCilindrata() {
        return cilindrata;
    } 
}
