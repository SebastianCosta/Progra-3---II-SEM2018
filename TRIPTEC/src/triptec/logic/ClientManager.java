
package triptec.logic;

import java.util.LinkedList;
import java.util.List;
import triptec.structures.BinarySearchTree;

public class ClientManager {
    private BinarySearchTree<Client> clients;

    public BinarySearchTree<Client> getClients() {
        return clients;
    }

    public void setClients(BinarySearchTree<Client> clients) {
        this.clients = clients;
    }

    public ClientManager() {
        this.clients = new BinarySearchTree<Client>();
    }
    
    public void addClient(Client newClient){
        clients.insert(newClient.getID(), newClient);
    }
    public void deleteClient(Client client){
        clients.delete(client.getID());
    }

   
    
    

}
