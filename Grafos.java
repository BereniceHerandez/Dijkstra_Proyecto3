/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author newbi
 */
public class Grafos {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.InterruptedException
     * @throws java.lang.CloneNotSupportedException
     */
    public static void main(String[] args) throws IOException, InterruptedException, CloneNotSupportedException {
        // TODO code application logic here
        /***************************ErdosRenyi***************************/
        ErdosRenyi er = new ErdosRenyi(50000,8,true);//vertexes, edges, sameVertexEdge
        er.grafoNoDirigido();
        er.exportGraphVizND();
        ArrayList<Vertex> vtxs = er.grafond.getVertexes();
        Dijkstra d = new Dijkstra(er.grafond);
        System.out.println("*******execute**********");
        d.execute(vtxs.get(0));
        System.out.println("*******END execute**********");
        d.exportGraphviz();
        
        /****************************BarabasiAlbert**************************/
     //   BarabasiAlbert ba = new BarabasiAlbert(5,8,false);//vertexes, d, sameVertexEdge
     //   ba.grafoNoDirigido();
     //   ba.exportGraphVizND();
     //   ArrayList<Vertex> vtxsba = ba.grafond.getVertexes();
     //   Dijkstra dba = new Dijkstra(ba.grafond);
     //   System.out.println("*******execute**********");
     //   dba.execute(vtxsba.get(0));
     //   System.out.println("*******END execute**********");
     //   dba.exportGraphviz();
        
      
    }
    
}
