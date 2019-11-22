import java.util.*;

public class Judge{

    public static void main(String[] args){
        int N = 8; 
        Graph g = new Graph(N);
        int[][] trust = {{1,3},
                         {2,3},
                         {4,3},
                         {7,3},
                         {2,1},
                         {1,7},
                         {5,3},
                         {6,3}};


        for(int row = 0; row < trust.length; row++){
            g.addEdge(trust[row][0], trust[row][1]);
        }

        System.out.println("Judge: " + findJudge(7, trust));
    }

    public static int findJudge(int N, int[][] trust) {
        int[] candidates = new int[N+1];
        candidates[0] = -1;
        int count = 0; 

        for(int i = 0; i < trust.length; i++)
            candidates[trust[i][0]] = -1; 
            int candidate = -1;
        
        for(int i = 1; i < N; i++){
            if(candidates[i] == 0){
                candidate = i; 
                break;
            }
        }

        if(candidate == -1)
            return -1; 
       
        for(int i = 0; i < trust.length; i++){
            if(trust[i][1] == candidate)
                count++; 
        }
        
        if(count == N-1)
            return candidate; 
        
        
        return -1;
    }

    
}




