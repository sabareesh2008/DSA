import java.util.*;
class graph1{
    
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public graph1(int v) {
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
}
public class graph{
    public static void main(String[] args) {
        graph1 g =new graph1(5);
        g.addEdge(0, 1);
        g.addEdge(2, 3);
        g.addEdge(1, 2);
        g.addEdge(3, 4);
        g.addEdge(0, 4);
        g.addEdge(1, 4);
        g.print();
        
    }
}