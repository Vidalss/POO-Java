package conversion.archivos;

import java.io.*;
import java.util.ArrayList;

public class LeerArchivo {
    private String linea;
    private ArrayList<String> lineasArchivo = new ArrayList<String>();

    public ArrayList<String> leerArchivo (String ruta){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File (ruta);
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            while((linea=br.readLine()) != null) {
                if (linea != "") {
                    lineasArchivo.add(linea);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta
            // una excepcion.
            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
        return lineasArchivo;
    }

    private void escribirArchivo(String archivo) {
        File f = new File(archivo);
        //Escritura
        try{
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            wr.write("");
            wr.append("Texto");
            wr.append("\n");
            wr.close();
            bw.close();
        }catch(IOException e){

        }
    }

    public static void main(String args[]){
        LeerArchivo leer = new LeerArchivo();

        System.out.println(leer.leerArchivo("C:\\Users\\VidalPC.DESKTOP-K1HPANQ\\IdeaProjects\\convertidor\\src\\conversion\\archivos\\si.txt"));

    }
}