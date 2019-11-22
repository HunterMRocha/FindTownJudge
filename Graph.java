import java.util.*; 

public class Graph{
  
    private int vCount; 
    private int eCount; 

    public ArrayList<Integer>[] adjacents; 

    //constructer for initializations
    public Graph(int vCount){
        this.vCount = vCount;
        this.eCount = eCount;
        adjacents = new ArrayList [vCount];
        
        for(int i = 0; i < vCount; i++){
            adjacents[i] = new ArrayList<Integer>();
        }
    }

    //adds edges
    public void addEdge(int src, int dest){
        adjacents[src].add(dest);
        eCount++; 
    }


 


}