import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
class graph2{
    
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public graph2(int v) {
        for(int i =0;i<v;i++){
            list.add(new ArrayList<Integer>());
        }
    }
    public static void addEdge(int u,int v){
        list.get(u).add(v);
        list.get(v).add(u);
    }
    public static void print(){
        for(int i=0;i< list.size();i++){
            System.out.println("Vertex : "+i);
            for(int j=0;j<list.get(i).size();j++){
                System.out.println(" "+list.get(i).get(j));
            }
        }
    }
    public static void bfs(int v){
        
        boolean[] visited=new boolean[list.size()];
        visited[v] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        while(q.size()!=0){
            int vertex=q.remove();
            System.out.println(vertex + " ");
            for(int i=0;i<list.get(vertex).size();i++){
                int av = list.get(vertex).get(i);
                if(!visited[av]){
                    q.add(av);                
                    visited[av]=true;
                }
            }
        }
    }
}
public class bfs {
    public static void main(String[] args) {
        graph2 g=new graph2(5);
        g.addEdge(0, 1);
        g.addEdge(2, 3);
        g.addEdge(1, 2);
        g.addEdge(3, 4);
        g.addEdge(0, 4);
        g.addEdge(1, 4);
        g.print();
        g.bfs(0);
    }
}
