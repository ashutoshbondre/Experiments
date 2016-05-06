import java.util.LinkedList;



public class Route<Node> {

	class Graph
	{
		public Node nodes[];
		
		class Node
		{
			public String name;
			public Node children[];
			public String state;
		}
	}
	enum State {Unvisited,Visited,Visiting};
	boolean search(Graph g, Node start, Node end)
	{
		LinkedList<Node> q =new LinkedList<Node>();
		Node u;

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
