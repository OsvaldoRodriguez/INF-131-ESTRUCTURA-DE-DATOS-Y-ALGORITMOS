import java.util.Scanner;


public class MatrizCuadradaCambiarFilaColumna {

	public static void main(String[] args) {
		Scanner lee=new Scanner(System.in);
		int n;
		n=lee.nextInt();
		int m[][]=new int[n+1][n+1];
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
				m[i][j]=lee.nextInt();

		int a=lee.nextInt();
		int b=lee.nextInt();
		cambiarR(m,n,a,b,1);
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
				System.out.print(m[i][j]+" ");
			System.out.println();
		}
		
		
	}
	
	public static void cambiar(int m[][],int n,int a,int b)
	{
		for(int i=1;i<=n;i++)
		{
			int aux=m[a][i];
			m[a][i]=m[i][b];
			m[i][b]=aux;
		}
	}
	
	public static void cambiarR(int m[][],int n,int a,int b,int i)
	{
		if(i<=n)
		{
			int aux=m[a][i];
			m[a][i]=m[i][b];
			m[i][b]=aux;
			i++;
			cambiarR(m,n,a,b,i);
		}
	}

}
