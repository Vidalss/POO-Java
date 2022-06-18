package conversion.archivos;

import java.io.*;
import java.util.ArrayList;

public class archivos {

    private ArrayList<String> contenidoArchivo = new ArrayList<>();
    private ArrayList<Conversion> listaEntrada = new ArrayList<>();
    private final String rutaWindows = "C:\\Users\\VidalPC.DESKTOP-K1HPANQ\\IdeaProjects\\convertidor\\src\\conversion\\archivos\\si.txt";

    public ArrayList<String> getContenidoArchivo() {
        return contenidoArchivo;
    }

    public ArrayList<Conversion> getListaEntrada() {
        return listaEntrada;
    }

    public void leerArchivo() {
        LeerArchivo leer = new LeerArchivo();
        this.contenidoArchivo =
                leer.leerArchivo(this.rutaWindows);
        for (int i=0; i < this.contenidoArchivo.size(); i++) {
            String linea = this.contenidoArchivo.get(i);
            String elementosLinea[] = linea.split("#");
            try {
                double metros = Double.parseDouble(elementosLinea[0]);
                double pies = Double.parseDouble(elementosLinea[1]);
                listaEntrada.add(new Conversion(pies, metros));
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
                listaEntrada.add(new Conversion(0,0));
            }
        }
    }

    public void escribirArchivo(ArrayList<Conversion> lista){
        String archivo = "resultados.txt";
        File f = new File(archivo);
        //Escritura
        try{
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            wr.write("");
            wr.append("Metros,Yardas,Millas,Pulgadas\n");
            for (int i=0; i < lista.size(); i++){
                wr.append(lista.get(i).getMetros() + ","
                + lista.get(i).getYardas() + ","
                + lista.get(i).getMillas() + ","
                + lista.get(i).getPulgadas() + "\n");
            }
            wr.close();
            bw.close();
        }catch(IOException e){

        }
    }

    public static void main(String args[]) {
        archivos prueba = new archivos();
        prueba.leerArchivo();
        for (int i=0; i < prueba.getListaEntrada().size(); i++) {
            System.out.println(prueba.getListaEntrada().get(i).getMetros() +
                    "\t" + prueba.getListaEntrada().get(i).getYardas() +
                    "\t" + prueba.getListaEntrada().get(i).getMillas() +
                    "\t" + prueba.getListaEntrada().get(i).getPulgadas());
        }
        prueba.escribirArchivo(prueba.getListaEntrada());
    }

}
