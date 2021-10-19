/**
 * @author: Ing. Noé Vásquez Godínez
 * @email: noe-vg@outlook.com
 * @about: Clase para implementar Dijkstra's algorithm
 */
	import java.util.*;
	public class Dijkstra
	{
	 public  int distancia[] = new int[10];
	 public  int cost[][] = new int[10][10];
	 
	 public void calc(int n,int s)
	 {
	  int flag[] = new int[n+1];
	  int i,minpos=1,k,c,mínimo;
	  
	  for(i=1;i<=n;i++)
	  {  
		  flag[i]=0; 
		  this.distancia[i]=this.cost[s][i]; 
	  }
	  c=2;
	  while(c<=n)
	  {
	   mínimo=99;
	   for(k=1;k<=n;k++)
	   { 
			  if(this.distancia[k]<mínimo && flag[k]!=1)
		   {
			mínimo=this.distancia[i];
			minpos=k;
		   }
		  } 
				flag[minpos]=1;
		  c++;
		  for(k=1;k<=n;k++){
		   if(this.distancia[minpos]+this.cost[minpos][k] <  this.distancia[k] && flag[k]!=1 )
		   this.distancia[k]=this.distancia[minpos]+this.cost[minpos][k];
	   }   
	  } 
	  
	 }
	 public static void main(String args[])
	 {
	  int nodos,fuente,i,j;
	  Scanner in = new Scanner(System.in);
	  limpiar.cls();
	  System.out.println("Ingrese el numero de nodos\n");
	  nodos = in.nextInt();
	  Dijkstra d = new Dijkstra();
	  System.out.println("Ingrese los pesos de la matriz de costos: \n");
			for(i=1;i<=nodos;i++)
			  for(j=1;j<=nodos;j++)
			  {
				d.cost[i][j]=in.nextInt();
				if(d.cost[i][j]==0)
				  d.cost[i][j]=999;
			  }
	  System.out.println("Ingrese el vértice de origen:\n");
	  fuente=in.nextInt();
	  
	  d.calc(nodos,fuente);
	  System.out.println("El camino más corto desde la fuente \t"+fuente+"\t a todos los demás vértices son : \n");
			for(i=1;i<=nodos;i++)
			  if(i!=fuente)
	  System.out.println("fuente :"+fuente+"\t destino :"+i+"\t MinCost es :"+d.distancia[i]+"\t");
	System.out.println("Algoritmo basado en el Autor:Shravan C");
	System.out.println("Link de referencia:https://codispatch.blogspot.com/2015/12/java-program-implement-dijkstras-single-source-shortest-path-algorithm.html");
	System.out.println("Traducido y modificado por: Antonio Arellano");
	 }
	 } 