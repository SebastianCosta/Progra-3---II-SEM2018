
package triptec.logic;

import triptec.structures.ControladorGrafo;



public class TouristSiteManager {
    private ControladorGrafo graph;

    public ControladorGrafo getGraph() {
        return graph;
    }

    public void setGraph(ControladorGrafo graph) {
        this.graph = graph;
    }

    

    public TouristSiteManager() {
        this.graph = new ControladorGrafo();
    }
    
    public void addPlace(String id_vertice, Place newPlace){
        graph.nuevoVertice(id_vertice, newPlace);
    }
    
    
}
