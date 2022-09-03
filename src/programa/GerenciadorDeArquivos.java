/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Marcos Eduardo
 */
public class GerenciadorDeArquivos<T>{
    public ArrayList<T> lerArquivo(File arquivo) throws IOException, ClassNotFoundException{
        T obj;
        ArrayList<T> listaDeItens = new ArrayList<>();
        try (FileInputStream fi = new FileInputStream(arquivo); ObjectInputStream oi = new ObjectInputStream(fi)) {
            while (fi.available() >  0) {
                obj = (T) oi.readObject();
                listaDeItens.add(obj);
            }
            oi.close();
            fi.close();
            EscreverArquivo(listaDeItens, arquivo);
           return listaDeItens;
        } catch (IOException | ClassNotFoundException e) {
            throw e;
        }
    }
    
    public void EscreverArquivo(ArrayList<T> listaDeItens, File arquivo) throws IOException{
        try (FileOutputStream fs = new FileOutputStream(arquivo); ObjectOutputStream os = new ObjectOutputStream(fs)) {
            for (T obj : listaDeItens) {
                os.writeObject(obj);
            }
        } catch (IOException e) {
            throw e;
        }
    }
}
