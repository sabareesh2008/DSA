
import java.util.ArrayList;
class graphdfs{
   static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public graphdfs(int v) {
        for(int i =0;i<v;i++){
            list.add(new ArrayList<Integer>());
        }
    }
    public static void add(int u,int v){
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

    public static void dfs(int v){
        int V=list.size();
        boolean[] visit = new boolean[V];
        dfs2(v,visit);
    }
    public static void dfs2(int v,boolean[] visit){
        visit[v]=true;
        System.out.println(v+ " ");
        for(int i=0;i<list.get(v).size();i++){
            int av= list.get(v).get(i);
            if(!visit[av]){
                dfs2(av,visit);
            }
        }
    }
}
public class dfs{
    public static void main(String[] args) {
        graphdfs g=new graphdfs(5);
        g.add(0, 1);
        g.add(2, 3);
        g.add(1, 2);
        g.add(3, 4);
        g.add(0, 4);
        g.add(1, 4);
        g.dfs(0);
    }
}